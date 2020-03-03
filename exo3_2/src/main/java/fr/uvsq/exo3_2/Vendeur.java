package fr.uvsq.exo3_2;

public class Vendeur extends Employe {
	
	private int commission;
	public Vendeur(int pAnciennete,int pCommission)
	{
		super(pAnciennete);
		this.commission = pCommission;
	}
	
	public int calculeSalaire()
	{
		int salaire = salaireDeBase + commission;
		return salaire;
	}
	
}
