package solutionsHackerRank;

import java.util.Scanner;

public class IceCreamParlour {
	
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   int flag=0;
	   int result[]=new int[t*2];
	   int iceCreams[];
	   while(t>0) {
		   int m=sc.nextInt();
		   int n=sc.nextInt();
		   iceCreams=new int[n];
		   for(int i=0; i<n; i++) {
			   iceCreams[i]=sc.nextInt();
		   }
		   for(int i=0; i<n; i++) {
			   for(int j=(n-1); j>i; j--) {
				   if(iceCreams[i]+iceCreams[j]==m) {
					   result[flag]=i+1;
					   result[flag+1]=j+1;
					   flag+=2;
				   }
			   }
		   }
		   t--;
	   }
	   sc.close();
	   for(int i=0; i<flag; i++) {
		   System.out.println(result[i]+" "+result[i+1]);
		   i++;
	   }
	   
	}

}
