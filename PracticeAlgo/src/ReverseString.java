
public class ReverseString {

	public static void main(String[] args) {
		
		String test = "Hi my name is rahul";
		String reverse = reverse(test);
		System.out.println(reverse);
	}

	private static String reverse(String test) {
		
		StringBuilder builder= new StringBuilder();
		for (int i = test.length()-1; i >=0; i--) {
			builder.append(test.charAt(i));
		}
		return builder.toString();
	}
	
}
