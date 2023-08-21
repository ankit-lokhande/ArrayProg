
public class TestAppsb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.insert(2,"xyz");
		sb.insert(9,11);
	
		System.out.println(sb);
		sb.insert(sb.length(),"dhoni");
		
		System.out.println(sb);
		
		sb.delete(2,5);
		
		sb.deleteCharAt(7);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.setLength(6);
		System.out.println(sb);
		
		sb.capacity();
		System.out.println(sb);

	}

}
