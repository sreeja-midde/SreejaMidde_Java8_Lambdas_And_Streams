import java.util.*; 
import java.util.stream.Collectors;

public class Palindrome {
		public static boolean isPalindrome(String s) {
			
			String r = new StringBuffer(s).reverse().toString(); 
			if (s.equals(r)) 
				return true;
			return false;
		}
		public List<String> getList(List<String> list){
			
			List<String> r = new ArrayList<String>();
			for(String s : list) {
				if(Palindrome.isPalindrome(s))
					r.add(s);
			}
			
			return r;
		}
		public static void main(String[] args) {
			
			Palindrome s2= new Palindrome();
			List<String> s1 = Arrays.asList("madam","aca","hello","hh");
			System.out.println(s2.getList(s1));
	}
}
