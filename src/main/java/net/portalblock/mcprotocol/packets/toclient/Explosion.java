package net.portalblock.mcprotocol.packets.toclient;

/**
 * Created by portalBlock on 1/21/2017.
 */
public class Explosion {

    private float x, y, z, radius;

    private int recordCount;

    private ExplosionEntry[] records;

    private float velocityX, velocityY, velocityZ;

    public class ExplosionEntry {

        private byte x, y, z;

    }

}
