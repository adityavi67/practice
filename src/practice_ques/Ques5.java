package practice_ques;

public class Ques5 {

	public static void main(String[] args) {
		String str = "Hello*world";
		int ind = str.indexOf('*');
		int priorInd = ind-1;
		int nextInd = ind+1;
		char c1 = str.charAt(priorInd);
		char c2 = str.charAt(nextInd);
		if(c1==c2) {
			System.out.println("true");
		}
		else if(!str.contains("*")) {
			System.out.println("false");
		}
		else
			System.out.println("false");


	}

}
