import java.util.Scanner;
	public class Array2
	{
        public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	int i,n,j;
	System.out.println("Enter the size of arrray");
	n=sc.nextInt(); 
	int a[] = new int[n];
	for(i=0;i<n;i++)
	{
	System.out.println("Enter the values");
	a[i]=sc.nextInt();
	}
	System.out.println("The array is:");
	for(i=0;i<n;i++)
	{
	System.out.println(a[i]);
	}
    int maxCount = 0;  
    int index = -1; 
    for( i = 0; i < n; i++) 
    { 
        int count = 0; 
        for( j = 0; j < n; j++) 
        { 
            if(a[i] == a[j]) 
            count++; 
        }
        if(count > maxCount) 
        { 
            maxCount = count; 
            index = i; 
        } 
    } 
        
    if (maxCount > n/2) 
    System.out.println("the maxcountis:" +maxCount);
      
    else
    System.out.println("no majority element");
} 
}