package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

import java.util.UUID;

/**
 * Created by portalBlock on 1/16/2017.
 */
public class SpawnPlayer {

    private VarInt entityId;

    private UUID playerUuid;

    private double x, y, z;

    private byte yaw, pitch;

    //TODO private EntityMetadata metadata;

}
