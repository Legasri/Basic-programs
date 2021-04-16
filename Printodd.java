import java.io.*;
import java.util.*;
class Printodd
{
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
System.out.print("Enter the number of odd numbers you want to print:");
n=in.nextInt();
for(int i=1;i<=n;i++)
{
if(i%2!=0)
System.out.println(i);
}
}
}