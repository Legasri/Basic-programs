import java.io.*;
import java.util.*;
class Evenodd
{
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
System.out.print("Enter the number:");
n=in.nextInt();
if(n%2!=0)
System.out.println(0);
else 
System.out.println(1);
}
}