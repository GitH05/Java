//Breaking the record
import java.util.*;
public class BreakRecord
{
public static void main(String[] args)
{
int i;
Scanner s=new Scanner(System.in);

System.out.print("\nEnter the score-size: ");
int size=s.nextInt();

System.out.print("Enter the scores: ");
int a[] = new int[size];

for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}

System.out.print("The scores are: ");
for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}

//finding max and min score count:
int max = a[0];
int min=a[0];
int bestscore =0;
int worstscore =0;

for(i=0;i<size;i++)
{
if(a[i]>max)
{bestscore++;
max=a[i];}

if(a[i]<min)
{
worstscore++;
min=a[i];
}
}
System.out.println("\nMaxScoreCount: "+bestscore+" \nMinScoreCount:"+worstscore);
}
}