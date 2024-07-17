package JavaStringIntro;

public class Solution {
    public static void main(String[] args) {
        String A = "hello", B = "java";

        System.out.println(A.length() + B.length());

        if(A.compareTo(B) < 0){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) +
                " " + B.substring(0,1).toUpperCase() + B.substring(1));
    }
}
