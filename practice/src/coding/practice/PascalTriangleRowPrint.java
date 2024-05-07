package coding.practice;

import java.util.Scanner;

public class PascalTriangleRowPrint {
	
	
	static int exactValueAtGivenRowAndCol(int r,int c) {
		int res =1;
		for(int i =0;i<c;i++) {
			res = res*(r-i);
			res = res/(i+1);
		}
		
		return res;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int ans =1;
	
	System.out.print("print the whole row");
	
	System.out.print(ans+" ");
	for(int i=1;i<n;i++) {
		ans = ans * (n-i);
		ans= ans/i;
		System.out.print(ans+" ");
	}
	int r =n;
	int c = sc.nextInt();
	int res = exactValueAtGivenRowAndCol(r,c);
	System.out.println("value at given row "+r+" and column "+c+" is "+res);
}
}
