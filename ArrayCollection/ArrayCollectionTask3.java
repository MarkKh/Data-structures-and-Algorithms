public class ArrayCollectionTask3 {

    private Object[] elementData;
    private int size = 0;

    public ArrayCollectionTask3(int n) {
        this.size = 0;
        elementData = new Object[n];
    }

    public int size() {
        return size;
    }

    public void add(Object d) {
        elementData[size] = d;
        size++;
    }
}