package solutionsHackerRank;

/*import java.util.Scanner;

public class Birthday_chocolate {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s[]=new int[n];
		for(int i=0; i<n; i++) {
			s[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		int m=sc.nextInt();
		sc.close();
		///////////////////////
		int flag=0;
		if(n<2) {
			if(s[n-1]==d) {
			flag++;	
			System.out.println(flag);
			}
			else {
			System.out.println(flag);
			}
			return;
		}
		for(int i=0; i<n-m; i++) {
			int result=0;
		  for(int j=i; j<i+m; j++){
			  result+=s[j];	
			  if(result==d) {
				  flag++;
				  break;				  
			  }
		    }
		  
		}
		System.out.println(flag);
		
     }
}*/



import java.util.Scanner;

public class Birthday_chocolate {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        for(int i=0; i<n; i++) {
            s[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        ///////////////////////
        int flag=0;
       /* if(n<2) {
            if(s[n-1]==d) {
            flag++;    
            System.out.println(flag);
            }
            else {
            System.out.println(flag);
            }
            return;
        }*/
        for(int i=0; i<=n-m; i++) {
            int result=0;
        	for(int j=i; j<i+m; j++) {
        		result+=s[j];        		
        	}
        	if(result==d) {
        		flag++;
        	}
        }
          
        System.out.println(flag);
        
     }
}




