package PGLP_4.Pglp4_1;

import java.util.ArrayList;


public class AffichageParGroupe {
	public ArrayList<InterfacePersonnels> grp=new ArrayList<InterfacePersonnels>();
	
	public  AffichageParGroupe (InterfacePersonnels root) {
		this.grp.add(root);
	}
	
	/**
	 * 
	 * @author root
	 *
	 */
	private class groupIterator implements Iterator{
		int index=0;
		
		
		public groupIterator() {
			int verifier=0;
			while(verifier<grp.size()) {
				if(grp.get(verifier) instanceof Composite) {
					Composite test=(Composite)grp.get(verifier);
					int i=0;
					
					while(i<test.grpPerso.size()) {
						grp.add(test.grpPerso.get(i));
						i++;
					}
					
				
				}
				verifier++;
			}
		}
		
		/**
		 * verifirie s'il y'a des elements dans l'arr
		 */
		public boolean HasNext() {
			if(index<grp.size())
				return true;
			// TODO Auto-generated method stub
			return false;
		}

		public InterfacePersonnels Next() {
			if(this.HasNext()) {
				index++;
				return grp.get(index-1);
			}
				
			return null;
		}

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}
		
		
		
	}
	
	public Iterator getIterator() {
		return new groupIterator();
		
	}


}
						
						
						
						
						