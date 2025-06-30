package src;
import java.util.*;
public class Day2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        Basic Calculator
//        System.out.println("Enter the First Value : A");
//        int a = in.nextInt();
//        System.out.println("Enter the First Value : B");
//        int b = in.nextInt();
//        int c = a + b;
//        int d = a - b;
//        int e = a * b;
//        int f = a % b;
//        System.out.println("Addition -> A + B :" + c);
//        System.out.println("Subtraction -> A - B :" + d);
//        System.out.println("Multiplication -> A * B :" + e);
//        System.out.println("Division -> A / B :" + f);



//        Celcius to Farenheit
        System.out.println("Enter the temperature in C :");
        int x = in.nextInt();
        float y = (float) ((x * 1.8) + 32);
        System.out.println("Temperature in C: "+x+"Into farenheit->"+y);


    }

}