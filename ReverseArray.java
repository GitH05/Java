/*reverse array:
constant space: O(1)
*/
import java.util.Scanner;
public class ReverseArray
{
public static void main(String[] args)
{
int i,size,temp;
Scanner s=new Scanner(System.in);
System.out.print("\nEnter the size of the array:");
size = s.nextInt();

//array initialization:
int a[] = new int[size];

//inserting array element
System.out.print("Enter the array element: ");
for(i=0;i<size;i++)
{
a[i] = s.nextInt();
}

//display array
System.out.print("The array:");
for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}

//now reverse logic
System.out.print("\nThe reverse array: ");
for(i=0;i<size/2;i++)
{
temp = a[i];
a[i] = a[size-i-1];
a[size-i-1] = temp;
}

//display reverse array:
for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}

}
}