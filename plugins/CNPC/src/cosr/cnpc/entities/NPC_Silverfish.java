package cosr.cnpc.entities;

import cn.nukkit.entity.Entity;
import cn.nukkit.entity.data.FloatEntityData;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;


public class NPC_Silverfish extends CNPC_Entity{

    public static final int NID = 39;

    public NPC_Silverfish(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
        height = 0.4f;
        this.setDataProperty(new FloatEntityData(Entity.DATA_BOUNDING_BOX_HEIGHT, this.height), true);
    }
    

    @Override
    public int getNetworkId() {
        return NID;
    }


}
