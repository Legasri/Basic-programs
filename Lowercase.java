import java.io.*;
import java.util.*;
class Lowercase
{
public static void main(String args[])
{
String s;
Scanner in=new Scanner(System.in);
System.out.println("Enter the sentence:");
s=in.nextLine();
String s1=s.toLowerCase();
System.out.println(s1);
}
}