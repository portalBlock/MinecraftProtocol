package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/21/2017.
 */
public class NamedSound {

    private String soundName;

    private VarInt soundCategory;

    private int effectX, effectY, effectZ;

    private float volume, pitch;

}
