package PGLP_4.Pglp4_1;

import java.util.ArrayList;

public class AffichageParGroupe {
ArrayList<InterfacePersonnels>arr;

public AffichageParGroupe(InterfacePersonnels Root) {
	arr.add(Root);
	
	
}
private class GrpIterator implements Iterator{
	int index;
	int verifie;
	public boolean hasNext() {
		if (index>=arr.size())
			return false;
		return true;
		
	}
	
	
	public InterfacePersonnels Next() {
		if(this.hasNext()) {
			return arr.get(index++);
			
		}
		
		}
	
	public void GrPIterator() {
		int verifie=0;
		while(verifie<arr.size())
		{
		if(arr.get(verifie)instanceof Composite) {
			for (InterfacePersonnels personne:((Composite)arr.get(verifie)).GroupePersonnels);
			{
				InterfacePersonnels personne;
				arr.add(personne);
			}
		}
			
			
		}
		
		
	}
}
}
