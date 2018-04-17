package com.balistique;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Djohar
 *
 */
public class Sequence implements Comparable<Sequence> {
	/** sequence = tableau d'entiers */
	double[] genes;
	/** longueur d'une sequence */
	private final int longueurSequence = 4;
	/** score */
	final double tauxGenesMutants = 0.1;
	/** nb de genes devant muter */
	int nbGenesAMuter = (int) (longueurSequence * tauxGenesMutants);
	/** hasard */
	static Random hasard = new Random();
	private double utilite;
	public Sequence() {
		genes = new double[longueurSequence];
		
	}
	public void create() {
		genes = new double[longueurSequence];
		
			 //ordre d'insertion => h,v,a,p
		genes[0] = hasard.nextDouble()*2;
		genes[1] = hasard.nextDouble()*10;
		genes[2] = hasard.nextDouble()*(90/2);
		genes[3] = hasard.nextDouble();
		
		utilite =  calculUtilite();
		
		
	}
	private double calculUtilite() {
		double result = Math.abs( (CalculeHauteur(3)-3) ) +
						Math.abs( (CalculeHauteur(5)-2.5) );
		utilite = result;
		return utilite;
	}
	@Override
	public int compareTo(Sequence arg0) {
		int retour = 0;
		double precision = 100000000;
		
			retour = (int)Math.round(precision*(arg0.utilite-utilite));
		
			
		return retour;
	}
	
	
	public double CalculeHauteur(int x) {
		double result = -9.8 / ( 2 * Math.sqrt(genes[1]) * genes[3] )*
						(1 + Math.sqrt( Math.tan(genes[2]) ))*Math.sqrt(x)+
						Math.tan(genes[2])*x + genes[0];
						
						
		return result;
	}
	
	@Override
	public String toString() {
		return "Sequence [genes=" + Arrays.toString(genes) + ", longueurSequence=" + longueurSequence
				+ ", tauxGenesMutants=" + tauxGenesMutants + ", nbGenesAMuter=" + nbGenesAMuter + "]";
	}
	
	public double  getUtilite() {
		return utilite;
	}

	
}
