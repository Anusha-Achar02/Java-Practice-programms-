import java.util.Scanner;
class Program2 
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner (System.in);
    System.out.println("Enter the size of array");
    int[]arr = new int[scan.nextInt()];
    System.out.println("Enter the elements in array ");
    for(int i=0;i<=arr.length-1;i++)
    {
    	arr[i]=scan.nextInt();
    }
    System.out.println("The elements stored are:");
    for(int x:arr)
    {
    	System.out.println(x+5);
    }
  }  
}
