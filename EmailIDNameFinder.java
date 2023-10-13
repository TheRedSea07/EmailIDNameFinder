import java.io.InputStreamReader;
import java.net.URL;
import java.io.BufferedReader;

class EmailIDNameFinder {
    public static void main(String[] args) {

        //Read email ID from console input
        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
        try {
            String emailID = consoleInput.readLine();

            //Construct URL address
            URL webAddress = new URL("https", "www.southampton.ac.uk", "/people/" + emailID);

            System.out.println(webAddress);
        }
        catch (Exception e) {
            System.out.println("Email ID Missing.");
        }
    }
}