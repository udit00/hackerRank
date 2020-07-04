package solutionsHackerRank;

import java.util.Scanner;

public class Counting_valleys {

	public static void main(String[] args) {
		int n,flag=0,valley=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String str=new String();
		str=sc.next();
		char[] c=new char[n];
		for(int i=0; i<n; i++) {
			c[i]=str.charAt(i);
		}
		sc.close();
		////////////////////////
		for(int i=0; i<n; i++) {
			if(c[i]=='D'){
				flag--;				
			}
			if(c[i]=='U') {
				if((flag+1)==0) {
				 valley++;
				}
				flag++;
			}						
		}
		System.out.println(valley);
		

}
}
