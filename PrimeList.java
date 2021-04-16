import java.io.*;
import java.util.Scanner;
class PrimeList
{
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
System.out.print("Enter the upperbound:");
n=in.nextInt();
System.out.println("The prime numbers from 1 to "+n+":");
for(int i=2;i<=n;i++)
{
int temp=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
temp++;
}
if(temp==0)
System.out.println(i);
}
}
}