import java.io.*;
import java.util.Scanner;
class ToggleFirst
{
public static void main(String args[])
{
String s,s1;
Scanner in=new Scanner(System.in);
System.out.println("Enter the sentence:");
s=in.nextLine();
s=" "+s;
s1="";
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch==' ')
{
s1=s1+ch;
i++;
ch=s.charAt(i);
s1=s1+Character.toUpperCase(ch);
}
else
{
s1=s1+ch;
}
}
s1.trim();
System.out.println(s1);
}
}

