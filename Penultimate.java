import java.io.*;
import java.util.*;
class Penultimate
{
public static void main(String args[])
{
String s;
Scanner in=new Scanner(System.in);
System.out.println("Enter the sentence:");
s=in.nextLine();
String words[]=s.split("[ ]+");
System.out.println("Penultimate word :"+words[words.length-2]);
}
}