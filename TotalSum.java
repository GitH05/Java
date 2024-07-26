/**
Total Sum:
a=[1,5,8,22,8,0]
totalSum=44
**/
import java.util.Scanner;
public class TotalSum
{
public static void main(String[] args)
{
int size,i;
int totalSum = 0;
Scanner s = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
size = s.nextInt();
int arr[] = new int[size];
for(i=0;i<size;i++)
{
arr[i] = s.nextInt();
}
System.out.print("The elements are: ");
for(i=0;i<size;i++)
{
System.out.print(arr[i]+" ");
}
//for total sum
for(i=0;i<size;i++)
{
totalSum = totalSum + arr[i];
}
System.out.print("\nTotalSum: "+totalSum);
}
}