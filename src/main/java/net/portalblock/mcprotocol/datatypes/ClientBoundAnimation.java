package net.portalblock.mcprotocol.datatypes;

/**
 * Created by portalBlock on 1/16/2017.
 */
public enum ClientBoundAnimation {

    SWING_MAIN_ARM(0),
    TAKE_DAMAGE(1),
    LEAVE_BED(2),
    SWING_OFFHAND(3),
    CRITICAL_EFFECT(4),
    MAGIC_CRITICAL_EFFECT(5);

    private byte id;

    private ClientBoundAnimation(int id) {
        this.id = (byte) id;
    }

    public byte getId() {
        return this.id;
    }

    public static ClientBoundAnimation valueOf(byte id) {
        for(ClientBoundAnimation cba : ClientBoundAnimation.values())
            if(cba.getId() == id)
                return cba;
        return null;
    }

}
