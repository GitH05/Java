import java.util.*;
public class MinMaxSum
{
public static void MinMax(int arr[])
{
int min=arr[0];
int max=arr[0];
long Total =0;	
for(int i : arr)
{
Total += i;
if(i>max)
{
max = arr[i];
}
if(i<min)
{
min = arr[i];
}
}
System.out.println("MaxSum: "+(Total-min)+"\n"+"MinSum: "+(Total-max));
}
public static void main(String[] args)
{
int arr[] = {1,2,3,4,5};
MinMax(arr);
}
}