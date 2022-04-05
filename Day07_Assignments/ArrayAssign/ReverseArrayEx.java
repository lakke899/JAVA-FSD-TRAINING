package ArrayAssign;

import java.util.Scanner;

public class ReverseArrayEx {
    public static void main(String[]args) {
        int size, i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        size = sc.nextInt();
        String arr[] = new String[size];
        System.out.println("Enter the Elements (String)");
        for (i = 0; i < size; i++) {
            arr[i] = sc.next();
        }
        String D_arr[]=new String[size];


            int j=size-1;
            for(i=0;i<size;i++){

                D_arr[i]=arr[j];
                j--;
            }
            System.out.println("reverse aarray is");

        for (i=0;i<size;i++) {
            System.out.print(D_arr[i]+",");
        }
    }
}
