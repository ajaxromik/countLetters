import java.util.HashMap;
import java.util.Scanner;

public class Driver {
    // Counts english letters in any line of input but ends at an EOF marker

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text then press enter: ");
        String input = "";
        try {
            while (sc.hasNextLine()) {
                input += sc.nextLine();
            }
        } finally {
            sc.close();
        }
        
        input = input.replaceAll("[^A-z]","").toLowerCase(); //reduces to the necessary letters
        
        HashMap<Character, Integer> letterMap = new HashMap<>();
        // System.out.println(input);
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(letterMap.containsKey(c)){
                letterMap.put(c, letterMap.get(c) + 1);
            } else {
                letterMap.put(c, 1);
            }
        }
        System.out.println(letterMap);

    }

}