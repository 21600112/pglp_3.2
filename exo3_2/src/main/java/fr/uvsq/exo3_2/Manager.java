package fr.uvsq.exo3_2;

public class Manager extends Employe {
	
	private int nombreEmploye;
	
	public Manager(int pAnciennete, int pNombreEmploye)
	{
		super(pAnciennete);
		this.nombreEmploye = pNombreEmploye;
	}
	
	public int calculeSalaire()
	{
		int salaire = salaireDeBase + 100*nombreEmploye + 20*anciennete;
		return salaire;
	}
	
}
