package practice_ques;
import java.util.*;

public class Ques2 {

	public static void main(String[] args) {
		Ques2 ques2 = new Ques2();
		ques2.start();
	}
    public void start(){
	HashMap<String,String> names = new HashMap<>();
	names.put("ram", "hari");
	names.put("cisco", "barfi");
	names.put("honeywell", "cs");
	names.put("cts", "hari");
	
	
	
	for(Map.Entry<String,String> arr: names.entrySet()) {
		System.out.println(arr.getKey()+" "+arr.getValue());
		
	}
	
	
	}
}

