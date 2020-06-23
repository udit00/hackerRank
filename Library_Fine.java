package solutionsHackerRank;

import java.util.Scanner;

public class Library_Fine {
		public static void main(String ... args) {
			Scanner sc=new Scanner(System.in);
			int d1,d2,m1,m2,y1,y2;
			d1=sc.nextInt();
			m1=sc.nextInt();
			y1=sc.nextInt();
			d2=sc.nextInt();
			m2=sc.nextInt();
			y2=sc.nextInt();
			sc.close();
			if(y2>y1) System.out.println(0);
			else if(y2<y1) System.out.println(10000);
			else if(y2==y1) {			
			  if(m2<m1) {
				int result=(m2-m1);
				if(result<0) result*=-1;
				System.out.println(500*result);
			   }
			  else if(m2>m1){
				  System.out.println(0);				  
			  }
			  else if(m2==m1){
				    if(d2<d1) {
						int result=(d2-d1);
						if(result<0) result*=-1;
						System.out.println(15*result);
					}
				    else {
				    	System.out.println(0);
				    }
				  
			  }
			
			
		}
}
}
