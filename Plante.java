package exercice2;

public class Plante {
	protected String nom;
	protected float hauteur;
	protected int age;
	protected float prix;
	
	public Plante(String nom , float hauteur , int age , float prix)
	{
		this.nom = nom;
		this.hauteur = hauteur;
		this.age = age;
		this.prix = prix;
	}
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public float getHauteur() {
		return hauteur;
	}


	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public String description()
	{
		return "nom : "+this.nom+" Hauteur : "+this.hauteur+" age : "+this.age+" prix : "+this.prix;
	}
	
	
}
 