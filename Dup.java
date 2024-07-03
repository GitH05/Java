import java.util.Scanner;
public class Dup
{
public static void main(String[] args)
{
int i,j,count=1;
String a;
Scanner s=new Scanner(System.in);
System.out.println("Enter any Characters:");
a=s.nextLine();

//assign an array  for the string traverse: using 'toCharArray()'
char[] carray = a.toCharArray();

for(i=0;i<a.length();i++)
{
for(j=i+1;j<a.length();j++)
{
if(carray[i]==carray[j])
{
count++;
System.out.print("duplicate:"+carray[j] + " "+"count:"+count);
}
}
}

}
}