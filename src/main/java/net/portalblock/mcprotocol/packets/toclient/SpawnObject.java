package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

import java.util.UUID;

/**
 * Created by portalBlock on 1/16/2017.
 */
public class SpawnObject {

    private VarInt entityId;

    private UUID objectUuid;

    private byte type;

    private double x, y, z;

    private byte pitch, yaw;

    private int data;

    private short velocityX, velocityY, velocityZ;

}
