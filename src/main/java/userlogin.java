import java.util.Scanner;

public class userlogin {
    public static void main(String[] args) {
        String _USERNAME="admin";
        String _PASSWORD="2345";


        Scanner scanner =new Scanner(System.in);
        System.out.println("Input your username");
        String username=scanner.next();
        System.out.println("Input your password");
        String password=scanner.next();

        if(_USERNAME.equals(username) &&_PASSWORD.equals(password)){
            System.out.println("Login successful");

        }
        else{
            System.out.println("Login failed");
        }


    }
}
