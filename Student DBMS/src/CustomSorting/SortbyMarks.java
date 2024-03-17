package CustomSorting;

import java.util.Comparator;

import SDBMS.Student;

public class SortbyMarks  implements Comparator<Student>  
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		
		return o1.getMarks()-o2.getMarks();
	}

}
