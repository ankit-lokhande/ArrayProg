
public class string7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("sachin");
		String s2= s1.concat("tendulkar");
		
		String s3 = s2.intern();
		
		String s4 = "sachintendulkar";
		System.out.println(s3==s4);
		

	}

}
