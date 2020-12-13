package servidorpassapalavra;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class Server {

    private static final int port = 8000;

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);

        while (serverSocket.isBound()) {
            System.out.println("WAITING FOR CONNECTION 💿");

            Socket clientSocket = serverSocket.accept();

            System.out.println("ACCEPTED CONNECTION FROM "
                    + clientSocket.getInetAddress().getHostName()
                    + ":" + clientSocket.getPort());

            BufferedReader socketReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            String message;
            ArrayList<String> messages = new ArrayList<>();

            while (clientSocket.isConnected()) {
                message = socketReader.readLine();

                if (message == null) {
                    break;
                }

                System.out.println("CLIENT SAYS: " + message);

                if (messages.size() == 1) {
                    messages.add(message);
                } else {
                    messages.add(randomSubstring(message));
                }
                for (String msgToSend : messages) {
                    System.out.println("Server says: " + msgToSend);
                    socketWriter.write(msgToSend + " ");
                }
                    socketWriter.newLine();
                socketWriter.flush();
            }

            socketReader.close();
            socketWriter.close();
            clientSocket.close();
        }

        serverSocket.close();
    }

    public static String randomSubstring(String text) {

        Random rand = new Random();
        int length = (int) (Math.floor(Math.random() * text.length() - 1) + 1);
        int randomNum = rand.nextInt(text.length() - length + 1);
        return text.substring(randomNum);
    }
}