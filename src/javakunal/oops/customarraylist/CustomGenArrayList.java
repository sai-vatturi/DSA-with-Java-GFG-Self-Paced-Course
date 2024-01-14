package javakunal.oops.customarraylist;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size] = num;
        size++;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    public void print(){
        for(Object num: data){
            System.out.println(num);
        }
    }
    public T remove(){
        return (T) data[--size];

    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void set(int index, T value){
        data[index] = value;
    }
}
