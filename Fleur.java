package exercice2;

public class Fleur extends Plante{
	
	private String couleur;
	private int moisF;
	
	public Fleur(String nom , float hauteur , int age , float prix,String couleur , int moisF)
	{
		super(nom,hauteur,age,prix);
		this.couleur = couleur;
		this.moisF = moisF;
	}
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getMoisF() {
		return moisF;
	}

	public void setMoisF(int moisF) {
		this.moisF = moisF;
	}

	public String description()
	{
		return super.description() + " couleur : "+this.couleur+ " moisF : "+this.moisF;
	}
	public void fleurir()
	{
		if (this.moisF == 4 || this.moisF == 5 || this.moisF == 6)
		{
			System.out.println("La fleur est en fleurs");
		}
		else
		{
			System.out.println("La fleur n\'est en fleurs");
		}
	}
	
}
