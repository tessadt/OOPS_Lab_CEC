import java.util.*;
class matrixadd
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the no.of rows and columns of 1st matrix:");
     int p=s.nextInt();
     int q=s.nextInt();
     System.out.println("enter the no.of rows and columns of 2 nd matirx:");
     int m=s.nextInt();
     int n=s.nextInt();
     if((m==p)&&(n==q))
     {
        int a[][]=new int[p][q];
        int b[][]=new int[m][n];
        int c[][]=new int[p][q];
        System.out.println("Enter the elements of 1st matrix");
        for(int i=0;i<p;i++)
        {
          for(int j=0;j<q;j++)
          {
            a[i][j]=s.nextInt();
          }
        }
        System.out.println("enter the elements of 2 nd matrix:");
        for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
          {
            b[i][j]=s.nextInt();
          }
        }
       System.out.println("Matrix Addition is:");
       for(int i=0;i<p;i++)
       {
         for(int j=0;j<q;j++)
         {
           c[i][j]=a[1][j]+b[1][j];
           System.out.print(c[i][j]+" ");
         }
      System.out.println();
      }
  }
   else
     System.out.println("Addition is not possible");
  }
  
 }

