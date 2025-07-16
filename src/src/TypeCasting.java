package src;
import java.util.*;

public class TypeCasting {
//    public static void main(String[] args) {
////        char c = 'A';
////        int i = c+1;
////        System.out.println((char)i);
//    }

        static void Swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
            int x = 10;
            int y = 20;
        Swap(x,y);
        System.out.println(x);
        //In Swap only copy of x,y variable is going.
        //In volatile memory copy of x,y is going.

    }
}
