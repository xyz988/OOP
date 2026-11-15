import java.util.Scanner;  
  
class Multidimensional  
{  
	public static void main(String args[])  
	{  
		Scanner sc = new Scanner(System.in);  
		int r1,c1,r2,c2;  
  
		System.out.println("Enter the first array r1 and c1");  
		r1= sc.nextInt();  
		c1=sc.nextInt();  
  
		System.out.println("Enter the Second array r1 and c1");  
		r2= sc.nextInt();  
		c2=sc.nextInt();  
  
		int a[][]= new int[r1][c1];  
		int b[][]= new int[r2][c2];  
  
		System.out.println("Enter first array elements");  
		for(int i=0; i<r1; i++)  
		{  
			for(int j=0; j<c1; j++)  
			{  
				a[i][j]=sc.nextInt();  
			}  
		}  
  
		System.out.println("Enter Second array elements");  
		for(int i=0; i<r2; i++)  
		{  
			for(int j=0; j<c2; j++)  
			{  
				b[i][j]=sc.nextInt();  
			}  
		}  
  
		// ================= SWITCH CASE =================  
  
		int choice;  
  
		System.out.println("\nEnter your choice:");  
		System.out.println("1. Addition");  
		System.out.println("2. Multiplication");  
		System.out.println("3. Transpose");  
		System.out.println("4. Row-wise and Column-wise Sum");  
  
		choice = sc.nextInt();  
  
		switch(choice)  
		{  
			// ================= ADDITION =================  
			case 1:  
  
				if(r1==r2 && c1==c2)  
				{  
					int c[][]= new int[r1][c1];

					for(int i=0; i<a.length; i++)  
					{  
						for(int j=0; j<a[i].length; j++)  
						{  
							c[i][j]=a[i][j]+b[i][j];  
						}  
					}  
  
					System.out.println("First array is:");  
					for(int i=0; i<a.length; i++)  
					{  
						for(int j=0; j<a[i].length; j++)  
						{  
							System.out.print(a[i][j]+"\t");  
						}  
						System.out.println();  
					}  
  
					System.out.println("Second array is:");  
					for(int i=0; i<b.length; i++)  
					{  
						for(int j=0; j<b[i].length; j++)  
						{  
							System.out.print(b[i][j]+"\t");  
						}  
						System.out.println();  
					}  
  
					System.out.println("Addition is:");  
					for(int i=0; i<c.length; i++)  
					{  
						for(int j=0; j<c[i].length; j++)  
						{  
							System.out.print(c[i][j]+"\t");  
						}  
						System.out.println();  
					}  
				}  
				else  
				{  
					System.out.println("Addition can not be possible");  
				}  
  
				break;  
  
  
			// ================= MULTIPLICATION =================  
			case 2:  
  
				if(c1!=r2)  
				{  
					System.out.println("Multiplication can not be possible!");  
				}  
				else  
				{  
					int c[][]= new int[r1][c2];

					for(int i=0; i<r1; i++)  
					{  
						for(int j=0; j<c2; j++)  
						{  
							for(int k=0;k<c1;k++)  
							{  
								c[i][j]+=a[i][k]*b[k][j];  
							}  
						}  
					}  
  
					System.out.println("Multiplication is:");  
  
					for(int i=0; i<c.length; i++)  
					{  
						for(int j=0; j<c[i].length; j++)  
						{  
							System.out.print(c[i][j]+"\t");  
						}  
						System.out.println();  
					}  
				}  
  
				break;  
  
  
			// ================= TRANSPOSE =================  
			case 3:  
  
				System.out.println("Transpose of First Matrix is:");  
  
				for(int i=0; i<c1; i++)  
				{  
					for(int j=0; j<r1; j++)  
					{  
						System.out.print(a[j][i]+"\t");  
					}  
					System.out.println();  
				}  
  
				System.out.println("\nTranspose of Second Matrix is:");  
  
				for(int i=0; i<c2; i++)  
				{  
					for(int j=0; j<r2; j++)  
					{  
						System.out.print(b[j][i]+"\t");  
					}  
					System.out.println();  
				}  
  
				break;  
  
  
			// ================= ROW & COLUMN SUM =================  
			case 4:  
  
				System.out.println("Row-wise Sum of First Matrix:");  
  
				for(int i=0; i<r1; i++)  
				{  
					int sum = 0;  
  
					for(int j=0; j<c1; j++)  
					{  
						sum = sum + a[i][j];  
					}  
  
					System.out.println("Row " + (i+1) + " = " + sum);  
				}  
  
				System.out.println("\nColumn-wise Sum of First Matrix:");  
  
				for(int j=0; j<c1; j++)  
				{  
					int sum = 0;  
  
					for(int i=0; i<r1; i++)  
					{  
						sum = sum + a[i][j];  
					}  
  
					System.out.println("Column " + (j+1) + " = " + sum);  
				}  
  
				break;  
  
  
			default:  
  
				System.out.println("Invalid choice!");  
  
		}  
	}  
}