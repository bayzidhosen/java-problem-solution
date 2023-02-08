import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input first number");
            int a = scanner.nextInt();
            System.out.println("Input second number");
            int b = scanner.nextInt();
            System.out.println(a + b);
//        System.out.println("What is your name");
//        String name =scanner.next();
//        System.out.println("your name is" + name);
        } catch (Exception exception) {
            System.out.println("you can not  input character");
        }
    }
}


