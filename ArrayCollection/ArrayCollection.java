public class ArrayCollection {

    private Object[] elementData;
    private int size = 0;

    public ArrayCollection(int n) {
        size = 0;
        elementData = new Object[n];
    }

    public int size() {
        return size;
    }


    public void add(Object obj) {
        elementData[size] = obj;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object obj) {
        return search(obj) != -1;
    }

    public int search(Object obj) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Object obj) {
        int s = search(obj);
        if (s != -1) {
            for (int i = s + 1; i < size; i++) {
                elementData[i - 1] = elementData[i];
            }
            elementData[size] = null;
            size--;
        } else {
            System.out.print("no such object");
        }
    }

    public String toString() {
        String re = "";
        for (int i = 0; i < size; i++) {
            re += elementData[i] + ", ";
        }
        return re;
    }
}