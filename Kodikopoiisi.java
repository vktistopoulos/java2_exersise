public final class Kodikopoiisi {
	private Eksagwgh_bit output;
	//Prepei na arxikopoiithei prin kalesoume tin write();

	public Kodikos_dentroy kodikos_dentroy;
	// O kodikos dentroy borei na allaxei afou kathe simvolo kodikopoiithei,arkei i kadikopoisi kai i apokodikopoiisi na exoume ton idio kodiko dentroy tin idia stigmi;

	public Kodikopoiisi(Eksagwgh_bit out) {
			if (out == null)
				throw new NullPointerException("Null argument");
			output = out;
	}
	public void write(int symbol) throws IOException {
			if ( Kodikos_dentroy == null)
				throw new NullPointerException("Null κωδικος");

			List<Integer> bits = Kodikos_dentroy.getCode(symbol);
			for (int b : bits)
				output.write(b);
	}
}
