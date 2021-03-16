package string_ques;

public class Q2 {
	public static int countVowels(String str) {
		
		str = str.toLowerCase();
		int vowelCount = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				++vowelCount;
			}
			
		}
		return vowelCount;
		
	}

	public static void main(String[] args) {
		System.out.println(Q2.countVowels("Aditya"));
 
		

	}

}
