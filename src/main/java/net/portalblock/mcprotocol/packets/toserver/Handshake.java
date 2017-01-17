package net.portalblock.mcprotocol.packets.toserver;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/16/2017.
 */
public class Handshake {

    private VarInt protocolVersion;

    private String serverAddress;

    private short serverPort;

    private VarInt nextState;



}
