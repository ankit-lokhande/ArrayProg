import java.util.Arrays;

public class LaunchAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Race";
		String s2="carE";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char [] ch1=s1.toCharArray();
		char [] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1,ch2))
				{
			System.out.println("Its a Anagram");
				}
		else
		{
			System.out.println("its not a Anagram");
		}

	}

}
