import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// SIMPLE WEB SERVER
// - Receive http requests
// - Implement only for *.html files
// - If / should respond with /index.html or respond with the requested file/path
// - Files should be on /resources/ folder
// request = "/index.html";
// path = "./resources" + request;

public class WebServer {
    private static final int PORT = 8000;
    private ServerSocket server;

    public void start() {
        try {
            server = new ServerSocket(PORT);
            while (server.isBound()) {
                try (Socket client = server.accept()) {
                    handleClient(client);
                }

                //stuff
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleClient(Socket client) throws IOException {
        System.out.println("Debug: got new client ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));

        String requestHeader = reader.readLine();
        String[] header = requestHeader.split(" ");

        String method = header[0];
        String path = header[1];
        String version = header[2];

        String accessLog = String.format("method %s, path %s, version %s",
                 method, path, version);
        System.out.println(accessLog);
        Path filePath = getFilePath(path);

        if (Files.exists(filePath)) {
            // file exist
            String contentType = guessContentType(filePath);
            sendResponse(client, "200 OK", contentType, Files.readAllBytes(filePath));
            System.out.println("Response Sent");
        } else {
            // 404
            byte[] notFoundContent = "<h1>Not found :(</h1>".getBytes();
            sendResponse(client, "404 Not Found", "text/html", notFoundContent);
        }
    }


    private static void sendResponse(Socket client, String status, String contentType, byte[] content) throws IOException {
        OutputStream clientOutput = client.getOutputStream();
        clientOutput.write(("HTTP/1.1 \r\n" + status).getBytes());
        clientOutput.write(("ContentType: " + contentType + "\r\n").getBytes());
        clientOutput.write("\r\n".getBytes());
        clientOutput.write(content);
        clientOutput.write("\r\n\r\n".getBytes());
        clientOutput.flush();
        client.close();
    }

    private String guessContentType(Path filePath) throws IOException {
        return Files.probeContentType(filePath);
    }

    private Path getFilePath(String path) {
        if ("/".equals(path)) {
            path = "/index.html";
        }

        return Paths.get("WebServer/src/resources", path);
    }

}

