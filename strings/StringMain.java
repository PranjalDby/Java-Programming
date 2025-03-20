package strings;

public class StringMain {
    public static void main(String args[]){
    	String s1 = new String("Hello Myself Pranjal\nWelcome to jurrasic world.");

	System.out.println("Index of character in string");

	System.out.println(s1.indexOf('M'));

	System.out.println("Finding the multiple occurances of same string");
	
	int index = 0;
	String targets[] = {"Pranjal","jurrasic"};
	for(int i = 0;i<targets.length;i++){
		if(s1.indexOf(targets[i]) != -1){
			System.out.println("Found at = " + s1.indexOf(targets[i]));
		}
	}
	
	// Checking if the string is palindrome or not
	// to check palindrome is to verify if the same string after speeling from last it name same as original one
	//
	
	String palind = "saas";
	int n = palind.length();
	char arr[] = new char[n];
	int i = 0;
	arr = palind.toCharArray();
	int j = arr.length - 1;
	System.out.println("String is = " + palind);
	while(i<=j){
		if(arr[i] != arr[j]){
			System.out.println("Not a palindrome");
			
			return;
		}
		i++;j--;
	}

	System.out.println("Palindrome");
    }
}
