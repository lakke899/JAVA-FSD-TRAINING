package Encapsulation;

import java.util.Scanner;

//2.Write a program to implement Encapsulation.
class EncapsulationDemo{
    private int empId;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpId(){
        return empId;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        empId = newValue;
    }
}
public class EncapsulationAssign{
    public static void main(String args[]){
    	System.out.println("Enter employee Id");
        Scanner sc = new Scanner(System.in);
        int Id = sc.nextInt();
        System.out.println("enter employee Name");
        String Name = sc.next();
        System.out.println("enter employee age");
        int age = sc.nextInt();
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpName(Name);
        obj.setEmpAge(age);
        obj.setEmpSSN(Id);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee Id: " + obj.getEmpId());
        System.out.println("Employee Age: " + obj.getEmpAge());
        
        
    } 
}