package io.robbinespu.hashing;

import io.robbinespu.math.CustomMath;

public class Hash implements IHash{
    private int size;

    CustomMath customMath = new CustomMath();

    public Hash(int size) {
        super();
        this.size = size;
    }

    @Override
    public int hash(int key) {
        return customMath.FloorMod(key,size);
    }

    @Override
    public String toString() {
        return "Hash";
    }
}
