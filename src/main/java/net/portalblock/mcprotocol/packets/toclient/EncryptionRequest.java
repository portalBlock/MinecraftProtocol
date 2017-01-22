package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/22/2017.
 */
public class EncryptionRequest {

    private String serverId;

    private VarInt publicKeyLength;

    private byte[] publicKey;

    private VarInt verifyTokenLength;

    private byte[] verifyToken;

}
