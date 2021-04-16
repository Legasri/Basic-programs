import java.io.*;
import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
int sum=0,i,num;
Scanner in=new Scanner(System.in);
System.out.println("Enter the num");
num=in.nextInt();
for(i=1;i<=num;i++)
{
sum=sum+i;
}
System.out.println("The sum first "+num+" numbers="+sum);
}
}