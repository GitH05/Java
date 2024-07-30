/*Staircase hacker rank problem:
    #
   ##
  ###
 ####
#####
*/
import java.util.Scanner;
public class Staircase
{
public static void main(String[] args)
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the height of the Stair: ");
n = s.nextInt();
for(i=0;i<=n;i++)
{
//first print the space
for(j=1;j<=n-i;j++)
{
System.out.print(" ");
}
//print the stair
for(j=1;j<=i;j++)
{
System.out.print("#");
}
//new line
System.out.println();
}
}
}