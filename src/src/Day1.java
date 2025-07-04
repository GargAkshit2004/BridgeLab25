package src;

//public class Day1{
//    public static void main(String[] args){
//        System.out.println("HIIIIIIIIIII");
//
//        int a=10;
//        int b=30;
//        int c=a+b;
//        char op =
//        System.out.println(c);
//
//        int d=a-b;
//        System.out.println(d);
//
//        int e=a/b;
//        System.out.println(e);
//
//        int f=a*b;
//        System.out.println(f);
//
//    }
//
//}




import java.util.*;
public class Day1 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter an operator (+,-,*./):");
        op = sc.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default: System.out.print("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}