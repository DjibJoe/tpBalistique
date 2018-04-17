package com.balistique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 * @author Djohar
 *
 */
public class Main {
	static int nbSequence = 10;
	static Random hasard = new Random();
	static ArrayList<Sequence> listeSequences = new ArrayList<>(nbSequence);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** nb de sequence à creer **/
		

		for (int i = 0; i < nbSequence; i++) {
			Sequence s = new Sequence();
			s.create();
			listeSequences.add(s);
		}
		
		for(int i = 0 ; i < listeSequences.size() ; i++) 
			System.out.println( Arrays.toString(listeSequences.get(i).genes));
		
		System.out.println("----------------------------");
		
		for(int i = 0 ; i < listeSequences.size() ; i++) 
			System.out.println(listeSequences.get(i).getUtilite());
		
		
	}
	
	
	static void scorer()
	{
		final TreeSet<Sequence> ensemble = new TreeSet<>();
		listeSequences.forEach(s->ensemble.add(s));
		listeSequences.clear();
		listeSequences.addAll(ensemble);
	}	
}
