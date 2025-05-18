package day3;

import java.util.*;

public class countsamenumber {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int n = s.nextInt();

	 int arr[] = new int[n];
	 for(int i=0;i<n;i++) {
		 arr[i]=s.nextInt();
		  }
	 boolean visited[]=new boolean[n];
	 for(int i=0;i<n;i++) {
		 if(visited[i]==true) {
			 continue;}
		 int count=1;
			
			
			 for(int j=i+1;j<n;j++) {
				
				 if(arr[i]==arr[j]) {
					 visited[j]=true;
					
					 count++;
				 }
			 }
			
			 System.out.println(arr[i]+" "+count);
			 
		 }
		 
	 }
	}

    