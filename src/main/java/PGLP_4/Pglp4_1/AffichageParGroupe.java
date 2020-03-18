package PGLP_4.Pglp4_1;

import java.util.ArrayList;

public class AffichageParGroupe {
    protected ArrayList<InterfacePersonnels> grp= new ArrayList<InterfacePersonnels>();

    public AffichageParGroupe (InterfacePersonnels  grp) {
        this.grp.add(grp);
    }

    /**
     *
     * @author root
     *
     */
    private class groupIterator implements Iterator {
        int index;


        public groupIterator() {
            int verifier=0;
            while(verifier<grp.size()) {
                if(grp.get(verifier) instanceof Composite) {
                    Composite test=(Composite)grp.get(verifier);
                    int i=0;
                    while(i<test.GroupePersonnels.size()) {
                        grp.add(test.GroupePersonnels.get(i));
                        i++;
                    }
                    verifier++;
                }
            }
        }

        /**
         * verifirie s'il y'a des elements dans l'arr
         */
        public boolean hasNext() {
            if(index<grp.size())
                return true;
            // TODO Auto-generated method stub
            return false;
        }

        public Object Next() {
            if(this.hasNext())
                return grp.get(index);
            return null;
        }



    }

    public groupIterator getIterator() {
        return new groupIterator();

    }
}