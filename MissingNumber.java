//TotalSizeSum-ArraySum

import java.util.Scanner;
class MissingNumber
{
public static void main(String[] args)
{
int i,MissingN,size,ArraySum=0;
int nSum=0;
System.out.print("Enter the size of the array:");
Scanner s=new Scanner(System.in);
size=s.nextInt();
System.out.print("Enter the number in the range of  1 - "+size+":");

int a[]=new int[size];

for(i=0;i<size-1;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<size-1;i++)
{
System.out.print(a[i]+" ");
ArraySum +=a[i];
nSum=(size*(size+1))/2;
}


/*int missingNumber = -1;
for (int index = 0; index < numbers.length; index++) {
    if (numbers[index] != index + 1) {
        missingNumber = index + 1;
        break;
    }
}*/







System.out.println("\nNSum: "+nSum);
MissingN=Math.abs(nSum-ArraySum);
System.out.print("\nArraySum:"+ArraySum);
System.out.print("\nThe missing number is: "+MissingN);
}
}