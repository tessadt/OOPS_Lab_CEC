import java.util.*;
class symmetric
{
  public static void main(String args[])
  {
    int count=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter rows and columns of a matrix");
    int m=s.nextInt();
    int n=s.nextInt();
    if(m==n)
    {
       int p=m*n;
       int a[][]=new int[m][n];
       int b[][]=new int[m][n];
       System.out.println("Enter elements of a matrix:");
       for(int i=0;i<m;i++)
       {
          for(int j=0;j<n;j++)
          {
            a[i][j]=s.nextInt();
          }
       }
      for(int i=0;i<m;i++)
      {
         for(int j=0;j<n;j++)
         {
            b[i][j]=a[j][i];
         }
      }
      for(int i=0;i<m;i++)
      {
         for(int j=0;j<n;j++)
         {
            if(a[i][j]==b[i][j])
            {
                count++;
            }
         }
      }
         if(count==p)
           System.out.println("symmetric matrix");
         else
           System.out.println("not symmetric matrix");
      }
   else
     System.out.println("asymmetric matrix");
      }   
     
}
