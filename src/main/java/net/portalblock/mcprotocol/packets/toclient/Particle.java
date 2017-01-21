package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/21/2017.
 */
public class Particle {

    private int particleId;

    private boolean longDistance;

    private float x, y, z, offsetX, offsetY, offsetZ, particleData;

    private int particleCount;

    private VarInt data;

}
