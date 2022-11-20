package assignment_4;

public class ConsonantsVowelsSpclCount {

	public static void main(String[] args) {

		String S = "aEiOu bCd !@#$ ";
		int consonantCount=0;
		int vowelCount=0;
		int spclCharCount=0;
		
		char [] a1 = S.toCharArray();
		
		for (int i=0; i<a1.length;i++) 
		    {
			
			if(a1[i]=='a' | a1[i]=='A' | a1[i]=='e'| a1[i]=='E' | a1[i]=='i' | a1[i]=='I' 
					| a1[i]=='o' | a1[i]=='O' | a1[i]=='u' | a1[i]=='U'  ) {
				vowelCount++;
			}
			
			else if((a1[i]>='a' && a1[i]<='z') || (a1[i]>='A' && a1[i]<='Z')) 
			{
				
				consonantCount++;
			}
		    else if(a1[i]!=' ') //condition to remove spaces if any
			{
				spclCharCount++;
			}
			
		}
		
		System.out.println("Vowels count :"+vowelCount);
		System.out.println("Consonants count :"+consonantCount);
		System.out.println("Spcl characters count :"+spclCharCount);
		
		

	}

}
