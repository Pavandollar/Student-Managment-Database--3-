package SDBMS;

import java.util.Scanner;

import CustomizedException.InvalidChoiceException;

public class Solution 
{
	public static void main(String[] args) 
	{
	StudentManagmentSystem sms = new StudentManagmentSystemImpl();
	Scanner sc = new Scanner(System.in);
	
	while(true)
	{
		
		System.out.println("1.Add Student\n2.Display Student\n3.Display All Student\n4.Remove Student\n5.Remove All Student\n6.Update Student\n7.Count Student\n8.Sort Student");
     	int Choice = sc.nextInt();
	
	 switch(Choice)
	 {
	 case 1 : sms.addStudent();
	          System.out.println("Student added");
	          break;
	          
	 case 2 : sms.displayStudent();
	          System.out.println();
	          break;
	 case 3 : sms.displayAllStudents();
	         System.out.println();
	         break;
	 case 4 : sms.removeStudent();
	         System.out.println();
	         break;
	 case 5 : sms.removeAllStudent();
	         System.out.println();
	         break;
	 case 6 : sms.updateStudent();
	         System.out.println();
	         break;
	 case 7 : sms.countStudents();
	         System.out.println();
	         break;
	 case 8 : sms.sortStudents();
        	 System.out.println();
        	 break;
	  
	 default : 
		 try
		 {
			 throw new InvalidChoiceException("Kindly enter valid choice");
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
	sc.close();
	}
  }
}
