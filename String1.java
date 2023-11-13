//What is String ?
// In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string. 
//char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
//String s=new String(ch); 
//is same as 
//String s="javatpoint"; 

package com.StringTopics;

import java.util.Arrays;

public class String1 {

	public static void main(String[] args) {
		//First process to Create String is literal 
		String s1 = " Welcome To My World "; 
		String s2 = "Thank^You";
		//Concate string we can do by simply "+" symbol
		System.out.println(s1+" "+s2);
		
		//By using new keyword it is Object 
		String s3 = new String("Hello"); 
		System.out.println(s3);
		
		//When we print another class will get address where in String will print null or value so it known as unique behaviour
		System.out.println(new String1());
		
		//String Comparison on with same
		String t1 = "Hello"; //stores in String pool (Container)in heap memory
		String t2 = new String("Hello"); //It stores in Object in memory management
		String t3 = "Hello";
		String t4 = new String("Hello");
		System.out.println(t1 == t2); // Prints false 
		System.out.println(t1 == t3); // Prints True
		System.out.println(t2 == t4); //Prints False because it compares the address here address is different
		System.out.println(t2.equals(t4)); //print True because it check data of the string
		
		//In String Class we can create some objects and variables
		//String Methods
		System.out.println(t1.equalsIgnoreCase(t4)); // 1. equalsIgnoreCase here it ignore Case of two string
		System.out.println(s1.contains("World"));   // 2. contains it will check the string and character in given string
		System.out.println(s1.startsWith("We"));    //3. startsWith will check starting string
		System.out.println(s1.endsWith("dd"));     // 4. endWith will cheack ending String
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.trim().length());
		System.out.println(s1.toLowerCase().trim());
		System.out.println(s1.toUpperCase().trim());
		System.out.println(s1.toCharArray());
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(2, 16));
		System.out.println(Arrays.toString(s1.split(" ")));
		System.out.println(Arrays.toString(s2.split("\\^")));
		System.out.println(s2.charAt(6));
		System.out.println(s1.replace("World", "Planet"));
		String s4 = "1234";
		int i = Integer.valueOf(s4);
		System.out.println(i);
		String s5 = String.valueOf(i);
		System.out.println(s5);
		String s6 = "  ";
		System.out.println(s6.isEmpty());
		System.out.println(s6.trim().isEmpty());
//		System.out.println(s6.isBlank());
		
		
		  
		
		
		
		
		
		
		
		
		
		
		

	}

}
