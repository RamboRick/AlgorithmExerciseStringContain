package subString;
import java.util.HashSet;

public class strCheck {
	
	public boolean isSubstring(String s1, String s2){
		if (s1.length() != s2.length()){
			return false;
		}else {
			HashSet<Character> crr = new HashSet<>();
			String sum = s1.concat(s2);
			for (char sin : sum.toCharArray()){
				if ( crr.contains(sin)){
					crr.remove(sin);
				}else {
					crr.add(sin);
				}
			}
			return crr.size() < 1;
		}
	}

	public static void main(String[] args) {
		strCheck test = new strCheck();
		boolean result = test.isSubstring("afdsgh","asdfgh");
		System.out.println(result);
	}

}
