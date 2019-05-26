package testing;

public class String1_Practice {

	public static void main(String[] args) {
	
		String str1="hello java";
		String str2="hello seleniuam";
		String space="";
		
		//print the value of concant string
		System.out.println("frist output");
		System.out.println(str1.concat(str2));
		
		//Another way of using string concat
		System.out.println("second string");
		System.out.println("hello java".concat(str2));
		
		//String1+string2
		System.out.println("hello java"+"hello seleniuam");
		
		//concat using thrid variable
		System.out.println("hello java"+ space + "hello seleniuam");

		boolean compareresult=str1.equals(str2);
		System.out.println("the result of string comparison is:"+compareresult);
	}

}
