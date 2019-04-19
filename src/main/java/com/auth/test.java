package com.auth;

public class test{
	public static void main(String args[]){
		int s[] = {4,5,6,7,1,7,8,7};
		for (int i=0; i<s.length; i++){
			for (int j=0; j<s.length-1; j++){
				
				if (s[j] > s[j+1]){
					int a = s[j];
					s[j] = s[j+1];
					s[j+1] = a;
				}
				
			}
		}
		for (int i : s) {
			System.out.println(i);
		}
		
	}
}