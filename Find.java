//Smallest number and biggest number;
import java.util.Scanner;
public class Find
{
public static void main(String[] args)
{
int i,j,size=5,count=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size  of the array: ");
size=s.nextInt();

int a[] = new int[size];
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
System.out.print("The element are:");
for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}
int max=a[0], min=a[0];
for(i=0;i<size;i++)
{
if(a[i]>max)
{ max=a[i];
i++;
System.out.println("\nMaximum: "+a[i]); 
}
}

for(i=0;i<size;i++)
{if(a[i]<min)
{min=a[i];
i++;
System.out.println("Minimum: "+a[i]); }}
}
}