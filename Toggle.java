import java.io.*;
import java.util.*;
class Toggle
{
public static void main(String args[])
{
String s;
char arr[]=new char[50];
Scanner in=new Scanner(System.in);
System.out.println("Enter the string:");
s=in.nextLine();
System.out.println("The sentence:"+s);
arr=s.toCharArray();
for(int i=0;i<arr.length;i++)
{
if(arr[i]>='A'&&arr[i]<='Z')
{
arr[i]=(char)(arr[i]+'a'-'A');
}
else if(arr[i]>='a'&&arr[i]<='z')
{
arr[i]=(char)(arr[i]+'A'-'a');
}
}
System.out.print("The toggled sentence:");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]);
}
}
}