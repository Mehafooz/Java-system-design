import java.util.*;


public class TakeInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Here we need to take the number from user. ");

        int x = sc.nextInt();

        System.out.println("here is the x you entered "+x );

        System.out.println("How to take the word ");

        String s = sc.next();

        System.out.println("Here is the word you entered. " + s);
          sc.nextLine();

        System.out.println("How to take the line");

      

        String ln = sc.nextLine();

        System.out.println("So this the line you entered. "+ ln);
    }
}