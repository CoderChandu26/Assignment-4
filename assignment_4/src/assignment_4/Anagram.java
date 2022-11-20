package assignment_4;

public class Anagram {

	public static void main(String[] args) {
		
		String S1 = "race1b ";
		String S2 = "acb1er";
		S1 = S1.replaceAll("\\s", "").toLowerCase();
		S2 = S2.replaceAll("\\s", "").toLowerCase();
		
		char [] a1 = S1.toCharArray();
		char [] a2 = S2.toCharArray();
		char [] a3= new char[a1.length];
		
		
		
		if(S1.length()!=S2.length()) {
			System.out.println("Both string lengths are not equal");
			System.exit(0);
			
		}
		int count=0;
		for (int i=0;i<a1.length;i++) 
		{
			
			for (int j=0; j < a2.length; j++) 
			{
				 if(a1[i]==a2[j]) {
					a3[count]=a2[j];
					count++;
				 }
			}
			
		}
		
		int count1=0;
		for (int i=0; i<a3.length;i++)
		{
			if(a3[i]==a1[i]) 
			{
				count1++;
			}
		}
		
		if (count1==a1.length) 
		{
			System.out.println("Given strings are anagrams");
		}
		else
		{
			System.out.println("Given strings are not anagrams");
		}
		

	}

}
