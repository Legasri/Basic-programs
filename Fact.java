import java.io.*;
import java.util.Scanner;
class Fact
{
public static void main(String args[])
{
int num,fact=1;
Scanner in=new Scanner(System.in);
System.out.println("Enter the num:");
num=in.nextInt();
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println(num+"!="+fact);
}
}