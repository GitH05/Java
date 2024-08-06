import java.util.Scanner;
public class MirrorMatrix
{
public static void main(String[] args)
{
int i,j,size;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of the matrix:");
size=s.nextInt();
System.out.print("The size of the matrix is:"+size);
int a[][]=new int[2][2];
System.out.print("\nThe elements of the matrix:");
for(i=0;i<=1;i++)
{
for(j=0;j<=1;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("The matrix is:");
for(i=0;i<=1;i++)
	{
	for(j=0;j<=1;j++)
	{
	System.out.print(a[i][j]+" ");
	}
	System.out.print("\n");
	}	
System.out.println("The mirror matrix is:");
for(i=0;i<=1;i++)
	{
	for(j=1;j>=0;j--)
	{
	System.out.print(a[i][j]+" ");
	}
	System.out.print("\n");
	}
}
}
