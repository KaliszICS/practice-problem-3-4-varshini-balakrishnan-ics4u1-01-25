import java.util.*;
public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int[] recaman(int n) {
		if (n<= 0) {
			return new int[0];
		}
		int[] seq = new int[n];
		seq[0] = 0;
		recamanHelper(seq, 1);
		return seq;
	}
	public static void recamanHelper(int[] seq, int i) {
		if (i>= seq.length) {
			return;
		}
		int next = seq[i-1] - i;
		if (next > 0 && ! usedBefore(seq, next, i)) {
			seq[i] = next;
		} else {
			seq[i] = seq[i-1] + i;
		}
		recamanHelper(seq, i+1);
	}
	public static int boolean usedBefore(int[] seq, int value, int limit) {
		for (int j = 0; j < limit; j++) {
			if (seq[j] == value) {
				return true;
			}
		}
		return false;
	}
}
	