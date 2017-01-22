package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/22/2017.
 */
public class EntityEffect {

    private VarInt entityId;

    private byte effectId, amplifier;

    private VarInt duration;

    private byte flags;

}
