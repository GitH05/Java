/*
Min-Max Sum Problem
integer array:[32,65,2,7,22]
Min-Sum: (4/5 elements):-[2+7+22+32]=63
Max-Sum:(4/5 elements):-[65+32+22+7]=126
*/
import java.util.*;
public class Min_Max_Sum
{
//MinMaxSum Function:
public static void MinMaxSum(int arr[],int size)
{
int i;
int min = arr[0];
int max = arr[0];
int Total = 0;

for(i=0;i<size;i++)
{
Total += arr[i];
if(arr[i] > max)
{
max = arr[i];
}
if(arr[i] < min)
{
min = arr[i];
}
}
System.out.println("\nMinSum:"+(Total-max)+"\n"+"MaxSum:"+(Total-min));
}

public static void main(String[] args)
{
int size,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of the array:");
size=s.nextInt();

int arr[] = new int[size];

System.out.print("\nEnter Array Elements:");
for(i=0;i<size;i++)
{
arr[i]=s.nextInt();
}
System.out.print("\nArray Element:");
for(i=0;i<size;i++)
{
System.out.print(arr[i]+" ");
}

MinMaxSum(arr,size);
}
}