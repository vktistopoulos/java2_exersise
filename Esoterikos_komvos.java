public final class Esoterikos_komvos extends Komvos {
public final  Komvos left;
public final  Komvos right;

public Esoterikos_komvos( Komvos left,  Komvos right) {
if (left == null || right == null)
throw new NullPointerException("NullPointerException!!");
this.left = left;
this.right = right;
}
}
