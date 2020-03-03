package fr.uvsq.exo3_2;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestUnitaire {
	
	@Test
	public void employeBonSalaire()
	{
		Employe e1 = new Employe(10);
		assertEquals(e1.calculeSalaire(),1700);
	}
	
	@Test
	public void ManagerBonSalaire()
	{
		Manager m1 = new Manager(20,10);
		assertEquals(m1.calculeSalaire(),2900);
	}
	
	@Test
	public void VendeurBonSalaire()
	{
		Vendeur v1 = new Vendeur(5,100);
		assertEquals(v1.calculeSalaire(),1700);
	}
	
	@Test
	public void masseSalaireEstBonne()
	{
		Entreprise entreprise = new Entreprise();
		
		Employe e1 = new Employe(10);
		Vendeur v1 = new Vendeur(5,100);
		Manager m1 = new Manager(20,10);
		
		entreprise.add(e1);
		entreprise.add(v1);
		entreprise.add(m1);
		assertEquals(entreprise.calculeMasseSalariale(),6300);
	}
}
