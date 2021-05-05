public class Cut {
    int leftEnd;
    int rightEnd;

    public Cut(int leftEnd, int rightEnd) {
        this.leftEnd = leftEnd;
        this.rightEnd = rightEnd;
    }

    public int getLeftEnd() {
        return leftEnd;
    }

    public void setLeftEnd(int leftEnd) {
        this.leftEnd = leftEnd;
    }

    public int getRightEnd() {
        return rightEnd;
    }

    public void setRightEnd(int rightEnd) {
        this.rightEnd = rightEnd;
    }

    @Override
    public String toString() {
        return "Cut{" +
                "leftEnd=" + leftEnd +
                ", rightEnd=" + rightEnd +
                '}';
    }
}
