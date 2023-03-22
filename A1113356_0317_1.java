import java.util.Scanner;

public class A1113356_0317_1
{
	public static void main(String[]argv)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入n值");
		int n = sc.nextInt();
		System.out.println("輸入m值");
		int m = sc.nextInt();

		int[][] a = new int[n][m]; 

		for(int i = 1 ; i <= n ; i++)
		{
			for(int j = 1 ; j <= m ; j++)
			{
				int k = i * j;
				a[i-1][j-1] = k;
			}
		}

		for(int[] x : a)
		{
			for(int d : x)
			{
				System.out.print(d+"\t");
			}
		System.out.print("\n");
		}
	}
}	