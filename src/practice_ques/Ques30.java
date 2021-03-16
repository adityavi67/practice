package practice_ques;

public class Ques30 {

	public static void main(String[] args) {
		int num = 0201103311;
		
		int digit1=num/1000000000%10;   
		int digit2=num/100000000%10;  
		int digit3=num/10000000%10;  
		int digit4=num/1000000%10;  
		int digit5=num/100000%10;  
		int digit6=num/10000%10;
		int digit7=num/1000%10;
		int digit8=num/100%10;
		int digit9=num/10%10;
		int digit10=num%10; 
		
		int sum = (digit1*10) + (digit2*9) + (digit3*8) + (digit4*7) + (digit5*6) + (digit6*5) + (digit7*4) + (digit8*3) + (digit9*2) + (digit10*1);
		
		if (sum%11==0) {
			System.out.println("num is an ISBN number");
		}
		else
			System.out.println("num is not an ISBN number");
		


	}

}
