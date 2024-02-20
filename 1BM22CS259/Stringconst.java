import java.util.*;
class Stringconst{
	public static void main(String args[])
	{
		String s1 =new String();
		s1="Shivaraj";
		char ch[]={'a','n','s','h'};
		String s2=new String(ch);
		String t="Shiv";
		String s3=new String(t);
		String s4=new String(ch,1,2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		String s5="hi";
		String s6="hello ";
		System.out.println("Length of s5 :"+ s5.length());
		s6=s6.concat(s5);
		System.out.println(s6);
		
		Integer a=3333;
		String ss=a.toString();
		System.out.println(ss);

		String bms="Welcome to Bmsce college";
		char c[]=new char[20];
		bms.getChars(11,16,c,0);
		String ext=new String(c);
		System.out.println(ext);

		String s7="Shivaraj";
		char c1[]=s7.toCharArray();
		for(char val:c1){
			System.out.println(val+" ");
		}
		System.out.println();
		byte b[]=s7.getBytes();
		for(byte val:b){
			System.out.println(val+" ");
		}
		
		System.out.println("Bmsce".equals("Bmsce"));
		System.out.println("Bmsce".equals("college"));
		System.out.println("Bmsce".equals("BMSCE"));
		System.out.println("Bmsce".equalsIgnoreCase("BMSCE"));	

		String s8="Bmsce College";
		String s9="Welcome to Bmsce College of Engineering";
		if(s9.regionMatches(11,s8,0,10)){
			System.out.println("String matches");
		}
		else{
			System.out.println("String not matches");
		}

		System.out.println(s8.startsWith("B"));
		System.out.println(s9.endsWith("g"));

		
	}
}














































