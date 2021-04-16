import java.io.*;
import java.util.Scanner;
public class Add1
{
public static void main(String args[])
{
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.println("Enter num1");
a=in.nextInt();
System.out.println("Enter num2");
b=in.nextInt();
c=a+b;
System.out.println("sum="+c);
}
}