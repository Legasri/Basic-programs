import java.io.*;
import java.util.*;
class Filesize
{
public static void main(String args[])
{
File f=new File("abc.text");
System.out.println("File is created successfully");
long s=f.length();
System.out.println(s+"bytes");
}
}