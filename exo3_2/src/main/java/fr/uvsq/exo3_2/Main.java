package fr.uvsq.exo3_2;

public class Main {

	public static void main(String[] args) {
		
		Entreprise entreprise = new Entreprise();
		
		Employe e1 = new Employe(10);
		Vendeur v1 = new Vendeur(5,100);
		Manager m1 = new Manager(20,10);
		
		entreprise.add(e1);
		entreprise.add(v1);
		entreprise.add(m1);

	}

}
