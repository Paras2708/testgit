import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.net.HttpURLConnection;
public class abc2
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter URL:");
		String FILE_URL=sc.nextLine();
		
		int i = FILE_URL.lastIndexOf('.');
		int l=FILE_URL.length();
		String str=FILE_URL.substring(i,l);
		
		System.out.println("Enter the name with which you want to save the file:");
		String str1=sc.nextLine();
		
		System.out.println("Enter a valid path:");
		String FILE_NAME = sc.nextLine();
		
		boolean flag = false;
		
		FILE_NAME=FILE_NAME+"/"+str1+str;
		File stockFile=new File(FILE_NAME);
		
		try
		{
			flag=stockFile.createNewFile();
		}
		catch(IOException ioe)
		{
			System.out.println("Error while Creating File in Java" + ioe);
		}
		if (FILE_URL != null) 
		{
        		try 
			{
            			URL url = new URL(FILE_URL);
            			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            			int filesize = connection.getContentLength();
				int totalDataRead = 0;
				int Percent=0;
				try(BufferedInputStream in=new BufferedInputStream(new URL(FILE_URL).openStream());
				FileOutputStream fileOutputStream=new FileOutputStream(FILE_NAME))
				{
					byte dataBuffer[]=new byte[1024];
					int bytesRead;
					while((bytesRead=in.read(dataBuffer,0,1024))!=-1)
					{
						totalDataRead = totalDataRead + bytesRead;
                        			fileOutputStream.write(dataBuffer,0,bytesRead);
						Percent = (totalDataRead * 100) / filesize;
                        			System.out.print("Downloading Percent : " + Percent +"% \r");
	
					}
					if(Percent==100)
						System.out.println("\nSuccessfully Downloaded!!!!");
					
				}
				catch(IOException e)
				{
					System.out.println("OOPS!!SOMETHING WENT WRONG!!!!");
				}
			}
			catch(IOException e)
				{
					System.out.println(e);
				}
		}
		else{
     		   System.out.println("Empty args !");
    }
	}
}