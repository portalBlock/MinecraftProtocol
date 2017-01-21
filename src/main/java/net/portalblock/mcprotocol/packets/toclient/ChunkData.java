package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/21/2017.
 */
public class ChunkData {

    private int chunkX, chunkZ;

    private boolean groundUpContinuous;

    private VarInt primaryBitMask, size;

    //TODO Data

    private byte[] biomes;

    private VarInt blockEntityCount;

    //TODO private NBTTag[] blockEntities;

}
