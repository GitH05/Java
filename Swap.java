import java.util.Scanner;
public class Swap
{
public static int SwapNumber(int x, int y)
{
System.out.print("Using subtraction:");
if (x==y)
{
System.out.print(x+","+y);
}
else
{
x=x-y;
y=x+y;
x=y-x;
}
System.out.print(x+","+y);


System.out.print("\nUsing addition and subtraction:");
if (x==y)
{
System.out.print(x+","+y);
}
else
{
x=x+y;
y=x-y;
x=x-y;
}
System.out.print(x+","+y);


System.out.print("\nUsing XOR operator:");
if (x==y)
{
System.out.println(x+","+y);
}
else
{
x=x^y;
y=x^y;
x=y^x;
}
System.out.print(x+","+y);

return 1;
}

public static void main(String[] args)
{
int x,y;
Scanner s=new Scanner(System.in);
System.out.println("Swap number using multi methods");
System.out.println("Enter two numbers:");
x=s.nextInt();
y=s.nextInt(); 
SwapNumber(x,y);
}
}