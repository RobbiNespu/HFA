package io.robbinespu.hashing;

import io.robbinespu.Constants;

public class RandomProbing implements IProbing {
    @Override
    public int probe(int key, int j) {
        int min = 0;
        int max = Constants.TABLE_SZ -1;
        int probe = (int)(Math.random()*(max-min+1)+min);
        System.out.println("DEBUG probing :" + key +"/"+ j + " with value= "+probe);
        return  probe;
    }

    public String toString() {
        return "RandomProbing";
    }
}
