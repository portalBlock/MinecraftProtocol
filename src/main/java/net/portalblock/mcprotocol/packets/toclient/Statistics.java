package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/16/2017.
 */
public class Statistics {

    private VarInt count;

    private Statistic[] statistics;

    public class Statistic {

        private String name;

        private VarInt value;

    }

}
