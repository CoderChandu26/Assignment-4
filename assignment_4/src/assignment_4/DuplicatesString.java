package assignment_4;

public class DuplicatesString {

	public static void main(String[] args) {
	
		String S1 = "India is my country";
		char [] S = S1.toCharArray();
		
		for(int i=0; i<S.length; i++) {
			int count=0;
			for(int j=i+1; j<S.length;j++) 
			{
				if(S[i]==S[j] & S[j]!='0' &S[j]!=' ' ) {
					count++;
					S[j]='0';
				
				}
			}
			
			if(count>0 && S[i]!=0) {
				System.out.println(S[i]);
			
			}
			
			
		}
	
		}

	}


