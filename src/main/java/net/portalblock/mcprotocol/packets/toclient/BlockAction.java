package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.Position;
import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/16/2017.
 */
public class BlockAction {

    private Position location;

    private byte actionId, actionParam;

    private VarInt blockType;

}
