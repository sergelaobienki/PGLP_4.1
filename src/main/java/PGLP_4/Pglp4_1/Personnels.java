package PGLP_4.Pglp4_1;


import java.time.LocalDate;
import java.util.ArrayList;

public final class Personnels implements InterfacePersonnels{
private String Nom;
private String Prenom;
String Fonction;

LocalDate DateDeNaissance;
ArrayList<Integer>NumeroTel=new ArrayList<Integer>();

public class Builder{
	/* parametre obligatoire*/
	private String Nom;
	private String Prenom;
	/* parametre optionnel*/
	
	LocalDate DateDeNaissance;
	ArrayList<Integer>NumeroTel=new ArrayList<Integer>();
public Builder(String Nom, String Prenom){
	this.Nom=Nom;
	this.Prenom=Prenom;
	
}
	public Builder DateDeNaissance(int annee, int mois, int jour) {
		this.DateDeNaissance=LocalDate.of(annee, mois, jour);
				return this;
				
	}
	public Builder NumeroTel(int NumeroTel) {
		this.NumeroTel.add(NumeroTel);
		return this;
		
	}
	public Personnels build() {
		return new Personnels(this);
		
	}
}









public Personnels(Builder builder) {
	// TODO Auto-generated constructor stub
	
	this.Nom=builder.Nom;
	this.Prenom=builder.Prenom;
	this.DateDeNaissance=builder.DateDeNaissance;
	this.NumeroTel=builder.NumeroTel;
	
}



































public void Afficher(String message) {
	// TODO Auto-generated method stub
	
}












public void print() {
	// TODO Auto-generated method stub
	
}
}
