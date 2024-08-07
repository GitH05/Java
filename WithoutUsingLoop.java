import java.util.Scanner;

class WithoutUsingLoop
{
public static void main(String[] args)
{

System.out.println("Printing numbers without using loops:");
int a,b;

Scanner s=new Scanner(System.in);
System.out.println("\nEnter the range between two numbers:");
a=s.nextInt();
b=s.nextInt();

System.out.println("The numbers between "+a+" and "+b+" are:");
printa(a,b);
}
public static void printa(int a ,int b)
{
if(a<=b)
{
System.out.println(a);
a++;
printa(a,b);
}
}
}