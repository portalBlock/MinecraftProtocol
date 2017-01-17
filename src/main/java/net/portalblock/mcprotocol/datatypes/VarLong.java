package net.portalblock.mcprotocol.datatypes;

/**
 * Created by portalBlock on 1/16/2017.
 */
public class VarLong {

    private Long value = null;

    public VarLong() {

    }

    public VarLong(long value) {
        this.value = value;
    }

    public long read() {
        if(value != null) return value;
        int numRead = 0;
        long result = 0;
        byte read;
        do {
            read = 0; //TODO Read Byte from buf!
            int value = (read & 0b01111111);
            result |= (value << (7 * numRead));
            numRead++;
            if (numRead > 10)
                throw new RuntimeException("VarLong is too big");
        } while((read & 0b10000000) != 0);
        return (value = result);
    }

    public void write() {
        if(value != null)
            do {
                byte temp = (byte)(value & 0b01111111);
                value >>>= 7;
                if (value != 0) {
                    temp |= 0b10000000;
                }
                //TODO Write to Buf! writeByte(temp);
            } while (value != 0);
    }

}
