import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12346;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in))) {

            new Thread(new IncomingMessageHandler(in)).start();

            String userInput;
            while ((userInput = consoleInput.readLine()) != null) {
                out.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class IncomingMessageHandler implements Runnable {
        private BufferedReader in;

        public IncomingMessageHandler(BufferedReader in) {
            this.in = in;
        }

        public void run() {
            try {
                String message;
                while ((message = in.readLine()) != null) {
                    // System.out.println(message);
                    // Send a response back to the client
                    
                String response = "Server: " + message;
                // String response;
                switch (message) {
                    case "hello":
                        response = "Server: Hello back to you!";
                        break;
                    case "goodbye":
                        response = "Server: Goodbye, see you later!";
                        break;
                    default:
                        response = "Server: I didn't understand that.";// here we can write any response we want from the serever or form any user 
                        break;
                }
                System.out.println(response);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

