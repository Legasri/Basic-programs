import java.io.*;
import java.util.*;
class Compute
{
public static void main(String args[])
{
int num=0,sum=0,n;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number:");
n=in.nextInt();
for(int i=0;i<=2;i++)
{
num=num*10+n;
sum=sum+num;
}
System.out.println(sum);
}
}