package string_ques;

public class Q1 {
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String s = sb.toString();
        if(s.equals(str)) {
        	return true;
        }
        else {
        	return false;
        }
		
	}

	public static void main(String[] args) {
		System.out.println(Q1.isPalindrome("aditya"));
		System.out.println(Q1.isPalindrome("jahaj"));

		
		

	}

}
