import java.util.Scanner;

public class LaunchPalindrome {

	public static void main(String[] args) {
		
		String s1 = "";
		String s2 = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the name");
		s1 = scan.next();
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not palindrome");
		}

	}

}
