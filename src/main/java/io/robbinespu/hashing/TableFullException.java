package io.robbinespu.hashing;

public class TableFullException extends Exception {
    public TableFullException() {
        super("Error!  table size is full!!");
    }
}
