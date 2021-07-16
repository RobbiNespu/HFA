package io.robbinespu.hashing;

public class QuadraticProbing implements IProbing {
    @Override
    public int probe(int key, int j) {
        int probe = (int) Math.pow((int) Math.ceil((double) j / 2), 2) * (int) Math.pow(-1, j);
        System.out.println("DEBUG probing :" + key +"/"+ j + " with value= "+probe);
        return probe;
    }

    public String toString() {
        return "QuadraticProbing";
    }
}
