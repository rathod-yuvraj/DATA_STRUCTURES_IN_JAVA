public class ReverseStringLoop {
	public static String reverseStringLoop(String inputStr) {
		StringBuilder reversedStr = new StringBuilder();
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			reversedStr.append(inputStr.charAt(i));
		}
		return reversedStr.toString();
	}

	public static void main(String[] args) {
		String originalStr = "GeeksforGeeks";
		String result = reverseStringLoop(originalStr);
		System.out.println(result);
	}
}
