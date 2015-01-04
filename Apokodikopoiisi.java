public final class Apokodikopoiisi {

	private eisagwgh_biτ input;
	//Prepei na arxikopoiithei prin kalesoume tin read();

	public Kodikos_dentroy Kodikos_dentroy;

	public Apokodikopoiisi(eisagwgh_bit  in) {
			if (in == null)
				throw new NullPointerException("Null argument");
			input = in;
	}

	public int read() throws IOException {
			if (Kodikos_dentroy == null)
				throw new NullPointerException("null code");

			Esoterikos_komvos currentKomvos = Kodikos_dentroy.root;
			while (true) {
				int temp = input.readNoEof();
				Komvos nextKomvos ;
				if      (temp == 0) nextKomvos = currentKomvos.leftChild;
				else if (temp == 1) nextKomvos = currenKomvos.rightChild;
				else throw new AssertionError();

				if (nextKomvos instanceof  Fyllo)
					return (( Fyllo)nextKomvos).symbol;
				else if (nextKomvos instanceof Esoterikos_komvos)
					currentKomvos = (Esoterikos_komvos)nextKomvos ;
				else
						throw new AssertionError();
			}
	}

}
