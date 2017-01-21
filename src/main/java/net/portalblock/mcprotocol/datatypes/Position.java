package net.portalblock.mcprotocol.datatypes;

/**
 * Created by portalBlock on 1/16/2017.
 */
public class Position {

    private int x, y, z;

    public void read() {
        long val = 0; //TODO = Unsigned long
        x = (int) val >> 38;
        y = (int) (val >> 26) & 0xFFF;
        z = (int) val << 38 >> 38;
    }

    public void write() {
        long val = ((x & 0x3FFFFFF) << 38) | ((y & 0xFFF) << 26) | (z & 0x3FFFFFF);
        //TODO Write val
    }

    /*
    Note: The details of bit shifting are rather language dependent; the above may work in Java but probably won't in other languages without some tweaking. In particular, you will usually receive positive numbers even if the actual coordinates are negative. This can be fixed by adding something like the following:

    if x >= 2^25 { x -= 2^26 }
    if y >= 2^11 { y -= 2^12 }
    if z >= 2^25 { z -= 2^26 }
     */

}
