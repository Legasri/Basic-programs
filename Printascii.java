import java.io.*;
import java.util.Scanner;
class Printascii
{
public static void main(String args[])
{
char c;
int a;
Scanner in=new Scanner(System.in);
System.out.println("Enter the charcter");
c=in.next().charAt(0);
a=(int)c;
System.out.println("The ascii value of "+c+" is:"+a);
}
}