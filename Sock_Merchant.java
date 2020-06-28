package solutionsHackerRank;

import java.util.Scanner;

public class Sock_Merchant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pair=0;
		int ar[]=new int[n];
		for(int i=0; i<n; i++) {
			ar[i]=sc.nextInt();
		}
		sc.close();
		////////////////////////
		for(int i=1; i<n; i++) {
			int temp=ar[i];
			int j=i-1;
			while(j>=0 && ar[j]>temp) {
				ar[j+1]=ar[j];
				j-=1;
			}
			ar[j+1]=temp;
		}
		/////////////////////////
		for(int i=0; i<(n-1); i++) {
            if(ar[i]==ar[i+1]) {
            	pair++;
            	i++;
            }
		}
		System.out.println(pair);
	}

}
