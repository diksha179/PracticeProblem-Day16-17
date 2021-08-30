package blz.datastructure;

import java.util.ArrayList;

	public class PrimeNumber {

			public static void main(String[] args) {
				ArrayList<Integer> alist = new ArrayList<Integer>();
			
					for(int i=0;i<=1000;i++){
					if(isPrime(i)){
						alist.add(i);
					}
							}
			System.out.println(alist);
			
			
		}
				public static boolean isPrime(int n){
					if(n==0||n==1){
						return false;
					}
						for(int i=2;i<n;i++){
							if(n%i==0){
								return false;
							}
						}
				return true;
				}
			}
			



