package assignment_4;

public class RemoveDuplicates {

		public static void main(String[] args) {
			
			String S1 = "India is my country";
			char [] S = S1.toCharArray();
			
			
			System.out.println("Unique characters are : ");
			for(int i=0; i<S.length; i++) {
				int count=0;
				for(int j=i+1; j<S.length;j++) 
				{
					if(S[i]==S[j] & S[j]!='0' &S[j]!=' ' ) {
						count++;
						S[j]='0';
					
					}
				}
				
				if( S[i]!='0' & S[i]!=' ') {
					System.out.println(S[i]);
				
				}
				
				
			}
		
			


	}

}
