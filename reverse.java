import java.util.*;
class reverse{
public static void main(String args[]){
  System.out.println("enter the string");
  String a,rev=" ";
  Scanner sc=new Scanner(System.in);
  a=sc.nextLine();
  
  int l=a.length();
  for(int i=l-1;i>=0;i--)
  {
     rev=rev+a.charAt(i);
  }
  System.out.println("reverse is"+rev);
}
}
  
