import java.io.*;
import java.util.Scanner;
class ConvertStrtoInt
{
public static void main(String args[])
{
String s;
int num;
Scanner in=new Scanner(System.in);
System.out.println("Input a string");
s=in.nextLine();
num=Integer.parseInt(s);
System.out.println("The integer value is:"+num);
}
}
