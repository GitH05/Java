import java.util.Scanner;
public class PalindromePyramid
{
public static void main(String[] args)
{
int i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the pyramid");
int size = s.nextInt();
//implement row and column (outer loop and inner loop)
for(i=1;i<=size;i++)
{
//spaces
for(j=1;j<size-i;j++)
{
System.out.print(" ");
}
//print number
for(j=i;j>=1;j--)
{
System.out.print(j);
}
//print next-side:
for(j=2;j<=i;j++)
{
System.out.print(j);
}

//newline
System.out.println();
}

}
}