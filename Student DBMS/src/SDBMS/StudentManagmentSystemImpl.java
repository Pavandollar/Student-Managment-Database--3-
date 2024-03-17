package SDBMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import CustomSorting.SortStudentById;
import CustomSorting.SortbyMarks;
import CustomSorting.Sortbyage;
import CustomSorting.sortbyname;
import CustomizedException.InvalidChoiceException;

public class StudentManagmentSystemImpl implements StudentManagmentSystem
{
Scanner sc = new Scanner(System.in);
String id = sc.next().toUpperCase();

Map <String,Student> m1 = new LinkedHashMap<String,Student>();


	@Override
	public void removeAllStudent() 
	{
		if(m1.size()!=0)
		{
			System.out.println("Available students Records"+m1.size());
			m1.clear();
			System.out.println("All students are been deleted");
		}
		else
		try {
			throw new Studentnotfoundexception("no students record do delete");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}

	@Override
	public void updateStudent() 
	{
		System.out.println("enter To update thier Details");
		String id = sc.next().toUpperCase();
		if(m1.containsKey(id))
		{
			Student std = m1.get(id);
			System.out.println("1:Update age\n2:update name\n3:update marks");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 : System.out.println("enter the age");
			          int age = sc.nextInt();
			          std.getAge();
			        System.out.println("age updated");
			       break;
			       
			case 2 : System.out.println("enter the name");
			         String name = sc.next();
			         std.setName(name);
			         System.out.println("name entered");
			         break;
			         
			case 3 : System.out.println("enter the marks");
			         int marks = sc.nextInt();
			         std.getMarks();
			         System.out.println();
			         break;
			         
			default : try
			{
				throw new InvalidChoiceException(id);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	      }
		}
		else
		try 
		{
		throw new Studentnotfoundexception (id+"is not found");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

	@Override
	public void countStudents() 
	{
	System.out.println(m1.size());
		
	}

	@Override
	public void sortStudents() 
	{
		Set<String> keys = m1.keySet();
		
		List <Student> l1 =new ArrayList<Student>();
	    
		for(String key : keys)
		{
			Student s = m1.get(key);
		    l1.add(s);//L1.ADD(M1.GET(KEY));
		}
		System.out.println("1:Sort by id\n2:Sort by age\n3:Sort by name");
		System.out.println("4:Sort by marks\nEnter choice");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1 : Collections.sort(l1, new SortStudentById());
			         for(Student s : l1)
			         {
			        	 System.out.println(s);
			         }
			         break;
		
		
			case 2 : Collections.sort(l1, new  Sortbyage());
			for(Student s1 : l1)
	         {
	        	 System.out.println(s1);
	         }
	         break;
		
	         
			case 3 : Collections.sort(l1, new  sortbyname());
			for(Student s2 : l1)
	         {
	        	 System.out.println(s2);
	         }
	         break;
		
			case 4 : Collections.sort(l1, new  SortbyMarks());
			for(Student s3 : l1)
	         {
	        	 System.out.println(s3);
	         }
	         break;
	         
	         default : try
				{
					throw new InvalidChoiceException(id);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
		}
	
	}

	@Override
	public void addStudent() 
	{
		int age = sc.nextInt();
		String name = sc.next();
		int marks = sc.nextInt();
		Student s1= new Student(age,name,marks);
		
		m1.put(s1.getId(), s1);
		System.out.println("Student id is"+s1.getId());
			
		
	}

	@Override
	public void displayStudent() 
	{
	System.out.println("Enter Student Id");
	String id = sc.next();
	if(m1.containsKey(id))
	{
		Student s = m1.get(id);
		System.out.println(s.getId());
		System.out.println(s.getAge());
		System.out.println(s.getName());
		System.out.println(s.getMarks());
	}
	else
	{
		try {
		throw new Studentnotfoundexception (id+"is not found");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
	}

	@Override
	public void displayAllStudents() 
	{
		System.out.println("Students details are as follows");
		
		Set<String> keys = m1.keySet();
		for(String key : keys)
		{
			Student obj = m1.get(key);
			System.out.println(obj);
		}
		
	}

	@Override
	public void removeStudent() 
	{
	System.out.println("ENter Id");	
	String id = sc.next().toUpperCase();
	if(m1.containsKey(id))
	{
		m1.remove(id);
		System.out.println(m1.get(id));
	}
	else
	try
	{
	throw new Studentnotfoundexception("Student with id");	
	}
	catch(Exception e) 
	{
		System.out.println(e.getMessage());
	}
	
	}


//private static void display(List<Student> l1)
{
//	for(Student s : l1)
//	{System.out.println(s);
//	}
//	
	}

@Override
public void gethighestmarks() 
{

}

@Override
public void getlowestmarks() 
{
	Set <String> keys = m1.keySet();
	List <Student> list = new ArrayList <Student>();
	for(String key : keys)
	{
		list.add(m1.get(key));
	}
	Collections.sort(list,new  SortbyMarks());
	System.out.println(list.get(0));
	
}
}
