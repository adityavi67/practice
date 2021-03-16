package string_ques;

public class Q3 {
	 static boolean isVowel(char ch)  
	    { 
	        ch = Character.toUpperCase(ch); 
	        return (ch == 'A' || ch == 'E' ||  
	                ch == 'I' || ch == 'O' || ch == 'U'); 
	    } 
	  
	    static String duplicateVowels(String str) 
	    { 
	        int t = str.length(); 
	  
	        
	        String res = ""; 
	  
	         
	        for (int i = 0; i < t; i++)  
	        { 
	            if (isVowel(str.charAt(i))) 
	                res += str.charAt(i); 
	            res += str.charAt(i); 
	        } 
	        return res; 
	    } 
	  
	     
	    public static void main(String[] args)  
	    { 
	        String str = "helloworld"; 
	  
	         
	        System.out.println("Original String: " + str); 
	        String res = duplicateVowels(str); 
	  
	        
	        System.out.println("String with Vowels duplicated: " + res); 
	    } 
}
