import java.io.*;
import java.util.*;
class RightmostNumCheck
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
System.out.println("The result is:"+checknum(num1,num2,num3));
}
static boolean checknum(int n1,int n2,int n3)
{
return(n1%10==n2%10||n2%10==n3%10||n3%10==n1%10);
}
}