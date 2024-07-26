import java.util.Scanner;
class Bubble
{
public static void main(String[] args)
{
int size,i,j,temp;
long start=System.nanoTime();
System.out.println("\nEnter the size of elements: ");
Scanner s=new Scanner(System.in);
size=s.nextInt();
System.out.println("You can enter only "+size+" element:");

int a[]=new int[size];
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
System.out.println("\nThe elements are:");
for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}System.out.println("\n");
for(i=0;i<a.length;i++)
	{
	for(j=0;j<a.length-1;j++)
	{
	if(a[j]>a[j+1])
	{
	temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
	}
	}
	}
System.out.println("\nElements sorted through Bubble Sort:");
for(i=0;i<a.length;i++)
	{
	System.out.print(a[i]+" ");
	}
	System.out.println("\n");
	long duration=(System.nanoTime()-start)/1000000000;
	System.out.println("Time taken: "+duration+"s");
}
}