/*
Array integer:
Finding ratio of the positive,negative and zero ratio:
*/
import java.util.*;
public class PlusMinus
{
//operation function:
public static void plusMinus(int arr[])
{
float positive=0;
float negative=0;
float zero=0;

for(int i=0;i<5;i++)
{
if(arr[i]>0)
{
positive++;
}
else if(arr[i]==0)
{
zero++;
}
else
{
negative++;
}
}
positive/=5;
negative/=5;
zero/=5;

System.out.println("Positive: "+positive);
System.out.println("Negatiive: "+negative);
System.out.println("Zero: "+zero);
}
public static void main(String[] args)
{
int arr[] = {1,5,-4,-7,0};
System.out.println("\nThe ratio of:");
plusMinus(arr);
}
}