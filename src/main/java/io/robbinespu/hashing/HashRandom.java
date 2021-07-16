package io.robbinespu.hashing;

import io.robbinespu.Constants;
import io.robbinespu.math.CustomMath;

public class HashRandom implements IHash{
    private int size;

    CustomMath customMath = new CustomMath();

    public HashRandom(int size) {
        super();
        this.size = size;
    }

    @Override
    public int hash(int key) {
        int prime_number = 31;
        return (key + prime_number) % Constants.TABLE_SZ + 1;
    }

    @Override
    public String toString() {
        return "Hash";
    }

}
