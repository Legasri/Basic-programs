import java.io.*;
import java.util.Scanner;
class Amstrong
{
public static void main(String args[])
{
int num,temp,sum=0,power,rem;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number:");
num=in.nextInt();
temp=num;
while(temp!=0)
{
rem=temp%10;
power=rem*rem*rem;
sum=sum+power;
temp=temp/10;
}
if(sum==num)
{
System.out.println("The given num is amstrong");
}
else
{
System.out.println("The given num is not amstrong");
}
}
}