package com.ordestiny.tdd.primitive.casting;

public class Shorts {


    /**
     * from byte to short is implicit
     *
     * @param to is a byte
     * @return
     */
    public static short from(byte to) {
        return to;
    }

    /**
     * from char to short explicit
     *
     * @param to
     * @return
     */
    public static short from(char to) {
        if (to > Short.MAX_VALUE)
            throw new IllegalArgumentException();

        return (short) to;
    }

    /**
     * from int to short is explicit
     *
     * @param to
     * @return
     */
    public static short from(int to) {
        if (to > Short.MAX_VALUE || to < Short.MIN_VALUE)
            throw new IllegalArgumentException();

        return (short) to;
    }

    /**
     * from long to short is explicit
     *
     * @param to
     * @return
     */
    public static short from(long to) {

        if (to > Short.MAX_VALUE || to < Short.MIN_VALUE)
            throw new IllegalArgumentException();

        return (short) to;
    }

    /**
     * from float to short is explicit
     *
     * @param to
     * @return
     */
    public static short from(float to) {
        if (to > Short.MAX_VALUE || to < Short.MIN_VALUE)
            throw new IllegalArgumentException();

        return (short) to;
    }

    /**
     * from double to short is explicit
     */
    public static short from(double to) {
        if (to > Short.MAX_VALUE || to < Short.MIN_VALUE)
            throw new IllegalArgumentException();

        return (short) to;
    }
}
