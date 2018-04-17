package com.balistique;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
			System.out.println(listeSequences.get(i).getUtilite());
		
		scorer();
		System.out.println("----------------------------");
		
		for(int i = 0 ; i < listeSequences.size() ; i++) 
			System.out.println(listeSequences.get(i).getUtilite());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	void croiserMeilleurs()
	{
		if(listeSequences.size()>=2)
		{
			for(int i=0; i<listeSequences.size(); i++)
			{
				for(int j=0; j<listeSequences.size(); j++)					
				{
					if(i==j) continue;
					Sequence enfant = listeSequences.get(i).croiserSequence(listeSequences.get(j));
					listeSequences.add(enfant);
				}
			}			
		}
	}
	
	static void scorer()
	{
		/**ordonne la liste des sequence selon l'utilité*/
		listeSequences.sort(Comparator.comparing(Sequence::getUtilite));
		
	}	
}
