package CustomSorting;

import java.util.Comparator;

import SDBMS.Student;

public class Sortbyage implements Comparator<Student> 
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

}
