package me.fdd2001.mod.Diamerald;

import java.util.Random;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@SuppressWarnings("unchecked")
public class mcreator_radiosonde {

	


    public void load(){}

    public void generateNether(World world, Random random, int chunkX, int chunkZ){}
	public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
	public int addFuel(ItemStack fuel){
		return 0;
	}
	public static void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(mcreator_radiosonde.Entityradiosonde.class, new RenderBiped(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation(DiameraldMod.MODID + ":textures/entity/radiosonde.png");}});
	}
	


    /*public Entity spawnEntity(int var1, World var2, double var3, double var5, double var7)
    {
        if(var1==mobid)
                return new mcreator_radiosonde.Entityradiosonde(var2);
        else
                return null;
    }*/


   public static class Entityradiosonde extends EntityVillager 
	{
		World world = null;
	    public Entityradiosonde(World var1)
	    {
	        super(var1);
	        world = var1;
	        experienceValue = 5;
	        this.isImmuneToFire = false;
	        addRandomArmor();
        	
this.tasks.addTask(10, new EntityAIWander(this, 0.5D));
this.tasks.addTask(9, new EntityAILookIdle(this));

	    }

	    

	    

	    
protected void addRandomArmor(){

}

protected void dropRareDrop(int par1){
this.dropItem(Items.iron_sword, 1);
}


    	public boolean isAIEnabled()
		{
			   return true;
    	}

	    /**
	     * Drop 0-2 items of this living's type
	     */
	    protected void dropFewItems(boolean var1, int var2)
	    {
	        this.entityDropItem(new ItemStack(Items.apple), 0.0F);
	    }

	    /**
	     * Returns the sound this mob makes while it's alive.
	     */
	    protected String getLivingSound()
	    {
	        return "";
	    }

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound()
	    {
	        return DiameraldMod.MODID + ":damage";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound()
	    {
	    	return DiameraldMod.MODID + ":death";
	    }

	    public void onStruckByLightning(EntityLightningBolt entityLightningBolt){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			
		}

		protected void fall(float l){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			super.fall(l);
			
		}

    	public void onCriticalHit(Entity entity) {
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			
		}

		public void onKillEntity(EntityLiving entityLiving){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			
		}

		public boolean interact(EntityPlayer entity){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			
			return true;
		}

		public String getEntityName(){
			return "radiosonde";
		}

	}

	

}
