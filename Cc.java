/**
Count The number of words in CamelCase:
word: HeyJuly
count: 2

word:ClassMethodFunction
count:3
**/
import java.util.*;
public class Cc
{
public static void main(String[] args)
{
int count=0;
Scanner s= new Scanner(System.in);
String a = s.nextLine();
for(int i=0;i<a.length();i++)
{
char ch = a.charAt(i);
if(ch >= 'A' && ch <= 'Z')
{
count++;
}
}
count = count + 1;
System.out.println("Number of word: "+count);
}
}