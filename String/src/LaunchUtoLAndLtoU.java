import java.util.Scanner;

public class LaunchUtoLAndLtoU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		System.out.println(ch);
		ch=(char)(ch-32);
		System.out.println(ch);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string");
		String s1 = scan.nextLine();
		
		
		//String s1 = "ineuron";
		String s2 ="";
		
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+(char)(s1.charAt(i)-32);
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
