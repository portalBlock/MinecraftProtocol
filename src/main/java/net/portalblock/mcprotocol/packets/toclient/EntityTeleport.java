package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/22/2017.
 */
public class EntityTeleport {

    private VarInt entityId;

    private double x, y, z;

    private byte yaw, pitch;

    private boolean onGround;

}
