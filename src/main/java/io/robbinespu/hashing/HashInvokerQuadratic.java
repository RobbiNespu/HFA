package io.robbinespu.hashing;

import io.robbinespu.tables.HashArray;

public class HashInvokerQuadratic {
    private static final String sMsgRemoveKey = "Remove key '%d' from the hash table.";
    private static final String sMsgSearchForKey = "Search for key '%d' in the hash table.";
    private static final String sMsgSearchKeyFound = "Found key '%d' in hash table.";
    private static final String sMsgGetKeyFound = "Got key '%d' in hash table";
    private static final String sMsgIsCleared = "The hash table is cleared";
    private static final String sMsgIndexIsOutOfBounds = "Index is out of Bounds";
    private static final String sMsgNoElement = "There is no element at this index";

    static public void insert(HashTableQuadratic table, int key) {
        try {
            table.insert(key);
            print(table.toString());
        } catch (Exception e) {
            flush(e);
        }
    }

    static public void search(HashTableQuadratic table, int key) {
        try {
            print(String.format(sMsgSearchForKey, key));
            print(String.format(sMsgSearchKeyFound, table.search(key)));
        } catch (Exception e) {
            flush(e);
        }
    }

    static public void remove(HashTableQuadratic table, int key) {
        try {
            print(String.format(sMsgRemoveKey, key));
            table.remove(key);
            print(table.toString());
        } catch (Exception e) {
            flush(e);
        }
    }

    static public void print(String text) {
        System.out.println(text);
        System.out.flush();
    }

    static public void getValue(HashTableQuadratic table, int idx) {
        HashArray array = table.getHashArray();
        if (idx > array.getSize() || idx < 0) {
            print(sMsgIndexIsOutOfBounds);
        } else if (array.isFree(idx) || array.isMarkedAsDeleted(idx)) {
            print(sMsgNoElement);
        } else
            print(String.format(sMsgGetKeyFound, array.get(idx)));
    }

    static public void clear(HashTableQuadratic table) {
        table.clear();
        print(sMsgIsCleared);
    }

    static private void flush(Exception e) {
        System.out.flush();
        System.err.println(e.getMessage());
        System.err.flush();
    }
}
