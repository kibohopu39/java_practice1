package execute;

import java.util.Collections;
import java.util.LinkedList;

public class poker4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> P = new LinkedList<Integer>();
		for(int i=0;i<52;i++)P.add(i);
		Collections.shuffle(P);
		for (Integer v:P) {
			System.out.println(v);
		}
	}

}
