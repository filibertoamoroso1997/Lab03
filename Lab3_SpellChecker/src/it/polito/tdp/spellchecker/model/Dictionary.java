package it.polito.tdp.spellchecker.model;

import java.util.*;
import java.io.*;

public class Dictionary {
	
	List<String> parole = new ArrayList<String>();
	
	public void loadDictionary(String lenguage) {
		try {
			FileReader fr = new FileReader("rsc/"+lenguage+".txt");
			BufferedReader br = new BufferedReader(fr);
			String word;
			
			while((word = br.readLine()) != null ) {
				parole.add(word);
			}
			br.close();
		}catch(IOException e) {
			System.out.println("Errore nella lettura dei file");
		}
	}
	
	public List<RichWord> spellCheckTest(List<String> inputTextList){
		List<RichWord> rw = new ArrayList<RichWord>();
		for(String s : inputTextList) {
			if(parole.contains(s)) {
				RichWord r = new RichWord(s, true);
				rw.add(r);
			}
			else {
				RichWord r = new RichWord(s, false);
				rw.add(r);
			}
				
		}
		return rw;
		
	}

}
