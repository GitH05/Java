//complete box-pattern
import java.util.Scanner;
public class BoxPattern
{
public static void main(String[] args)
{
int height;
int i,j;
Scanner s=new Scanner(System.in);
System.out.print("Enter the height of the box:");
height = s.nextInt();
for(i=1;i<=height;i++)
{
for(j=1;j<=height;j++)
{
System.out.print("@ ");
}
System.out.println();
}
}
}