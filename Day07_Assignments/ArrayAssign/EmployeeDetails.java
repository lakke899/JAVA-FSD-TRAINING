package ArrayAssign;
/*5. Write a program to input the following details:
i)Employee Name
ii)Employee Salary
iii)Employee Year of joining*/

import java.util.Scanner;
public class EmployeeDetails
{
	public static void main(String[] args)
	{
		int i=0;
		System.out.println("enter array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] empName = new String[size];
		int[] year = new int[size];
		int[] salary = new int[size];
		System.out.println("Enter all employees name");
		for( i=0;i<size;i++) {
			empName[i]=sc.next();
		}
		System.out.println("enter employee year of joining");
		for(i=0;i<size;i++) {
			year[i]=sc.nextInt();
		}
		System.out.println("enter employee salary");
		for(i=0;i<size;i++) {
			salary[i]=sc.nextInt();
		}
		for(i=0;i<size;i++) {
			System.out.print(empName[i]+" ");
			System.out.print(year[i]+" ");
			System.out.print(salary[i]+" ");
		}
		System.out.println();
		for(i=0;i<size;i++) {
			System.out.println(empName[i]+" joined in the year of "+year[i]+ " and earns salary per month is "+salary[i]);
		}
	}
}