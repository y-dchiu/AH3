package AH3;
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        input.close();
        fizzBuzz(n);
        System.out.println();
        System.out.print(fizzBuzzRecursive(n));
    }

    public static void fizzBuzz(int n){
        for (int i=1;i<=n;i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.print("FizzBuzz" + " ");
            }
            else if(i%3 == 0){
                System.out.print("Fizz" + " ");
            }
            else if(i%5 == 0){
                System.out.print("Buzz" + " ");
            }
            else{
                System.out.print(i + " ");
            }
        }
    }

    public static String fizzBuzzRecursive(int n){
        if (n==1){
            return n + " ";
        }
        
        if(n%3 == 0 && n%5 == 0) return fizzBuzzRecursive(n-1) + "FizzBuzz ";
        
        else if(n%3 == 0) return fizzBuzzRecursive(n-1) + "Fizz ";
        
        else if(n%5 == 0) return fizzBuzzRecursive(n-1) + "Buzz ";
        
        else return fizzBuzzRecursive(n-1) + n + " ";
    }
}
