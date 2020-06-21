import java.util.*; 
import java.util.stream.Collectors;

public class AvgOfListOfIntegers {
	public Double Average(List<Integer> list) {
		 return list.stream().mapToDouble(i -> (double)i).average()
		 .getAsDouble();
		}

public static void main(String[] args) {
	
	AvgOfListOfIntegers s = new AvgOfListOfIntegers();
	List<Integer> avge = Arrays.asList(5,6,7,8,9);
	System.out.println(s.Average(avge));
}}

