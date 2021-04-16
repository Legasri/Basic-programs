import java.io.*;
import java.util.*;
class Checkbinary
{
public static void main(String arrgs[])
{
int bin,num,key=0;
int arr[]=new int[10];
Scanner in=new Scanner(System.in);
System.out.println("Enter the num");
num=in.nextInt();
for(int i=arr.length-1;i>=0;i--)
{
bin=num%10;
num=num/10;
if(bin<=1)
continue;
else 
{
++key;
break;
}
}
if(key>0)
System.out.println("The num is not binary");
else
System.out.println("The num is binary");
}
}