package TryIt;
import java.util.*;
public class day4_Squar {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int ar[]=new int[a];
       for(int i=0;i<a;i++)
       {
           ar[i]=sc.nextInt();
       }
       for(int i=0;i<a;i++)
       {
           int x=ar[i];
           int sum=0,sum1=0,sum2=0;
           while(ar[i]>0)
           {
               int r=ar[i]%10;
               sum+=r;
               ar[i]/=10;
           }
           while(sum>0)
           {
               int r1=sum%10;
               sum1+=r1;
               sum/=10;
           }
           while(sum1>0)
           {
               int r2=sum1%10;
               sum2+=r2;
               sum1/=10;
           }
          int b=(int)Math.sqrt(sum2);
          if(b*b!=sum2)
          {
              System.out.print(x+" ");
          }
       }
	}
}
/*
 * 
 * 
 * 
 */
