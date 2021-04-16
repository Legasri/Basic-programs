import java.io.*;
import java.util.Scanner;
class Sumofdigi
{
public static void main(String args[])
{
int num,sum=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the num:");
num=in.nextInt();
while(num!=0)
{
sum=sum+num%10;
num=num/10;
}
System.out.println("The sum of digits is:"+sum);
}
}
