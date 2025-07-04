package src;

//public class C1 {
//    public static void main(String[] args) {
//        int[] arr= {2,7,9,11};
//        int[] num = new int[2];
//        int sum = 0;
//        int target = 20;
//        int i;
//        int j;
//        int k;
//        for(i=0; i<arr.length;i++){
//            for(j=i+1; j<arr.length;j++){
//                if(arr[i] + arr[j] == target){
//                    return num[]{i,j};
//
//
//                    num[k++]= i;
//                    num[k++] = j;
//                    return num;
//                }
//
//            }
//        }
//
//    }
//}

import java.util.*;

public class C1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature25");
        int deg = in.nextInt();
        if(deg>=40){
            System.out.println("Temp is Hot");
        }
        else if(deg>=20 && deg<=30){
            System.out.println("temp is Normal");
        }
        else{
            System.out.println("Temp is Cold");
        }

        int a = 10;
        System.out.println(a++ + ++a + a++);
    }
}