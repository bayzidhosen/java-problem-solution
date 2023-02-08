import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a char");
        char letter=scanner.next().charAt(0);

        if (letter>='a'&& letter<='z'){
            System.out.println("Smallm Letter");
        }
        else  if(letter>='A'&& letter<='Z'){
            System.out.println("Cap letter");
        }

        else{
            System.out.println("Special char");
            }
        }

    }


