package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/22/2017.
 */
public class UpdateScore {

    private String scoreName;

    private byte action;

    private String objectiveName;

    private VarInt value;

}
