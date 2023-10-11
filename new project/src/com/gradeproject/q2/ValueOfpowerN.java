package com.gradeproject.q2;
import java.util.Scanner;

public class ValueOfpowerN {
  static int PowerOfX(int x , int n){
	  if(n==0){
		  return 1;
	  }
	  return x*PowerOfX(x,n-1);
  }
  
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the base number X:");
	int X=sc.nextInt();
	System.out.print("Enter the power N= ");
	int N=sc.nextInt();
	int res=PowerOfX(X,N);
	System.out.println("X power N is:"+res);

	}

}
