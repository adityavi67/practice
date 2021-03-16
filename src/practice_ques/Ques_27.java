package practice_ques;

public class Ques_27 {

	public static void main(String[] args) {
     String input1 = "AAA/abb/CCC";
     String updated = input1.toLowerCase();
     String[] output1 = updated.split("/");
     for(String i : output1) {
    	 System.out.print(i);
     }

	}

}
