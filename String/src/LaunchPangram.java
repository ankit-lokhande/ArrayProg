
public class LaunchPangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ankit=false;
		
		String s1 ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
		s1=s1.replace(" ", "");
		
		char [] ch=s1.toCharArray();
		
		int [] ar = new int [26];
		
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
			ar[index]++;
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("its not a pangram");
				ankit=true;
			}
		}
		if(ankit==false)
		{
			System.out.println("It's a pangram");
		}

	}

}
