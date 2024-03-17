package SDBMS;

public class Studentnotfoundexception extends RuntimeException
{
	private String message;

	public Studentnotfoundexception (String message) 
	{
		
		this.message = message;
	}
	public String getMessage() 
	{
		return message;
	}

}