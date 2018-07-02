import java.util.Scanner;

class Qien{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//int leeftijd = 0;
		leeftijd = input.nextInt();	}
		if(leeftijd < 16){
			System.out.println("Sorry, voor jou mogen we nog niets inschenken");
		}else if(leeftijd < 18){
			System.out.println("Geniet, maar drink met mate: jij mag bier of wijn");
		}else{
			System.out.println("Wat kan ik voor je inschenken?");
		}	
	}

}