package modele;

public class Application {

	public static void main(String[] args) {
		Personne bob = new Personne("bob", 20);
		System.out.println(bob.getNom() + ": " + bob.parler()); //printf

		Personne alice = new Personne("Alice", 17);
		System.out.println(alice.getNom() + ": " + alice.parler()); //printf
	
		Personne baby = new Personne("Baby", 1);
		System.out.println(baby.getNom() + ": " + baby.parler()); //printf

	
	}

}
