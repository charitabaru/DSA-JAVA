package ConditionalAndLoops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int newNum = n;
        int reverse = 0;

        while(n >0){
            int temp = n % 10;
            reverse = reverse * 10 + temp;
            n /= 10;
        }
        if(reverse == newNum){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }


    }
}
