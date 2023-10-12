import java.io.InputStreamReader;
import java.io.BufferedReader;

class EmailIDNameFinder {
    public static void main(String[] args) {

        //Read email ID from console input
        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
        try {
            String emailID = consoleInput.readLine();
            System.out.println(emailID);
        }
        catch (Exception e) {
            System.out.println("Email ID Missing.");
        }
    }
}