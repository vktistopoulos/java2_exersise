public final class Kodikopoiisi {
	private BitOutputStream output;
	//Prepei na arxikopoiithei prin kalesoume tin write();

	public Kodikos_dentroy Kodikos_dentroy;
	// O kodikos dentroy borei na allaxei afou kathe simvolo kodikopoiithei,arkei i kadikopoisi kai i apokodikopoiisi na exoume ton idio kodiko dentroy tin idia stigmi;

	public Kodikopoiisi(BitOutputStream out) {
			if (out == null)
				throw new NullPointerException("Null argument");
			output = out;
	}
	public void write(int symbol) throws IOException {
			if (codeTree == null)
				throw new NullPointerException("Null κωδικος");

			List<Integer> bits = Kodikos_dentroy.getCode(symbol);
			for (int b : bits)
				output.write(b);
	}
}
