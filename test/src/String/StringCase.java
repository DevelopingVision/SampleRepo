package String;
import java.io.*;


public class StringCase {

	public static void main(String[] args) {
		//1.
		char ch='a';
		System.out.println((char)(ch-32));
		
		//2.
		String str="ineuron";
		String str1="";
		for(int i=0;i<str.length();i++)
		{
		 str1=str1+	(char)(str.charAt(i)-32);
		}
		System.out.println(str1);
		
		//3.
		String str2="ineuron java";
		String str3="";
		String ar[]=str2.split(" ");
		for(String elem:ar)
		{
		for(int i=elem.length()-1;i>=0;i--)
		{
			str3=str3+(char)(elem.charAt(i)-32);
		}
		
		str3=str3+" ";
		}
    
		System.out.println(str3);
		
		//4.
		String str4="";
		
		for(int i=str2.length()-1;i>=0;i--)
		{
			str4=str4+(char)(str2.charAt(i)-32);
		}
		
		System.out.println(str4);
		
		//5.
          //String str4="";
		
		for(int i=str2.length()-1;i>=0;i--)
		{
			System.out.println(str2.charAt(i));
		}
		
		
		
		
		
		String arr[]=str2.split(" ");
		String str5="";
		//String str6="";
		for(int j=arr.length-1;j>=0;j--)
		{
			/*for(int k=arr[j].length()-1;k>=0;k--)
			{
				
				str5=str5+arr[j][k];
			}*/
			str5=str5+arr[j]+" ";
		}
		System.out.println(str5);
		
		String ar1[]=str5.split(" ");
		String str6="";
		for(String elem1:ar1)
		{
		for(int i=elem1.length()-1;i>=0;i--)
		{
			str6=str6+(char)(elem1.charAt(i)-32);
		}
		
		str6=str6+" ";
		}
		System.out.println(str6);
	}

}
