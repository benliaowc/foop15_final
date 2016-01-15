import java.lang.*;
import java.util.*;

public class Tile {
	
	private String[] suit_dictionary = {"�U", "��", "��"};
	private String[] value_dictionary = {"�@", "�G", "�T", "�|", "��", "��", "�C", "�K", "�E"};
	private String[] word_dictionary = {"�F", "�n", "��", "�_", "��", "�o", "��"};
	
	public final int suit;
	public final int value;
	public final int index;	
	private int size;

	public Tile(int s, int v, int i){
		suit = s;
		value = v;
		index = i;
		size = 1;
	}

	public int getSize(){
		return size;
	}

	public void addSize(int s){
		size += s;
	}
	
	public String toString(){
		if(suit == 3)
			return word_dictionary[value] + " " + index;
		else
			return value_dictionary[value] + suit_dictionary[suit] + " " + index;
	}
	
}