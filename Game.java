import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Random r = new Random(); // creation des variables
		int essai = 0;
		int justprix = r.nextInt(200);
		int prix = 0;
		
		while(justprix != prix) {
			
			System.out.println("Entrez un numéro entre 0 et 200"); // pr envoyer un message au joueur
			Scanner scan = new Scanner(System.in);	// ca va scanner des éléments, on initialise d'abord
			
			if(justprix > prix) {
				System.out.println("C'est plus !");
			}
			else {
				System.out.println("C'est moins !");
		}
			prix = scan.nextInt();
			essai++; // pour demander de rajouter 1

		}
		System.out.print("Bravo ! le juste prix est : " + justprix + "\n");
		System.out.println("En" + essai + "essais ");
	}

}
 