package blz.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses{

	public static void main(String args[])
	{
		BalancedParentheses b=new BalancedParentheses();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter The String - ");
		String s=sc.next();
		boolean bb=b.CheckParentheses(s);
		if(bb==true)
		{
			System.out.println(" Balanced ");
		}
		else
		{
			System.out.println(" Not Balanced ");
		}
	}
	public boolean CheckParentheses(String s)
	{
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(')
			{
				st.push(s.charAt(i));
			}
			if(st.isEmpty())
			{
				return false;
			}
			switch(s.charAt(i))
			{
			case ')':
			{
				if(st.peek()=='{' || st.peek()=='[')
				{
					return false;
				}
				st.pop();
				break;
			}
			case '}':
			{
				if(st.peek()=='(' || st.peek()=='[')
				{
					return false;
				}
				st.pop();
				break;
			}
			case ']':
			{
				if(st.peek()=='{' || st.peek()=='(')
				{
					return false;
				}
				st.pop();
				break;
			}
			}
		}
		return st.isEmpty();
	}
}



