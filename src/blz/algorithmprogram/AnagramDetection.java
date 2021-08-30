package blz.algorithmprogram;
import java.util.Scanner;

	public class AnagramDetection {
	
		public static void main(String[] args) {
		
			System.out.println("Enter the first and Second Strings");
			 
			Scanner sc=new Scanner(System.in);
			 
			String A=sc.nextLine();
			String B=sc.nextLine();
		        
			A=A.toUpperCase();
			B=B.toUpperCase();
			int k=0;
			if(A.length()==B.length())
			{
				for( int i=0;i<B.length();i++)
				{
					int n=A.indexOf(B.charAt(i));
					if(n==-1)
					{
						k=1;
						break;
					}
					else
						A=A.substring(0,n)+A.substring(n+1);
		            }
		            System.out.println(k==0?"Anagrams":"Not Anagrams");
		        }
		        else
		            System.out.println("Not Anagrams");
		    }
		}
			
			
			
	
	