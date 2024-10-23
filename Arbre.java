package exercice2;

public class Arbre extends Plante {
	
	private String typeFeuillage;
	private int AbsorMoyenne = 22;
	
	public Arbre(String nom , float hauteur , int age , float prix,String type)
	{
		super(nom,hauteur,age,prix);
		this.typeFeuillage = type;
	}
	
	public String getTypeFeuillage() {
		return typeFeuillage;
	}

	public void setTypeFeuillage(String typeFeuillage) {
		this.typeFeuillage = typeFeuillage;
	}

	public void setAbsorMoyenne(int absorMoyenne) {
		AbsorMoyenne = absorMoyenne;
	}

	public int getAbsorMoyenne()
	{
		return this.AbsorMoyenne;
	}
	public String Description()
	{
		return super.description() + " type_feuillage : "+this.typeFeuillage;
	}
	public double absorptionCO2()
	{
		if(this.hauteur/100 > 50)
		{
			return this.AbsorMoyenne+3;
		}
		return AbsorMoyenne;
	}
}

