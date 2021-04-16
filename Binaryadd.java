import java.io.*;
import java.util.*;
class Binaryadd
{
public static void main(String args[])
{
int num1,num2;
int binary1,binary2;
int sum=0,carry=0;
int arr[]=new int[10];
Scanner in=new Scanner(System.in);
System.out.println("Enter the binary num1");
num1=in.nextInt();
System.out.println("Enter the binary num2");
num2=in.nextInt();
for(int j=arr.length-1;j>=0;j--)
{
binary1=num1%10;
binary2=num2%10;
sum=binary1+binary2+carry;
num1=num1/10;
num2=num2/10;
if(sum==0)
{
arr[j]=0;
carry=0;
}
else if(sum==1)
{
arr[j]=1;
carry=0;
}
else if(sum==2)
{
arr[j]=0;
carry=1;
}
else if(sum==3)
{
arr[j]=1;
carry=1;
}
}
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]);
}
}
}