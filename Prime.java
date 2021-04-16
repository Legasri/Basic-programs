import java.io.*;
import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
int num,temp=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter the num:");
num=in.nextInt();
if(num==0||num==1)
{
temp=temp+1;
}
else
{
for(int i=2;i<num;i++)
{
if(num%i==0)
temp++;
}
}
if(temp==0)
System.out.println("Prime");
else
System.out.println("Not Prime");
}
}
