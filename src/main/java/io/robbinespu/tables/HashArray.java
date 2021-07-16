package io.robbinespu.tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashArray {
    private int size;

    private static class Item {
        public Item(int key) {
            super();
            this.key = key;
        }

        int key = Integer.MIN_VALUE;
        boolean markAsDeleted = false;
    }

    private Item[] hashArray;

    public HashArray(int size) {
        super();
        this.size = size;
        this.hashArray = new Item[size];
    }


    public boolean isMarkedAsDeleted(int idx) {
        return this.hashArray[idx].markAsDeleted;
    }

    public boolean compareKeys(int idx, int key) {
        return this.hashArray[idx].key == key;
    }

    public void markAsDeleted(int idx) {
        this.hashArray[idx].markAsDeleted = true;
        this.hashArray[idx].key = Integer.MIN_VALUE;
    }

    public boolean isFree(int idx) {
        return this.hashArray[idx] == null;
    }

    public void set(int idx, int key) {
        this.hashArray[idx] = new Item(key);
    }

    public int get(int idx) {
        return this.hashArray[idx].key;
    }

    public void clear() {
        this.hashArray = new Item[size];
    }

    public int getSize() {
        return this.hashArray.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (Item item : hashArray) {
            if (item == null) {
                builder.append("**, ");
            } else {
                builder.append(item.markAsDeleted ? "##, " : item.key + ", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public int[] toArray(){
        String temp;
        StringBuilder builder = new StringBuilder();
        for (Item item : hashArray) {
            if (item == null) {
                builder.append("0,");
            } else {
                builder.append(item.markAsDeleted ? "0," : item.key + ",");
            }
        }
        temp = builder.toString();
        List<String> list = Arrays.asList(temp.split(","));

        int[] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++) array[i] = Integer.parseInt(list.get(i));
        return array;
    }
}
