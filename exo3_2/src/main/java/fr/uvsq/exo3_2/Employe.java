package fr.uvsq.exo3_2;

public class Employe {
	protected int anciennete;
	protected static int salaireDeBase = 1500;
	
	public Employe(int pAnciennete)
	{
		this.anciennete = pAnciennete;
	}
	
	public int calculeSalaire()
	{
		int salaire = salaireDeBase + 20*anciennete;
		return salaire;
	}
}
