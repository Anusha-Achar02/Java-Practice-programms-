import java.util.Scanner;
 class Program1 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the sixe of the array ");
		int[]arr = new int[scan.nextInt()];
		System.out.println("Enter the values to be stored in the array ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		int res=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			res += arr[i];
		}
		System.out.println("Addition result is :"+res);
				
	}

}
