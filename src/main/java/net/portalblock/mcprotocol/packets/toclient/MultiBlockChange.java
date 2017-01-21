package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/21/2017.
 */
public class MultiBlockChange {

    private int chunkX, chunkY;

    private VarInt recordCount;

    private MultiBlockChange[] records;

    public class MultiBlockChangeEntry {

        private byte horizontalPosition, yCoordinate;

        private VarInt blockId;

    }

}
