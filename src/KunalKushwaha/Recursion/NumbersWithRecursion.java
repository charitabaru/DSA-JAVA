package KunalKushwaha.Recursion;

public class NumbersWithRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive call
        //if you are calling a function again and again , you can treat it as a separate function call in stack;
        print(n+1);
    }
}
