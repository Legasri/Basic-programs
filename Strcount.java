import java.io.*;
import java.lang.*;
import java.util.*;
class Strcount
{
public static void main(String args[])
{
String s;
char a[]=new char[50];
int letter=0,space=0,num=0,other=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the String:");
s=in.next();
a=s.toCharArray();
for(int i=0;i<a.length;i++)
{
if(Character.isLetter(a[i]))
letter++;
if(Character.isDigit(a[i]))
num++;
if(Character.isSpaceChar(a[i]))
space++;
else
other++;
}
System.out.println("letter:"+letter);
System.out.println("number:"+num);
System.out.println("space:"+space);
System.out.println("other:"+other);
}
}