import java.io.*;
import java.util.*;
class Revstr
{
public static void main(String args[])
{
String s;
StringBuilder s1=new StringBuilder(); 
Scanner in=new Scanner(System.in);
System.out.println("Enter the sentence:");
s=in.nextLine();
s1.append(s);
s1.reverse();
System.out.println(s1);
}
}