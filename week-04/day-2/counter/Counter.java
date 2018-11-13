package counter;

public class Counter {
    int n = 0;
    int init;

    Counter(int n) {
        this.n = n;
        this.init = n;
    }

    public Counter() {
    }

    void add(int number) {
        n += number;
    }

    void add(){
        n++;
    }

    int get(){
        return n;
    }

    void reset(){
        n = init;
    }



}
