package io.robbinespu.hashing;

import io.robbinespu.math.CustomMath;
import io.robbinespu.tables.HashArray;

public class HashTableQuadratic {
/* Todo:
    answers are duplicate, maybe it have same index?
    for example eg: {q1,r1} = {y} and {q1,r2} = {y} , which mean the both answered Y on Question 1
    so we should hash(answers) and copy the index on arrays

    --------
    |___Y__| index 0 <-- store (q1,r1) and (q1,r2) here (index : 0) == array answersQ1 = [ 0,0,1.....]
    |___N__| index 1 <--- q1,r3
    |__NIL_|

*/
    private int size;
    private IHash hashAlgorithm;
    private IProbing probingAlgorithm;
    private HashArray hashArray;

    private static final String sExceptionNoSpaceFree = "No free space in hash table for key %d !";
    private static final String sMsgKeyInsertAt = "Key '%d' inserted at index '%d' in hash table";
    private static final String sMsgCollision = "Increment collision counter j++ -> %d : [index=%d, key=%d]";
    private static final String sMsgKeyMarkedAsDeleted = "Key '%d' mark as deleted at index '%d' in hash table.";
    private static final String sExceptionKeyNotFound = "Key '%d' not found in hash table";
    public HashArray getHashArray() {
        return hashArray;
    }

    public static CustomMath customMath = new CustomMath();

    public HashTableQuadratic(int size, IHash hashAlgorithm, IProbing probingAlgorithm) {
        super();
        this.size = size;
        this.hashAlgorithm = hashAlgorithm;
        this.probingAlgorithm = probingAlgorithm;
        this.hashArray = new HashArray(size);
    }

    void insert(int key) throws Exception {
        int j = 0;
        int hashValue = hashAlgorithm.hash(key);
        do {
            int addr = calculateIndex(hashValue, key, j);
            if (hashArray.isFree(addr) || hashArray.isMarkedAsDeleted(addr)) {
                hashArray.set(addr, key);
                debug(String.format(sMsgKeyInsertAt, key, addr));
                return;
            }
            j++;
        } while (j < size);
        throw new Exception(String.format(sExceptionNoSpaceFree, key));

    }

    void remove(int key) throws Exception {
        int j = 0;
        int hashValue = hashAlgorithm.hash(key);
        do {
            int addr = (hashValue - probingAlgorithm.probe(key, j));
            if (hashArray.isFree(addr)) {
                break;
            }
            if (hashArray.compareKeys(addr, key)) {
                hashArray.markAsDeleted(addr);
                debug(String.format(sMsgKeyMarkedAsDeleted, key, addr));
                return;
            }
            j++;
            debug(String.format(sMsgCollision, j, addr, this.hashArray.get(addr)));
        } while (j < size);
        throw new Exception(String.format(sExceptionKeyNotFound, key));

    }

    int search(int key) throws Exception {
        int j = 0;
        int hashValue = hashAlgorithm.hash(key);
        do {
            int addr = calculateIndex(hashValue, key, j);
            if (hashArray.isFree(addr)) {
                break;
            }
            if (hashArray.compareKeys(addr, key)) {
                return hashArray.get(addr);
            }
            j++;
            debug(String.format(sMsgCollision, j, addr, this.hashArray.get(addr)));
        } while (j < size);
        throw new Exception(String.format(sExceptionKeyNotFound, key));
    }

    void clear() {
        this.hashArray.clear();

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(hashAlgorithm.toString());
        builder.append(" method with ");
        builder.append(probingAlgorithm.toString());
        builder.append(" - Hashtable - ");
        builder.append(hashArray);
        return builder.toString();
    }

    private int calculateIndex(int hashValue, int key, int j) {
        int x = hashValue - probingAlgorithm.probe(key, j);
        int y = size;
        return customMath.FloorMod(x,y);
    }

    private boolean debug = true;

    void debug(String s) {
        if (debug) {
            System.out.println(" " + s);
            System.out.flush();
        }
    }


}
