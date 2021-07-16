package io.robbinespu.hashing;

import io.robbinespu.Constants;
import io.robbinespu.math.CustomMath;
import io.robbinespu.tables.HashArray;

import java.util.Arrays;

public class HashTableRandom {
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

    public HashTableRandom(int size, IHash hashAlgorithm, IProbing probingAlgorithm) {
        super();
        this.size = size;
        this.hashAlgorithm = hashAlgorithm;
        this.probingAlgorithm = probingAlgorithm;
        this.hashArray = new HashArray(size);
    }

    void insert(int key) throws Exception {
        int j = 0;
        int hashValue = hashAlgorithm.hash(key);
        System.out.println("DEBUG: hash value = "+hashValue);
        do {
            int addr = calculateIndex(hashValue, key, j); // Quadratic happen here on J value!
            System.out.println("DEBUG: addr value = "+addr);
            if (hashArray.isFree(addr) || hashArray.isMarkedAsDeleted(addr)) {
                hashArray.set(addr, key);
                debug(String.format(sMsgKeyInsertAt, key, addr));
                return;
            }else{
                System.out.println("Index: " + addr + " is already occupied. Trying next empty cell...");
            }
            j++;
        } while (j < size);
        throw new Exception(String.format(sExceptionNoSpaceFree, key));

    }

    void remove(int key) throws Exception {
        // should not random prob if to delete, so we itterate the hash!
        int[] arr = hashArray.toArray();
        int addr = 0;
        debug(Arrays.toString(arr));
        for (int i = 0; i < Constants.TABLE_SZ; i++) {
            if(arr[i] == key){
                addr = i;
                System.out.println("Found on index="+arr[i]);
                break;
            }
        }
        if (hashArray.compareKeys(addr, key)) {
            hashArray.markAsDeleted(addr);
            debug(String.format(sMsgKeyMarkedAsDeleted, key, addr));
        }
        if (hashArray.compareKeys(addr, key)) {
            throw new Exception(String.format(sExceptionKeyNotFound, key));
        }
    }
    int binarySearch(int arr[], int x) // cannot use because data is unsorted
    {
        System.out.println("DEBUG arr[m].lenght ="+arr.length);
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }


    int search(int key) throws Exception {
        // binary search
        int[] arr = hashArray.toArray();
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("Sorted array = "+Arrays.toString(arr));
        // start
        int result = binarySearch(arr, key);
        if (result == -1) {
            throw new Exception(String.format(sExceptionKeyNotFound, key));
        }else {
            System.out.println("Element found on hash table " + result + "(sorted by binary search)");
            return arr[result];
        }
    }

    void clear() {
        this.hashArray.clear();
    }

    @Override
    public String toString() {
        String builder = hashAlgorithm.toString() +
                " method with " +
                probingAlgorithm.toString() +
                " - Hashtable - " +
                hashArray;
        return builder;
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
