package ArrayAssign;

import java.util.Scanner;

public class EmpDetailsEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter thr Size");
        n = sc.nextInt();
        String[] name = new String[n];
        double[] salary = new double[n];
        int [] Join = new int[n];
        System.out.println("Enter the\nName\nSalary\nDate of joining");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter detals no "+(i+1));
            name[i] = sc.next();
            salary[i]= sc.nextDouble();
            Join[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println("NAME\t: "+name[i]);
            System.out.println("SALARY\t: "+salary[i]);
            System.out.println("JOINING\t:"+Join[i]);
            System.out.println("*******************");

        }
    }

}
