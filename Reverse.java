import java.io.*;
import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
int num,temp,rev=0,rem;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number");
num=in.nextInt();
temp=num;
while(temp!=0)
{
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
System.out.println("The reverese of "+num+"="+rev);
}
}