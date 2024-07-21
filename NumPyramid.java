//pyramid pattern with increasing number:

import java.util.Scanner;
public class NumPyramid
{
public static void main(String[] args)
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the height of the Pyramid:");
n=s.nextInt();

for(i=0;i<=n;i++)
{
//first print the space "0_"
for(j=0;j<=n-i;j++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
//print the number and space:
System.out.print(i+" ");
}
//newLine
System.out.println();
}
}
}