import java.util.Scanner;

public class Driver {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text then press enter: ");
        String input = sc.nextLine();
        
        input = input.replaceAll("[^A-z]","").toLowerCase();
        
        System.out.println(input);

    }

}