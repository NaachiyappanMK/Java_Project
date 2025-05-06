/**
 * 
 */
package tarcane.co.in.handson;

/**
 * 
 */
public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Resource for String
//		https://www.javastring.net/java/string/java-string-methods

		findStringLength("gsdrsvvs");
		
		findStringASCIIIntVal("yrtehgsdvs");

		sortStringAscOrder("yrtehgsdvsA");
		
		compareTwoString("yrtehgsdvsA", "yrtehgsdvsrdg");
		
		formatGivenSentence("Hello %s! Have a %s Day");

		getCharSeqfromString("yrtehgsdvsA");
	}

	private static void getCharSeqfromString(String string) {
		
		// Output - rtehgsdvsA
		
		char des[] = new char[string.length()-1];
		string.getChars(1, string.length()-1, des, 0);
		System.out.println(des);
		
	}

	/**
	 * Method to Format Given String
	 * 
	 * @param string
	 */
	private static void formatGivenSentence(String string) {
		
		// Output - Hello World! Have a Great Day
		System.out.println(string.formatted("World", "Great"));
		
	}

	/**
	 * Method to compare Two string by char sequence
	 * 
	 * @param string
	 * @param string2
	 */
	private static void compareTwoString(String string, String string2) {
		
		
		int result = string.compareTo(string2);
		System.out.print("\n");
		System.out.println(result);
	}

	/**
	 * Method to order to Given String
	 * 
	 * @param string
	 */
	private static void sortStringAscOrder(String string) {
		
		// Output - Adeghrsstvy
		
		System.out.print("\n");
		string.chars().sorted().forEach(action -> {
			System.out.print((char) action);
		});
	}

	/**
	 * Method to find the Char Unicode of the Given String
	 * 
	 * @param string
	 */
	private static void findStringASCIIIntVal(String string) {
		
		//Output - y-121,r-114,t-116,e-101,h-104,g-103,s-115,d-100,v-118,s-115,
		
		string.chars().forEach(action -> {
			System.out.print((char) action + "-" + action + ",");
		});
		
	}

	/**
	 * Method to find the length of the Given String
	 * 
	 * @param string
	 */
	private static void findStringLength(String string) {

		// Index starts from 1
		// Output 8
		System.out.println(string.length());
		
	}

}
