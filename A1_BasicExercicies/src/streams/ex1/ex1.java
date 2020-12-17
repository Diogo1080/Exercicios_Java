package streams.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex1 {
    public static void main(String[] args) {
        FileOutputStream outputStream = null;
        FileInputStream inputStream;
        String str = "Hey there!";
        try {
            byte[] strToBytes = str.getBytes();
            byte[] buffer = new byte[10];
            int numberOfBytesRead = 0;
            int endOfFile = -1;

            outputStream = new FileOutputStream("MediumExercicies/src/streams/ex1/fileName.md");
            outputStream.write(strToBytes);
            outputStream.close();

            inputStream = new FileInputStream("MediumExercicies/src/streams/ex1/fileName.md");
            outputStream = new FileOutputStream("MediumExercicies/src/streams/ex1/filenameCopy.md");

            while (numberOfBytesRead != endOfFile) {
                outputStream.write(buffer, 0, numberOfBytesRead);
                numberOfBytesRead = inputStream.read(buffer);
            }

            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
