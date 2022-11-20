package assignment_4;

public class UniqueChar {


		public static void main(String[] args) {
			
			String S1 = "abca";
			char [] S = S1.toCharArray();
			boolean b = false;
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
					
					b= true;
				
				}
				
				
			}
			
			if (b) {
				System.out.println("String has duplicate characters");
			}
			
			else
			{
				System.out.println("String is unique");
			}

		
	}

}
