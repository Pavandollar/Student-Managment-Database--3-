package SDBMS;

public class Employee 
{
String id;
String name;
static int count = 101;//102
public Employee(String name) 
{
    this.id="jsp"+count;
	this.name = name;
     count++;


}
public static void main(String[] args) 
{
Employee e1 = new Employee("tom");	
System.out.println("Id : "+e1.id+" Name : "+e1.name);

Employee e2 = new Employee("Jack");
System.out.println("Id : "+e2.id+" Name : "+e2.name);


}


}
