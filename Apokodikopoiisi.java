public final class Apokodikopoiisi {

	private BitInputStream input;
	//Prepei na arxikopoiithei prin kalesoume tin read();

	public Kodikos_dentroy Kodikos_dentroy;

	public Apokodikopoiisi(BitInputStream in) {
			if (in == null)
				throw new NullPointerException("Null argument");
			input = in;
	}

	public int read() throws IOException {
			if (Kodikos_dentroy == null)
				throw new NullPointerException("null code");

			Esoterikos_komvos currentNode = Kodikos_dentroy.root;
			while (true) {
				int temp = input.readNoEof();
				Node nextNode;
				if      (temp == 0) nextNode = currentNode.leftChild;
				else if (temp == 1) nextNode = currentNode.rightChild;
				else throw new AssertionError();

				if (nextNode instanceof  Fyllo)
					return (( Fyllo)nextNode).symbol;
				else if (nextNode instanceof Esoterikos_komvos)
					currentNode = (Esoterikos_komvos)nextNode;
				else
						throw new AssertionError();
			}
	}

}
