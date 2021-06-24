package Salman_june_practice;

public class Arraybroarray {

	public static void main(String[] args) {

//	here we are assign all roll no by using loop		
		int[] salman = new int[50];
		int value = 1;
		for (int i = 0; i < salman.length; i++) {
			salman[i] = value;
			value = value + 1;
			System.out.println("roll no of class a is "+"["+i+"]\t" + salman[i]);

		}

//		here we can assign odd roll no to index collection
		
		int[] classA=new int[100];
	char male ='M';
	char female = 'F';
	
		for(int i=0; i<classA.length; i=i+2) {
			classA[i]=male;
						
		}
		for(int i=1; i<classA.length; i=i+2) {
			
			classA[i]=female;
			
		}
		
		
		
	}

}
