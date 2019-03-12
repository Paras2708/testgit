import java.util.Scanner;
import java.nio.file.*;
import java.net.URL; 
class NameValidator{
	boolean nameValidator(String url1)
    {
		boolean b=false;
		try 
        {
			//URL IS BEING VALIDATED. 
            new URL(url1).toURI(); 
            b=true; 
		} 
          
		// If there was an Exception 
		// while creating URL object 
		catch (Exception e)
		{ 
            b=false; 
		}
		b=emptyUrlName(url1);
		if(b==true)
			return false;
		else
			return true;
	}

	
	
	
	boolean emptyUrlName(String urlName){
		if (urlName==""){
			return true;
		}
		else{
			return false;
		}
	}
	
}
class NameValidator1
{
	boolean isvalid(String path)
	{
		boolean b=false;
		try
		{
			Paths.get(path);
		}
		catch(InvalidPathException|NullPointerException ex)
		{
			return false;
		}
		if(b==true)
			return false;
		b=emptyFileName(path);
		if(b==true)
			return false;
		
	}
	boolean emptyFileName(String filename){
		if (filename==""){
			return true;
		}
		else{
			return false;
		}
	}

}

	
		

	
class EmptyFileNameException extends Exception{
	EmptyFileNameException(String s){
		super(s);
	}
}

class testnamevalidator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String FILE_URL;
        // THE URL IS BEING ENETERED BY THE USER.
		System.out.println("Enter the url:");
		FILE_URL=sc.nextLine();
		NameValidator nvObject = new NameValidator();
		
		//nvObject.nameValidator(FILE_URL);
		
		boolean checkValidator = nvObject.nameValidator(FILE_URL);
		System.out.println(checkValidator);
		NameValidator1 nvObject1 = new NameValidator1();
        // THE PATH OF THE OBJECT IS  BEING ENTERED BY THE USER.
		System.out.println("Enter the path");
		String FILE_NAME;
        // PATH IS BEING SCANNED
		FILE_NAME=sc.nextLine();
		boolean checkValidator1=nvObject1.isvalid(FILE_NAME);
		System.out.println(checkValidator1);

	}
}

