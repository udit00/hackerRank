package solutionsHackerRank;

import java.util.Scanner;

public class Electronic_shop {
	public static void main(String ... args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int n=sc.nextInt();
		int m=sc.nextInt();
		int keyboards[]=new int[n];
		int drives[]=new int[m];
		for(int i=0; i<n; i++) {
		  keyboards[i]=sc.nextInt();	
		}
		for(int i=0; i<m; i++) {
		  drives[i]=sc.nextInt();
		}
		if(n<1 && n>1000) {
			
		}
		sc.close();
		int highest=0;
		///////////////////// 
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(((keyboards[i]+drives[j])<=b) && ((keyboards[i]+drives[j])>highest)) {
					highest=(keyboards[i]+drives[j]);
				}
			}
		}
		if(highest==0) {
			highest=-1;
		}
		System.out.println(highest);


		
	}
}
