package com.balistique;

/**
 * @author Djohar
 *
 */
public class Gene {

	private double hauteur,poids,angle,vitess;

	public Gene(double hauteur, double poids, double angle, double vitess) {
		this.hauteur = hauteur;
		this.poids = poids;
		this.angle = angle;
		this.vitess = vitess;
	}

	public double getHauteur() {
		return hauteur;
	}

	public double getPoids() {
		return poids;
	}

	public double getAngle() {
		return angle;
	}

	public double getVitess() {
		return vitess;
	}
	
	public double CalculeHauteur(int x) {
		double result = (-9.8/2*Math.sqrt(this.getVitess())*this.getPoids())*
						(1+Math.sqrt(Math.tan(this.getAngle())))*Math.sqrt(x)+
						Math.tan(this.getAngle())*x + this.getHauteur();
						
						
		return result;
	}

	@Override
	public String toString() {
		return "Gene [hauteur=" + hauteur + ", poids=" + poids + ", angle=" + angle + ", vitess=" + vitess + "]";
	}
	
	
	
	
	
	
	
	
}
