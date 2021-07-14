package io.robbinespu;

import java.util.Arrays;

public class QuadraticProbing {
    Integer[] table;
    int count;

    public QuadraticProbing(int TABLE_SZ) {
        table = new Integer[TABLE_SZ];
        count = 0;
    }

    @Override
    public String toString() {
        return "HashTableQuadraticProbing{" +
                "table=" + Arrays.toString(table) +
                ", count=" + count +
                '}';
    }
}
