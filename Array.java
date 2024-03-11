import java.util.*;
class Array{
public static void main(String args[]){
int a[]=new int[10];
int sum=0;

Scanner sc=new Scanner(System.in);
System.out.println("enter the length of array");
int l=sc.nextInt();
System.out.println("enter the array");
for(int i=0;i<l;i++)
{
 
 a[i]=sc.nextInt();
 sum=sum+a[i];
}
System.out.println("sum is"+sum);
int avg=sum/l;
System.out.println("Average is"+avg);
}
}
