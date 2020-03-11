package PGLP_4.Pglp4_1;

import java.util.ArrayList;

public class AffichageParGroupe {
ArrayList<InterfacePersonnels>arr;
private class GroupeIterator implements Iterator{
	int index;
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
}
}
