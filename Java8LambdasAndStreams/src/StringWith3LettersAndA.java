import java.util.*; 
import java.util.stream.Collectors;

public class StringWith3LettersAndA {
	public List<String> ReturnString(List<String> list) {

		return list.stream().filter(s -> s.startsWith("a"))
		.filter(s -> s.length() == 3).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		
		StringWith3LettersAndA s = new StringWith3LettersAndA();
		List<String> s1 = Arrays.asList("apple","ace","bobby","axe");
		System.out.println(s.ReturnString(s1));
	}

}
