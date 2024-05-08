import java.util.Scanner;
class Program1 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of schools,classes and students");
		int[][][]arr = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr.length-1;j++)
			{
				for (int k=0;k<=arr.length-1;k++)
				{
					System.out.println("Enter the marks of school:"+(i+1)+"class:"+(j+1)+"students"+(k+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr.length-1;j++)
			{
				for (int k=0;k<=arr.length-1;k++)
				{
					System.out.println(arr[i][j][k]+" ");
				}
				System.out.println();
	            }
			    System.out.println();
		}
	}
}
