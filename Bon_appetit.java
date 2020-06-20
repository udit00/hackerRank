package solutionsHackerRank;

import java.util.Scanner;

public class Bon_appetit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int bill[]=new int[n];
		for(int i=0; i<n; i++) {
			bill[i]=sc.nextInt();
		}
		int b=sc.nextInt();
		sc.close();
		///////////////////////////
		int result=0;
		for(int i=0; i<n; i++) {
			if(i!=k){
			  result+=bill[i];					
			}
		}
		if(result/2==b) {
			System.out.println("Bon Appetit");
		}
		else {
			System.out.println(b-(result/2));
		}
		
	}

}
