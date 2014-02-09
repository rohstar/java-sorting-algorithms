import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class quickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		//l.add(10); l.add(7); l.add(13); l.add(22); l.add(9);
		//l.get(2);
		Random rd = new Random();
		for (int i=0; i<10000;i++){

			l.add(rd.nextInt(1000));	
		}
		long start = System.currentTimeMillis();
	    //System.out.println(sort(l));
		sort(l);
	    long end = System.currentTimeMillis();
	    System.out.println((end-start)/1000+" secs");
	}

	public static List<Integer> sort(List<Integer> l) {

		if (l.size() <= 1) {
			return l;
		}

		int pivot = l.get(0);
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();

		for (int i = 1; i < l.size(); i++) {
			if (l.get(i) < pivot) {
				left.add(l.get(i));
				
			} else {
				right.add(l.get(i));
			
			}	
		}
		return join(sort(left), sort(right), pivot);
	}

	public static List<Integer> join(List<Integer> left, List<Integer> right, int pivot) {

		List<Integer> l =  new ArrayList<Integer>();

		for (int i = 0; i < left.size(); i++) {
			l.add(left.get(i));
		}
		
		l.add(pivot);
		
		for (int i = 0; i < right.size(); i++) {
	        l.add(right.get(i));
	}
		return l;
	}
	
}
