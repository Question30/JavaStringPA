package JavaStringToken;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        scan.close();

        String[] myArr = s.split("[! ,?._'@]+");
        if(s.length() == 0){
            System.out.println("0");
        }else {
            System.out.println(myArr.length);
        }

        for(String str : myArr){
            System.out.println(str);
        }
    }
}
