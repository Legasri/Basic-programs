import java.io.*;
import java.util.Scanner;
class Findfactor
{
public static void main(String args[])
{
int num,count=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter the number:");
num=in.nextInt();
System.out.println("The factors of "+num+" are:");
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
System.out.println(i);
count++;
}
}
System.out.println("Number of factors of "+num+" is: "+count);
}
}