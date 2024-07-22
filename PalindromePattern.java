//palindrome pattern
import java.util.Scanner;
public class PalindromePattern
{
public static void main(String[] args)
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the height of the Palindromepyramid");
n=s.nextInt();

for(i=1;i<=n;i++)
{
for(j=1;j<=n-i;j++)
{
System.out.print(" ");
}

for(j=i;j>=1;j--)
{
System.out.print(j);
}

for(j=2;j<=i;j++)
{
System.out.print(j);
}
System.out.print("\n");
}
//reverse
for(i=n;i>=1;i--)
{
for(j=1;j<=n-i;j++)
{
System.out.print(" ");
}

for(j=i;j>=1;j--)
{
System.out.print(j);
}

for(j=2;j<=i;j++)
{
System.out.print(j);
}
System.out.print("\n");
}


}
}