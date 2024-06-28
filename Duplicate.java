import java.util.Scanner;
class Duplicate
{
public static void main(String[] args)
{
int size;
int i,j;

Scanner s=new Scanner(System.in);
System.out.print("Enter the size of the array:");
size=s.nextInt();
int a[] = new int[size];
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
System.out.println("The Element:");

for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}

for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
int d=a[i];
System.out.println("\nThe duplicate number is:"+d);
}
}
}

}
}