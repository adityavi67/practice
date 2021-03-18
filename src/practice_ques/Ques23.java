package practice_ques;

public class Ques23 {
	public int getResult(String arr[],String input){
		int count=0;
		for(String s:arr){
		   if(s.length()>2){
			String str=s.substring(0,2);
			if(str.equals(input)){
			count++;
			}
		    }
		}
		return count;
	    }

	public static void main(String[] args) {
		Ques23 output = new Ques23();
		String arr[]={"100","111","10100","10","1111"} ;
		String input="10";
		System.out.println(output.getResult(arr,input));

	}

}
