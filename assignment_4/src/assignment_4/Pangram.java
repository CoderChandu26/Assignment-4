package assignment_4;

public class Pangram {

	public static void main(String[] args) {
	
		String S = "The quick brown fox jumps over the lazy dog";
		S = S.replace(" ","").toUpperCase();
		
		
		char S1[] = S.toCharArray();
		int a[] = new int[26];
		
		int i=0;
		while( i!=S.length()) {
			int count =S1[i]-65;
			a[count]=1;
			i++;
		}
		
		i=0;
		while(i!=26) {
			if(a[i]==1) {
				++i;
			}
			
			else {
				System.out.println("Not a Pangram");
				System.exit(0);
			}
		}
		System.out.println("its a Pangram");

	}

}
