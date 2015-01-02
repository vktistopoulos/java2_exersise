public final class Galeodes extends Basic {
public final Basic left;
public final Basic right;

public Galeodes(Basic left, Basic right) {
if (left == null || right == null)
throw new NullPointerException("NullPointerException!!");
this.left = left;
this.right = right;
}
}
