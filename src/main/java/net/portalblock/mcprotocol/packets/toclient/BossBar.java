package net.portalblock.mcprotocol.packets.toclient;

import net.portalblock.mcprotocol.datatypes.VarInt;

/**
 * Created by portalBlock on 1/21/2017.
 */
public class BossBar {

    public class BossBarData {

        //TODO Chat

        private float health;

        private VarInt color, division;

        private byte flags;

    }

    public class BossBarAction {

        private int id;

        public BossBarAction(int id) {
            this.id = id;
        }

        //TODO Read/Write

    }

    public class AddBossBarAction extends BossBarAction {

        public AddBossBarAction() {
            super(0);
        }

    }


}
