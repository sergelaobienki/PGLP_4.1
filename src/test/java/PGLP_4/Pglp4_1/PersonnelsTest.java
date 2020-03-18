package PGLP_4.Pglp4_1;

import org.junit.Before;
import org.junit.Test;

public class PersonnelsTest {
	
	Personnels perso1;
	Personnels perso2;
	Personnels perso3;
	Personnels perso4;
	
	Composite grp1;
	Composite grp2;
	Composite grp3;
	
	@Before
	  public void setup() {
		
		perso1= new Personnels
				.Builder("sere", "sam", 2).build();
		
		perso3= new Personnels
				.Builder("ki", "george", 5).build();
		
		perso4= new Personnels
				.Builder("ouedra", "Serge", 6).build();
		perso2= new Personnels
				.Builder("sore", "ibra", 7).build();
		
		
		
		grp1 = new Composite(1);
		grp2 = new Composite(3);
		grp3 = new Composite(4);
		
		
	}

	@Test
	public void test() {
		
		grp1.add(perso1);
		grp1.add(grp2);
		
		grp2.add(grp3);
		grp2.add(perso3);
		
		grp3.add(perso4);
		grp3.add(perso2);
		
		grp1.print();
	}

}