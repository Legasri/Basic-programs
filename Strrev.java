import java.io.*;
import java.util.Scanner;
class Strrev
{
public static void main(String args[])
{
String str;
char arr[]=new char[50];
Scanner in=new Scanner(System.in);
System.out.println("Enter the string");
str=in.next();
arr=str.toCharArray();
for(int i=arr.length-1;i>=0;i--)
{
System.out.print(arr[i]);
}
}
}