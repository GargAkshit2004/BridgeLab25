package Pattern;
import java.util.*;




//Simple Rectangle
//public class Rectangle {
//    public static void main(String[] args) {
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println(" ");
//        }
//    }
//}



//Hallow Reactangle
public class Rectangle {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  q");
                }

            }
            System.out.println();
        }

    }
}
