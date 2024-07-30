package 설지수.chapter13;

public class X {
    private int lastIdUsed;

    public X(int lastIdUsed) {
        this.lastIdUsed = lastIdUsed;
    }

    public int getNextId(){
        return ++lastIdUsed;
    }
}
