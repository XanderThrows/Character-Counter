package pack;
import java.io.File;   
import java.util.Scanner;
//import java.util.Vector;
import java.util.LinkedList;

public class LinkedListCounter {
	
	private char ch;
	private int frequency;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File myFile = new File("wap.txt");
		Scanner myTxt = new Scanner(myFile);
		//ListCount[] counters = new ListCount[128];
		//Vector<ListChar> counters = new Vector<ListChar>(128);
		LinkedList<LinkedListCounter> counters = new LinkedList<LinkedListCounter>();
			
		for(int i=0; i < 169; i++) {
			LinkedListCounter cc = new LinkedListCounter();
			//casting i to char
			cc.setCharacter((char)i);
			//counters.set(i, cc);
			counters.add(cc);
		}
			
		while(myTxt.hasNext()){
			String token = myTxt.next();
			for(int i=0;i<token.length(); i++) {
				char ch = token.charAt(i);
				//for each
				for(LinkedListCounter cc: counters) {
					if(cc.equals(ch)) {
						cc.increment();
						}
					}
				}
			}
			
			for(LinkedListCounter cc: counters) {
				//non zero values
				if(cc.getFrequency() != 0) {
					System.out.println(cc);
				}
			}
			
	}
	
	public char getCharacter() {
		return ch;
	}
	
	public void setCharacter(char ch) {
		this.ch = ch;
	}
	
	public int getFrequency(){
		return frequency;
	}
	
	public void setFrequency(int frequency){
		this.frequency = frequency;
	}
	
	public void increment(){
		frequency++;
	}
	
	public boolean equals(char ch) {
		if(this.ch == ch){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString() {
		return ch + " (" + ((int) ch) + ") " + frequency;
	}

}