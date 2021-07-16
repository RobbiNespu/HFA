package io.robbinespu.math;

public class CustomMath {
    public int FloorMod(int x, int y) {
        // cant use math.floormod, jdk issues
        // source : http://hg.openjdk.java.net/jdk/jdk/file/e70cbaf159f5/src/java.base/share/classes/java/lang/Math.java
        int mod = x % y;
        // if the signs are different and modulo not zero, adjust result
        if ((mod ^ y) < 0 && mod != 0) {
            mod += y;
        }
        return mod;
    }
}
