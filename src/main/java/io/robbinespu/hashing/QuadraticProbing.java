package io.robbinespu.hashing;

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

    public void insert(Integer s, int TABLE_SZ) throws TableFullException {
        int index = (s.hashCode())%TABLE_SZ;
        int countie = 0;
        int countOFiters=0;
        if (containsKeyQuadraticProbing(s,TABLE_SZ)){
            System.out.println("Already there.. DUPLICATE");
            return;
        }
        if (count == TABLE_SZ){
            throw new TableFullException();
        }
        if (table[index] == null){
            table[index] = s;
            count++;
            return;
        }else{
            for (int i = index; true ; i = index + (countie*countie)) {
                if (countOFiters > 100){
                    System.out.println("NO NO NO");
                    break;
                }
                if (i == TABLE_SZ || i > TABLE_SZ){
                    int indexies = i % TABLE_SZ;
                    if (table[indexies] == null){
                        table[indexies] = s;
                        count++;
                        break;
                    }
                    countOFiters++;
                    countie++;
                    continue;
                }
                if (table[i] == null){
                    table[i] = s;
                    count++;
                    break;
                }
                countOFiters++;
                countie++;
            }

        }
    }

    public boolean containsKeyQuadraticProbing (Integer s, int TABLE_SZ){
        int countOfIters = 0;
        int countMe = 0;
        int index = (s.hashCode())%TABLE_SZ;
        if (table[index]!=null){
            if (table[index].equals(s)){
                return true;
            }
        }
        for (int i = index; true ; i = index + (countMe*countMe)) {
            if (countOfIters > TABLE_SZ+10){
                return false;
            }
            if (i == TABLE_SZ || i > TABLE_SZ){
                int indexies = i % TABLE_SZ;
                if (table[indexies] != null){
                    if (table[indexies].equals(s)){
                        return true;
                    }
                }
                countOfIters++;
                countMe++;
                continue;
            }
            if (table[i] != null){
                if (table[i].equals(s)){
                    return true;
                }
            }
            countOfIters++;
            countMe++;
        }
    }
}
