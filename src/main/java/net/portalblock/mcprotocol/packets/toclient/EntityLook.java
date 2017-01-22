package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/21/2017.
 */
public class EntityLook {

    private VarInt entityId;

    private byte yaw, pitch;

    private boolean onGround;

}
