package modele;

public class Personne {
	private String nom;
	private int age;

	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public String parler() {
		assert(age > 2);
		return "Kikoo";
	}
	
	public String getNom() {
		if (age < 18)
			return "inconnu";
		return nom;
	}
	
}


