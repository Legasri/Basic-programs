import java.io.*;
import java.util.Scanner;
class StrMidInsert
{
public static void main(String args[])
{
StringBuffer s=new StringBuffer("Python 3.0");
String s1;
Scanner in=new Scanner(System.in);
System.out.println("Enter the string which must be inserted:");
s1=in.nextLine();
int pos=s.indexOf("3");
System.out.println(s.insert(pos-1,s1));
}
}