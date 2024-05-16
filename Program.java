import java.util.Scanner;
 class Program 
 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of an array");
		int[]arr = new int[scan.nextInt()];
		System.out.println("Enter the values to be stored in the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Elements of array before replacing");
		for(int x : arr)
		{
			System.out.print(x + "  ");
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if (arr[i]<0)
			{
				arr[i]=0;
			}
		}
		System.out.println();
		System.out.println("Elements of array after replacing");
		for(int x : arr)
		{
			System.out.print(x + "  ");
		}
         
	}

}
