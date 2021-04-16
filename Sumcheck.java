import java.io.*;
import java.util.*;
class Sumcheck
{
public static void main(String args[])
{
int num1,num2,num3,sum;
Scanner in=new Scanner(System.in);
System.out.print("Enter the num1:");
num1=in.nextInt();
System.out.print("Enter the num2:");
num2=in.nextInt();
System.out.print("Enter the num3:");
num3=in.nextInt();
sum=num1+num2;
System.out.println("The result is:"+checksum(sum,num3));
}
static boolean checksum(int s,int n)
{
return(s==n);
}
}
