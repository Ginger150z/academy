package hwRegExp.inner;

import java.util.Arrays;

public class GenericArray<T> {

    T[] array;

    int currentIndex = 0;


    public GenericArray() {
        array = (T[])new Object[16];
    }

    public GenericArray(int length) {
        array = (T[])new Object[length];
    }

    public void add(T item) {

        if (currentIndex + 1 > array.length) {
            array = Arrays.copyOf(array, array.length * 2 + 1);
        }

        array[currentIndex++] = item;

        System.out.println("-----");
        System.out.println("Added new item: " + item.toString());
        System.out.println("-----");
    }

    public T get(int index) {
        if (index > array.length - 1 || index < 0) {
            System.out.println("-----");
            System.out.println("Failed to get item: no such index");
            System.out.println("-----");

            return null;
        }

        return array[index];
    }

    public T getLast() {
        return array[array.length - 1];
    }

    public T getFirst() {
        return array[0];
    }

    public int getLength() {
        return array.length;
    }

    public int getLastFilledItemIndex() {

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != null) {
                return i;
            }
        }

        return -1;
    }

    public void remove(int index) {
        if (index > array.length - 1 || index < 0) {
            System.out.println("-----");
            System.out.println("Failed to remove item from the array: no such index");
            System.out.println("-----");

            return;
        }

        if (currentIndex != index) {
            System.arraycopy(array, index + 1, array, index, array.length - index - currentIndex);
        }

        array[currentIndex] = null;
        currentIndex--;
    }

    public void remove(T item) {
        int index = -1;

        for (int i = 0; i < currentIndex; i++) {
            if (array[i].equals(item)) {
                index = i;
            }
        }

        if (index == -1) {
            return;
        }


        if (currentIndex != index) {
            System.arraycopy(array, index + 1, array, index, array.length - index - currentIndex);
        }

        array[currentIndex] = null;
        currentIndex--;
    }

    public static void main(String[] args) {

        GenericArray<Integer> array = new GenericArray<>();

        array.add(34);
        array.add(23);
        array.add(9807);

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));

        System.out.println(array.getLastFilledItemIndex());
        System.out.println(array.getLast());
        System.out.println(array.getFirst());

        array.remove(Integer.valueOf(9807));

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));


    }
}
