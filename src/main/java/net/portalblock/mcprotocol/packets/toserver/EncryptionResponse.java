package net.portalblock.mcprotocol.packets.toserver;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/22/2017.
 */
public class EncryptionResponse {

    private VarInt sharedSecretLength;

    private byte[] sharedSecret;

    private VarInt verifyTokenLength;

    private byte[] verifyToken;

}
