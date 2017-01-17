package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

import java.util.UUID;

/**
 * Created by portalBlock on 1/16/2017.
 */
public class SpawnMob {

    private VarInt entityId;

    private UUID entityUuid;

    private VarInt type;

    private double x, y, z;

    private byte yaw, pitch, headPitch;

    private short velocityX, velocityY, velocityZ;

    //TODO Entity metadata

}
