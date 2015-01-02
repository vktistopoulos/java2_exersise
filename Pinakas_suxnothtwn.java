import java.util.PriorityQueue;
import java.util.Queue;

/*Collects the frequencies of symbols in the stream that we want to compress and builds a code tree for it.*/

public final class Pinakas_suxnothtwn {

	private int[] frequencies;
	public Pinakas_suxnothtwn(int[] freq) {
		if (freq == null) {
			throw new NullPointerException("Null Argument");
		}
		if (freq.length < 2) {
			throw new IllegalArgumentException("At least 2 symbols needed");
			frequencies = freq.clone();
		}
		for (int x=0; x<=frequencies; x++) {
			if (x < 0) {
				throw new IllegalArgumentException("Negative frequency");
			}
		}
	}
