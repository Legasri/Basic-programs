import java.io.*;
import java.util.*;
class Password
{
public static void main(String args[])
{
Console c=System.console();
System.out.print("Enter the password:");
char ch[]=c.readPassword();
String s=String.valueOf(ch);
System.out.println("Password is:"+s);
}
}