package dataHandling;

import java.util.ArrayList;

import data.Tagesplan;

public interface DataManager {
	public void save(Tagesplan plan);
	public ArrayList<Tagesplan> leseAlleAufgaben();

	
}