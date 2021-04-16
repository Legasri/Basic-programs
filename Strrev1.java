import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Strrev1
{
public static void main(String args[])
{
String str;
StringBuilder str1=new StringBuilder();
Scanner in=new Scanner(System.in);
System.out.println("Enter the string");
str=in.next();
str1.append(str);
str1.reverse();
System.out.print(str1);
}
}