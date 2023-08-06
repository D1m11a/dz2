package ArrayList;

public class myArrayList {

    private Object[] data;
    private int size;

    public myArrayList() {
        data = new Object[10];
        size = 0;
    }

    public void add(Object value) {

        if (size == data.length) {
            increaseCapacity();
        }
        data[size] = value;
        size++;
    }

    private void increaseCapacity() {
        int newCapacity = data.length * 2;
        Object[] newData = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }


    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }

    public void clear() {
        data = new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 && index > size) {
            return data[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index" + index);
        }
    }
}
