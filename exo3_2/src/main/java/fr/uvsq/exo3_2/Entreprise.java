package fr.uvsq.exo3_2;
import java.util.ArrayList;
import java.util.List;

public class Entreprise {
	List<Employe> list;	

	public Entreprise()
	{
		list = new ArrayList<Employe>();	
	}
	
	public void add(Employe pEmploye)
	{
		list.add(pEmploye);
	}
	
	public int calculeMasseSalariale()
	{
		int res=0;
		for(int i=0;i<list.size();i++)
		{
			res +=list.get(i).calculeSalaire();
		}
		return res;
	}
}
