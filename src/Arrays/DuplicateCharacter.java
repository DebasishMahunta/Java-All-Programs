package Arrays;

public class DuplicateCharacter {
	public static void main(String args[]) {
		String name = new String("pinkupriti");
		char[] ch = name.toCharArray();
		for(int i=1; i<ch.length;i++) {
			for(int j=i+1; j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate Character in String  "+ch[j]);
				}
			}
		}
	}

}
