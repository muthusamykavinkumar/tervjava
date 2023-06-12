package TryIt;
import java.util.*;

public class function {
	public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	 int i=0;
      for(int j=0;j<=3;j++) {
    	  if(j==3&&i!=j) {i++;j=0;}
    		  System.out.println(i+"  "+j);
      }
	}

}
