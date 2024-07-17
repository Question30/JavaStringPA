import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();

        char ch;
        String newString = "";

        for(int i = 0; i < A.length(); i++){
            ch = A.charAt(i);
            newString = ch + newString;
        }

        if(A.equals(newString)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
