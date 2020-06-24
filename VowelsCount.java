import java.util.Scanner;

public class VowelsCount{

    public static void main(String[] args) {
        String str;
        int vowels = 0;
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter a string:");
        str = sc.nextLine();

        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
    
        }

        System.out.println("Vowels: " + vowels);
   
    }
}