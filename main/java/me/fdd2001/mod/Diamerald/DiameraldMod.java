package me.fdd2001.mod.Diamerald;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = DiameraldMod.MODID, version = DiameraldMod.VERSION)
public class DiameraldMod
{
    public static final String MODID = "diamerald";
    public static final String VERSION = "1.1";
    
    //public static DiameraldMod instance;
    
    public static int dhelmet, dchest, dleggings,dboots,ehelmet,echest,eleggings,eboots;

    //Creative Tabs
    public static CreativeTabs tabDiamerald = new tabDiamerald(CreativeTabs.getNextID(), "tabDiamerald");
    
    //Entity
    public Object instance;
    public static int mobid = 0;
    
    //Items
    public static Item diamerald;
    public static Item emeraldPickaxe;
    public static Item emeraldAxe;
    public static Item emeraldShovel;
    public static Item emeraldHoe;
    public static Item emeraldSword;
    
    public static Item diameraldPickaxe;
    public static Item diameraldAxe;
    public static Item diameraldShovel;
    public static Item diameraldHoe;
    public static Item diameraldSword;
    
    public static Item emeraldHelmet;
    public static Item emeraldChestplate;
    public static Item emeraldLeggings;
    public static Item emeraldBoots;
    
    public static Item diameraldHelmet;
    public static Item diameraldChestplate;
    public static Item diameraldLeggings;
    public static Item diameraldBoots;
    
    public static Block blackWood;
    public static Block blueWood;
    public static Block brownWood;
    public static Block cyanWood;
    public static Block grayWood;
    public static Block greenWood;
    public static Block lightBlueWood;
    public static Block limeWood;
    public static Block magentaWood;
    public static Block orangeWood;
    public static Block pinkWood;
    public static Block purpleWood;
    public static Block redWood;
    public static Block silverWood;
    public static Block whiteWood;
    public static Block yellowWood;
    
    public static Block radioBlock;
    public static Block enderBlock;
    public static Block fddBlock;
    
    public static Item diameraldPotato;
    
    public static Block diameraldOre;
    
    public static Block diameraldBlock;
    
    public static Block glowPlank;
    
    public static Item friedEgg;
    
    public static Item ultimateShard;
    public static Item ultimateSword;
    //
    public static Item ultimatePickaxe;
    public static Item ultimateShovel;
    public static Item ultimateHoe;
    public static Item ultimateAxe;
    
    public static Item ultimateHelmet;
    public static Item ultimateChestplate;
    public static Item ultimateLeggings;
    public static Item ultimateBoots;
    
    public static Item netherStarPiece;
    
    public static Item explosiveStick;
    public static Item explosiveStickBig;
    public static Item explosiveStickMega;
    public static Item fastBoots;
    public static Item nauseaBoots;
    public static Item miningBoots;
    
    public static int uHelmet;
    public static int uChest;
    public static int uLeggings;
    public static int uBoots;
    
    public static int fboots;
    public static int nboots;
    public static int mboots;
    
    public static Item creeperWand;
    
    public static Block compressedGoldBlock;
    public static Item opGoldenApple;
    public static Item burntPorkchop;
    public static Item cookedRedstone;
    
    public static Item pianoStick;
    
    
    

    
    
    
    
    //ORE GENERATION
    public static DiameraldGeneration diameraldGen = new DiameraldGeneration();
    
    //Enums
    public static final Item.ToolMaterial EMERALDMOD = EnumHelper.addToolMaterial("EMERALDMOD", 3, 3021, 9.0F, 4.0F, 22);
    public static final Item.ToolMaterial DIAMERALD = EnumHelper.addToolMaterial("DIAMERALD", 3, 4121, 11.0F, 5.0F, 22);
    public static final Item.ToolMaterial ULTIMATE = EnumHelper.addToolMaterial("ULTIMATE", 3, 10000, 15.0F, 18.0F, 30);
    public static final ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("EMERALDMOD", 45, new int[]{4, 10, 7, 4}, 25);
    public static final ArmorMaterial DIAMERALDA = EnumHelper.addArmorMaterial("DIAMERALD", 45, new int[]{4, 10, 7, 4}, 25);
    public static final ArmorMaterial ULTIMAT = EnumHelper.addArmorMaterial("ULTIMAT", 50, new int[] {5,11,8,5}, 30);
    public static final ArmorMaterial FAST = EnumHelper.addArmorMaterial("FAST",45,new int[]{4,10,7,4},22);
    public static final ArmorMaterial NAUSEA = EnumHelper.addArmorMaterial("NAUSEA",45,new int[]{4,10,7,4},22);
    public static final ArmorMaterial MINING = EnumHelper.addArmorMaterial("MINING",45,new int[]{4,10,7,4},22);
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {

    	
    	
    	//Items
    	diamerald = new Item().setUnlocalizedName("itemDiamerald").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(DiameraldMod.MODID + ":" + "diamerald");
    	GameRegistry.registerItem(diamerald, diamerald.getUnlocalizedName().substring(5));
    	emeraldPickaxe = new EmeraldPickaxe(EMERALDMOD).setUnlocalizedName("emeraldPickaxe").setCreativeTab(this.tabDiamerald).setTextureName(DiameraldMod.MODID + ":" + "emerald_pickaxe");
    	GameRegistry.registerItem(emeraldPickaxe, emeraldPickaxe.getUnlocalizedName().substring(5));
    	emeraldAxe = new EmeraldAxe(EMERALDMOD).setUnlocalizedName("emeraldAxe").setCreativeTab(this.tabDiamerald).setTextureName(DiameraldMod.MODID + ":" + "emerald_axe");
    	GameRegistry.registerItem(emeraldAxe, emeraldAxe.getUnlocalizedName().substring(5));
    	emeraldShovel = new EmeraldShovel(EMERALDMOD).setUnlocalizedName("emeraldShovel").setCreativeTab(this.tabDiamerald).setTextureName(DiameraldMod.MODID + ":" + "emerald_shovel");
    	GameRegistry.registerItem(emeraldShovel, emeraldShovel.getUnlocalizedName().substring(5));
    	emeraldHoe = new EmeraldHoe(EMERALDMOD).setUnlocalizedName("emeraldHoe").setCreativeTab(this.tabDiamerald).setTextureName(DiameraldMod.MODID + ":" + "emerald_hoe");
    	GameRegistry.registerItem(emeraldHoe, emeraldHoe.getUnlocalizedName().substring(5));
    	emeraldSword = new EmeraldSword(EMERALDMOD).setUnlocalizedName("emeraldSword").setCreativeTab(this.tabDiamerald).setTextureName(DiameraldMod.MODID + ":" + "emerald_sword");
    	GameRegistry.registerItem(emeraldSword, emeraldSword.getUnlocalizedName().substring(5));
    	
    	diameraldPickaxe = new DiameraldPickaxe(DIAMERALD).setUnlocalizedName("diameraldPickaxe").setCreativeTab(this.tabDiamerald).setTextureName(DiameraldMod.MODID + ":" + "diamerald_pickaxe");
    	GameRegistry.registerItem(diameraldPickaxe, diameraldPickaxe.getUnlocalizedName().substring(5));
    	diameraldAxe = new DiameraldAxe(DIAMERALD).setUnlocalizedName("diameraldAxe").setCreativeTab(this.tabDiamerald).setTextureName(DiameraldMod.MODID + ":" + "diamerald_axe");
    	GameRegistry.registerItem(diameraldAxe, diameraldAxe.getUnlocalizedName().substring(5));
    	diameraldShovel = new DiameraldShovel(DIAMERALD).setUnlocalizedName("diameraldShovel").setCreativeTab(this.tabDiamerald).setTextureName(DiameraldMod.MODID + ":" + "diamerald_shovel");
    	GameRegistry.registerItem(diameraldShovel, diameraldShovel.getUnlocalizedName().substring(5));
    	diameraldHoe = new DiameraldHoe(DIAMERALD).setUnlocalizedName("diameraldHoe").setCreativeTab(this.tabDiamerald).setTextureName(DiameraldMod.MODID + ":" + "diamerald_hoe");
    	GameRegistry.registerItem(diameraldHoe, diameraldHoe.getUnlocalizedName().substring(5));
    	diameraldSword = new DiameraldSword(DIAMERALD).setUnlocalizedName("diameraldSword").setCreativeTab(this.tabDiamerald).setTextureName(DiameraldMod.MODID + ":" + "diamerald_sword");
    	GameRegistry.registerItem(diameraldSword, diameraldSword.getUnlocalizedName().substring(5));
    	
    	emeraldHelmet = new EmeraldArmor(EMERALD, ehelmet, 0).setUnlocalizedName("emeraldHelmet");
    	GameRegistry.registerItem(emeraldHelmet, emeraldHelmet.getUnlocalizedName().substring(5));
    	emeraldChestplate = new EmeraldArmor(EMERALD, echest, 1).setUnlocalizedName("emeraldChestplate");
    	GameRegistry.registerItem(emeraldChestplate, emeraldChestplate.getUnlocalizedName().substring(5));
    	emeraldLeggings = new EmeraldArmor(EMERALD, eleggings, 2).setUnlocalizedName("emeraldLeggings");
    	GameRegistry.registerItem(emeraldLeggings, emeraldLeggings.getUnlocalizedName().substring(5));
    	emeraldBoots = new EmeraldArmor(EMERALD, eboots, 3).setUnlocalizedName("emeraldBoots");
    	GameRegistry.registerItem(emeraldBoots, emeraldBoots.getUnlocalizedName().substring(5));
    	
    	diameraldHelmet = new DiameraldArmor(DIAMERALDA, dhelmet, 0).setUnlocalizedName("diameraldHelmet");
    	GameRegistry.registerItem(diameraldHelmet, diameraldHelmet.getUnlocalizedName().substring(5));
    	diameraldChestplate = new DiameraldArmor(DIAMERALDA, dchest, 1).setUnlocalizedName("diameraldChestplate");
    	GameRegistry.registerItem(diameraldChestplate, diameraldChestplate.getUnlocalizedName().substring(5));
    	diameraldLeggings = new DiameraldArmor(DIAMERALDA, dleggings, 2).setUnlocalizedName("diameraldLeggings");
    	GameRegistry.registerItem(diameraldLeggings, diameraldLeggings.getUnlocalizedName().substring(5));
    	diameraldBoots = new DiameraldArmor(DIAMERALDA, dboots, 3).setUnlocalizedName("diameraldBoots");
    	GameRegistry.registerItem(diameraldBoots, diameraldBoots.getUnlocalizedName().substring(5));
    	
    	ultimateHelmet = new UltimateArmor(ULTIMAT,uHelmet,0).setUnlocalizedName("ultimateHelmer");
    	GameRegistry.registerItem(ultimateHelmet, "ultimateHelmet");
    	ultimateChestplate = new UltimateArmor(ULTIMAT,uChest,1).setUnlocalizedName("ultimateChestplate");
    	GameRegistry.registerItem(ultimateChestplate,"ultimateChestplate");
    	ultimateLeggings = new UltimateArmor(ULTIMAT,uLeggings,2).setUnlocalizedName("ultimateLeggings");
    	GameRegistry.registerItem(ultimateLeggings,"ultimateLeggings");
    	ultimateBoots = new UltimateArmor(ULTIMAT,uBoots,3).setUnlocalizedName("ultimateBoots");
    	GameRegistry.registerItem(ultimateBoots,"ultimateBoots");
    	
    	//(id,material).setblockname
    	blackWood = new ColoredWood(3000,Material.wood).setBlockName("blackWood").setBlockTextureName(this.MODID + ":" + "black_planks");
    	GameRegistry.registerBlock(blackWood, "blackWood");
    	blueWood = new ColoredWood(3001,Material.wood).setBlockName("blueWood").setBlockTextureName(this.MODID + ":" + "blue_planks");
    	GameRegistry.registerBlock(blueWood,"blueWood");
    	brownWood = new ColoredWood(3002,Material.wood).setBlockName("brownWood").setBlockTextureName(MODID + ":brown_planks");
    	GameRegistry.registerBlock(brownWood,"brownWood");
    	cyanWood = new ColoredWood(3003,Material.wood).setBlockName("cyanWood").setBlockTextureName(MODID + ":cyan_planks");
    	GameRegistry.registerBlock(cyanWood,"cyanWood");
    	grayWood = new ColoredWood(3004,Material.wood).setBlockName("grayWood").setBlockTextureName(MODID + ":gray_planks");
    	GameRegistry.registerBlock(grayWood,"grayWood");
    	greenWood = new ColoredWood(3005,Material.wood).setBlockName("greenWood").setBlockTextureName(MODID + ":green_planks");
    	GameRegistry.registerBlock(greenWood,"greenWood");
    	lightBlueWood = new ColoredWood(3006,Material.wood).setBlockName("lightBlueWood").setBlockTextureName(MODID + ":light_blue_planks");
    	GameRegistry.registerBlock(lightBlueWood,"lightBlueWood");
    	limeWood = new ColoredWood(3007,Material.wood).setBlockName("limeWood").setBlockTextureName(MODID + ":lime_planks");
    	GameRegistry.registerBlock(limeWood,"limeWood");
    	magentaWood = new ColoredWood(3008,Material.wood).setBlockName("magentaWood").setBlockTextureName(MODID + ":magenta_planks");
    	GameRegistry.registerBlock(magentaWood,"magentaWood");
    	orangeWood = new ColoredWood(3009,Material.wood).setBlockName("orangeWood").setBlockTextureName(MODID + ":orange_planks");
    	GameRegistry.registerBlock(orangeWood,"orangeWood");
    	pinkWood = new ColoredWood(3010,Material.wood).setBlockName("pinkWood").setBlockTextureName(MODID + ":pink_planks");
    	GameRegistry.registerBlock(pinkWood,"pinkWood");
    	purpleWood = new ColoredWood(3011,Material.wood).setBlockName("purpleWood").setBlockTextureName(MODID + ":purple_planks");
    	GameRegistry.registerBlock(purpleWood,"purpleWood");
    	redWood = new ColoredWood(3012,Material.wood).setBlockName("redWood").setBlockTextureName(MODID + ":red_planks");
    	GameRegistry.registerBlock(redWood,"redWood");
    	silverWood = new ColoredWood(3013,Material.wood).setBlockName("silverWood").setBlockTextureName(MODID + ":silver_planks");
    	GameRegistry.registerBlock(silverWood,"silverWood");
    	whiteWood = new ColoredWood(3014,Material.wood).setBlockName("whiteWood").setBlockTextureName(MODID + ":white_planks");
    	GameRegistry.registerBlock(whiteWood,"whiteWood");
    	yellowWood = new ColoredWood(3015,Material.wood).setBlockName("yellowWood").setBlockTextureName(MODID + ":yellow_planks");
    	GameRegistry.registerBlock(yellowWood,"yellowWood");
    	
    	radioBlock = new RadioBlock(3020,Material.rock).setBlockName("radioBlock").setBlockTextureName(MODID + ":block_of_radio");
    	GameRegistry.registerBlock(radioBlock, "radioBlock");
    	
    	enderBlock = new EnderBlock(3021,Material.rock).setBlockName("enderBlock").setBlockTextureName(MODID + ":block_of_ender");
    	GameRegistry.registerBlock(enderBlock, "enderBlock");
    	
    	fddBlock = new fddBlock(3022,Material.rock).setBlockName("fddBlock").setBlockTextureName(MODID + ":block_of_fdd");
    	GameRegistry.registerBlock(fddBlock,"Block of fdd");
    	
    	
    	
    	diameraldPotato = new Food(20,15.0F,false).setUnlocalizedName("diameraldPotato").setTextureName(MODID + ":diamerald_potato");
    	GameRegistry.registerItem(diameraldPotato,"diameraldPotato");
    	
    	burntPorkchop = new BurntFood(1,1.0F,true).setUnlocalizedName("burntPorkchop").setTextureName(MODID + ":burnt_porkchop");
    	GameRegistry.registerItem(burntPorkchop,"burntPorkchop");
    	
    	diameraldOre = new DiameraldOre(Material.rock).setBlockName("diameraldOre").setBlockTextureName(MODID + ":diamerald_ore");
    	GameRegistry.registerBlock(diameraldOre, "diameraldOre");
    	
    	GameRegistry.registerWorldGenerator(diameraldGen, 1);
    	
    	glowPlank = new GlowPlank(Material.rock).setBlockName("glowPlank").setBlockTextureName(MODID + ":" + "glow_planks");
    	GameRegistry.registerBlock(glowPlank,"glowPlank");
    	
    	diameraldBlock = new DiameraldBlock(Material.rock).setBlockName("diameraldBlock").setBlockTextureName(MODID + ":diamerald_block");
    	GameRegistry.registerBlock(diameraldBlock,"Diamerald Block");
    	
    	friedEgg = new Food(6,4.0F,false).setUnlocalizedName("friedEgg").setTextureName(MODID + ":fried_egg");
    	GameRegistry.registerItem(friedEgg, "friedEgg");
    	
    	netherStarPiece = new Item().setCreativeTab(this.tabDiamerald).setUnlocalizedName("netherStarPiece").setTextureName(MODID + ":nether_star_piece");
    	GameRegistry.registerItem(netherStarPiece, "netherStarPiece");
    	
    	ultimateShard = new Item().setCreativeTab(this.tabDiamerald).setUnlocalizedName("ultimateShard").setTextureName(MODID + ":ultimate_shard");
    	GameRegistry.registerItem(ultimateShard,"ultimateShard");
    	ultimateSword = new UltimateSword(ULTIMATE).setCreativeTab(this.tabDiamerald).setUnlocalizedName("ultimateSword").setTextureName(MODID + ":op_sword");
    	GameRegistry.registerItem(ultimateSword,"ultimateSword");
    	ultimatePickaxe = new DiameraldPickaxe(ULTIMATE).setCreativeTab(this.tabDiamerald).setUnlocalizedName("ultimatePickaxe").setTextureName(MODID + ":op_pickaxe");
    	GameRegistry.registerItem(ultimatePickaxe, "ultimatePickaxe");
    	ultimateAxe = new DiameraldAxe(ULTIMATE).setCreativeTab(this.tabDiamerald).setUnlocalizedName("ultimateAxe").setTextureName(MODID + ":op_axe");
    	GameRegistry.registerItem(ultimateAxe, "ultimateAxe");
    	ultimateShovel = new DiameraldShovel(ULTIMATE).setCreativeTab(this.tabDiamerald).setUnlocalizedName("ultimateShovel").setTextureName(MODID + ":op_shovel");
    	GameRegistry.registerItem(ultimateShovel, "ultimateShovel");
    	ultimateHoe = new DiameraldHoe(ULTIMATE).setCreativeTab(this.tabDiamerald).setUnlocalizedName("ultimateHoe").setTextureName(MODID + ":op_hoe");
    	GameRegistry.registerItem(ultimateHoe, "ultimateHoe");
    	
    	explosiveStick = new ExplosiveStick().setCreativeTab(this.tabDiamerald).setUnlocalizedName("explosiveStick").setMaxStackSize(1).setTextureName(MODID + ":explosive_stick");
    	GameRegistry.registerItem(explosiveStick,"explosiveStick");
    	explosiveStickBig = new ExplosiveStickBig().setCreativeTab(this.tabDiamerald).setUnlocalizedName("explosiveStickBig").setMaxStackSize(1).setTextureName(MODID + ":explosive_stick_big");
    	GameRegistry.registerItem(explosiveStickBig,"explosiveStickBig");
    	explosiveStickMega = new ExplosiveStickMega().setCreativeTab(this.tabDiamerald).setUnlocalizedName("explosiveStickMega").setMaxStackSize(1).setTextureName(MODID + ":explosive_stick_mega");
    	GameRegistry.registerItem(explosiveStickMega, "explosiveStickMega");
    	
    	pianoStick = new PianoStick().setCreativeTab(this.tabDiamerald).setUnlocalizedName("pianoStick").setMaxStackSize(1).setTextureName(MODID + ":piano_stick");
    	GameRegistry.registerItem(pianoStick,"pianoStick");
    	
    	
    	
    	fastBoots = new FastBoots(FAST,fboots,3).setCreativeTab(this.tabDiamerald).setUnlocalizedName("fastBoots").setTextureName(MODID + ":fast_boots");
    	GameRegistry.registerItem(fastBoots,"fastBoots");
    	nauseaBoots = new NauseaBoots(NAUSEA,nboots,3).setCreativeTab(this.tabDiamerald).setUnlocalizedName("nauseaBoots").setTextureName(MODID + ":nausea_boots");
    	GameRegistry.registerItem(nauseaBoots,"nauseaBoots");
    	miningBoots = new MiningBoots(MINING,mboots,3).setCreativeTab(this.tabDiamerald).setUnlocalizedName("miningBoots").setTextureName(MODID + ":mining_boots");
    	GameRegistry.registerItem(miningBoots,"miningBoots");
    	
    	compressedGoldBlock = new CompressedGoldBlock(Material.rock).setBlockName("compressedGoldBlock").setBlockTextureName(MODID + ":compressed_gold_block");
    	GameRegistry.registerBlock(compressedGoldBlock, "compressedGoldBlock");
    	
    	opGoldenApple = new OpGoldenApple(20,15.0F,false).setUnlocalizedName("opGoldenApple").setTextureName(MODID + ":apple_golden_op");
    	GameRegistry.registerItem(opGoldenApple,"opGoldenApple");
    	
    	cookedRedstone = new CookedRedstone(3,3.0F,false).setUnlocalizedName("cookedRedstone").setTextureName(MODID + ":cooked_redstone");
    	GameRegistry.registerItem(cookedRedstone,"cookedRedstone");
    	
    	
    	
    	
    	//Recipes
    	GameRegistry.addShapelessRecipe(new ItemStack(this.diamerald, 1), new Object[] {Items.emerald, Items.diamond});
    	GameRegistry.addShapedRecipe(new ItemStack(this.emeraldPickaxe), new Object[] {"###"," I "," I ",'#',Items.emerald,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.emeraldAxe), new Object[] {"## ","#I "," I ",'#',Items.emerald,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.emeraldShovel), new Object[] {" # "," I "," I ",'#',Items.emerald,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.emeraldHoe), new Object[] {"## "," I "," I ",'#',Items.emerald,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.emeraldSword), new Object[] {" # "," # "," I ",'#',Items.emerald,'I',Items.stick});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(this.netherStarPiece,4), new Object[] {Items.nether_star});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(this.diameraldPickaxe), new Object[] {"###"," I "," I ",'#',this.diamerald,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.diameraldAxe), new Object[] {"## ","#I "," I ",'#',this.diamerald,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.diameraldShovel), new Object[] {" # "," I "," I ",'#',this.diamerald,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.diameraldHoe), new Object[] {"## "," I "," I ",'#',this.diamerald,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.diameraldSword), new Object[] {" # "," # "," I ",'#',this.diamerald,'I',Items.stick});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(this.emeraldHelmet), new Object[] {"###","# #",'#',Items.emerald});
    	GameRegistry.addShapedRecipe(new ItemStack(this.emeraldChestplate), new Object[] {"# #","###","###",'#',Items.emerald});
    	GameRegistry.addShapedRecipe(new ItemStack(this.emeraldLeggings), new Object[] {"###","# #","# #",'#',Items.emerald});
    	GameRegistry.addShapedRecipe(new ItemStack(this.emeraldBoots), new Object[] {"# #","# #",'#',Items.emerald});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(this.ultimateSword), new Object[] {" # "," # "," I ",'#',this.ultimateShard,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.ultimatePickaxe), new Object[] {"###"," I "," I ",'#',this.ultimateShard,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.ultimateAxe), new Object[] {"## ","#I "," I ",'#',this.ultimateShard,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.ultimateShovel), new Object[] {" # "," I "," I ",'#',this.ultimateShard,'I',Items.stick});
    	GameRegistry.addShapedRecipe(new ItemStack(this.ultimateHoe), new Object[] {"## "," I "," I ",'#',this.ultimateShard,'I',Items.stick});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(this.ultimateHelmet), new Object[] {"###","# #",'#',this.ultimateShard});
    	GameRegistry.addShapedRecipe(new ItemStack(this.ultimateChestplate), new Object[] {"# #","###","###",'#',this.ultimateShard});
    	GameRegistry.addShapedRecipe(new ItemStack(this.ultimateLeggings), new Object[] {"###","# #","# #",'#',this.ultimateShard});
    	GameRegistry.addShapedRecipe(new ItemStack(this.ultimateBoots), new Object[] {"# #","# #",'#',this.ultimateShard});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(this.diameraldHelmet), new Object[] {"###","# #",'#',this.diamerald});
    	GameRegistry.addShapedRecipe(new ItemStack(this.diameraldChestplate), new Object[] {"# #","###","###",'#',this.diamerald});
    	GameRegistry.addShapedRecipe(new ItemStack(this.diameraldLeggings), new Object[] {"###","# #","# #",'#',this.diamerald});
    	GameRegistry.addShapedRecipe(new ItemStack(this.diameraldBoots), new Object[] {"# #","# #",'#',this.diamerald});
    	
    	GameRegistry.addRecipe(new ItemStack(this.blackWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,0)});
        GameRegistry.addRecipe(new ItemStack(this.redWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,1)});
        GameRegistry.addRecipe(new ItemStack(this.greenWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,2)});
        GameRegistry.addRecipe(new ItemStack(this.brownWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,3)});
        GameRegistry.addRecipe(new ItemStack(this.blueWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,4)});
        GameRegistry.addRecipe(new ItemStack(this.purpleWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,5)});
        GameRegistry.addRecipe(new ItemStack(this.cyanWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,6)});
        GameRegistry.addRecipe(new ItemStack(this.silverWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,7)});
        GameRegistry.addRecipe(new ItemStack(this.grayWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,8)});
        GameRegistry.addRecipe(new ItemStack(this.pinkWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,9)});
        GameRegistry.addRecipe(new ItemStack(this.limeWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,10)});
        GameRegistry.addRecipe(new ItemStack(this.yellowWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,11)});
        GameRegistry.addRecipe(new ItemStack(this.lightBlueWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,12)});
        GameRegistry.addRecipe(new ItemStack(this.magentaWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,13)});
        GameRegistry.addRecipe(new ItemStack(this.orangeWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,14)});
        GameRegistry.addRecipe(new ItemStack(this.whiteWood, 8), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', new ItemStack(Items.dye,1,15)});
        
        GameRegistry.addShapelessRecipe(new ItemStack(this.diameraldPotato,16), new Object[] {Items.baked_potato,this.diamerald});
        GameRegistry.addShapelessRecipe(new ItemStack(this.glowPlank,2), new Object[] {new ItemStack(Items.dye,1,11),Items.glowstone_dust,Blocks.planks});
        
        GameRegistry.addShapelessRecipe(new ItemStack(this.pianoStick), new Object[] {Items.feather, Items.redstone});
        
        GameRegistry.addRecipe(new ItemStack(this.diameraldBlock,1), new Object[] {"###","###","###",'#',this.diamerald});
        GameRegistry.addShapelessRecipe(new ItemStack(this.diamerald,9), new Object[] {this.diameraldBlock});
        
        GameRegistry.addSmelting(Items.egg, new ItemStack(this.friedEgg,1), 0.5F);
        
        GameRegistry.addRecipe(new ItemStack(this.ultimateShard),new Object[] {"OOO","DND","OOO",'O',Blocks.obsidian,'D',this.diamerald,'N',this.netherStarPiece});
        
        GameRegistry.addShapelessRecipe(new ItemStack(this.explosiveStick),new Object[] {Items.stick,Items.redstone,Blocks.tnt,this.diamerald});
        
        GameRegistry.addRecipe(new ItemStack(this.explosiveStickBig),new Object[] {"TTT","TST","TTT",'T',Blocks.tnt,'S',this.explosiveStick});
        GameRegistry.addRecipe(new ItemStack(this.explosiveStickMega),new Object[] {"TTT","TST","TTT",'T',Blocks.tnt,'S',this.explosiveStickBig});
        
        GameRegistry.addShapelessRecipe(new ItemStack(this.fastBoots), new Object[] {Items.feather,Items.leather_boots,this.diamerald});
        GameRegistry.addShapelessRecipe(new ItemStack(this.nauseaBoots),new Object[] {Blocks.deadbush,Items.leather_boots,this.diamerald});
        GameRegistry.addShapelessRecipe(new ItemStack(this.miningBoots), new Object[] {Items.diamond_pickaxe,Items.leather_boots,this.diamerald});
        
        GameRegistry.addRecipe(new ItemStack(this.compressedGoldBlock),new Object[] {"###","###","###",'#',Blocks.gold_block});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gold_block,9), new Object[]{this.compressedGoldBlock});
        
        GameRegistry.addRecipe(new ItemStack(this.opGoldenApple,1),new Object[] {"GGG","GAG","GGG",'G',this.compressedGoldBlock,'A',Items.apple});
        
        GameRegistry.addSmelting(Items.cooked_porkchop, new ItemStack(this.burntPorkchop,1), 0);
    	GameRegistry.addSmelting(Items.redstone, new ItemStack(this.cookedRedstone), 1);
        //Entities
        //Jan
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
		mobid = entityID;
		EntityRegistry.registerGlobalEntityID(mcreator_radiosonde.Entityradiosonde.class, "radiosonde", entityID);
		//EntityRegistry.registerModEntity(mcreator_radiosonde.Entityradiosonde.class, "radiosonde", entityID, instance, 64, 1, true);
		EntityRegistry.registerModEntity(mcreator_radiosonde.Entityradiosonde.class, "radiosonde", mobid, this, 32, 1, true);
		mcreator_radiosonde.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, (255 << 16) + (255 << 8) + 51, (0 << 16) + (0 << 8) + 0));
		
		//fdd
		int entityID2 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(mcreator_fdd2001.Entityfdd2001.class, "fdd2001", entityID2);
		EntityRegistry.registerModEntity(mcreator_fdd2001.Entityfdd2001.class, "fdd2001", entityID2, this, 32, 1, true);
		mcreator_fdd2001.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID2), new EntityList.EntityEggInfo(entityID2, (0 << 16) + (50 << 8) + 255, (255 << 16) + (255 << 8) + 255));
        
		//lena
		int entityID3 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(mcreator_enderdrache17.EntityEnderdrache17.class, "enderdrache17", entityID3);
		EntityRegistry.registerModEntity(mcreator_enderdrache17.EntityEnderdrache17.class, "enderdrache17", entityID3, this, 32, 1, true);
		mcreator_enderdrache17.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID3), new EntityList.EntityEggInfo(entityID3, (0 << 16) + (0 << 8) + 0, (67 << 16) + (0 << 8) + 82));
        
		
		
		
		
		
    	//Language
    	LanguageRegistry.addName(diamerald, "Diamerald");
    	LanguageRegistry.addName(emeraldPickaxe, "Emerald Pickaxe");
    	LanguageRegistry.addName(emeraldAxe, "Emerald Axe");
    	LanguageRegistry.addName(emeraldShovel, "Emerald Shovel");
    	LanguageRegistry.addName(emeraldHoe, "Emerald Hoe");
    	LanguageRegistry.addName(emeraldSword, "Emerald Sword");
    	LanguageRegistry.addName(diameraldPickaxe, "Diamerald Pickaxe");
    	LanguageRegistry.addName(diameraldAxe, "Diamerald Axe");
    	LanguageRegistry.addName(diameraldShovel, "Diamerald Shovel");
    	LanguageRegistry.addName(diameraldHoe, "Diamerald Hoe");
    	LanguageRegistry.addName(diameraldSword, "Diamerald Sword");
    	LanguageRegistry.addName(emeraldHelmet, "Emerald Helmet");
    	LanguageRegistry.addName(emeraldChestplate, "Emerald Chestplate");
    	LanguageRegistry.addName(emeraldLeggings, "Emerald Leggings");
    	LanguageRegistry.addName(emeraldBoots, "Emerald Boots");
    	LanguageRegistry.addName(diameraldHelmet, "Diamerald Helmet");
    	LanguageRegistry.addName(diameraldChestplate, "Diamerald Chestplate");
    	LanguageRegistry.addName(diameraldLeggings, "Diamerald Leggings");
    	LanguageRegistry.addName(diameraldBoots, "Diamerald Boots");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabDiamerald","Diamerald");
    	LanguageRegistry.instance().addStringLocalization("entity.radiosonde.name","Radiosonde");
    	LanguageRegistry.instance().addStringLocalization("entity.fdd2001.name", "fdd2001");
    	LanguageRegistry.instance().addStringLocalization("entity.enderdrache17.name", "Enderdrache17");
    	LanguageRegistry.addName(blackWood,"Black Planks");
    	LanguageRegistry.addName(blueWood,"Blue Planks");
    	LanguageRegistry.addName(brownWood,"Brown Planks");
    	LanguageRegistry.addName(cyanWood,"Cyan Planks");
    	LanguageRegistry.addName(grayWood,"Gray Planks");
    	LanguageRegistry.addName(greenWood,"Green Planks");
    	LanguageRegistry.addName(lightBlueWood,"Light Blue Planks");
    	LanguageRegistry.addName(limeWood,"Lime Planks");
    	LanguageRegistry.addName(magentaWood,"Magenta Planks");
    	LanguageRegistry.addName(orangeWood,"Orange Planks");
    	LanguageRegistry.addName(pinkWood,"Pink Planks");
    	LanguageRegistry.addName(purpleWood,"Purple Planks");
    	LanguageRegistry.addName(redWood,"Red Planks");
    	LanguageRegistry.addName(silverWood, "Silver Planks");
    	LanguageRegistry.addName(whiteWood, "White Planks");
    	LanguageRegistry.addName(yellowWood,"Yellow Planks");
    	LanguageRegistry.addName(diameraldPotato,"Diamerald Potato");
    	LanguageRegistry.addName(diameraldOre, "Diamerald Ore");
    	LanguageRegistry.addName(glowPlank,"Glow Planks");
    	LanguageRegistry.addName(diameraldBlock,"Diamerald Block");
    	LanguageRegistry.addName(friedEgg, "Fried Egg");
    	LanguageRegistry.addName(ultimateShard, "Ultimate Shard");
    	LanguageRegistry.addName(ultimateSword, "Ultimate Sword");
    	LanguageRegistry.addName(ultimatePickaxe,"Ultimate Pickaxe");
    	LanguageRegistry.addName(ultimateAxe,"Ultimate Axe");
    	LanguageRegistry.addName(ultimateShovel,"Ultimate Shovel");
    	LanguageRegistry.addName(ultimateHoe,"Ultimate Hoe");
    	LanguageRegistry.addName(ultimateHelmet,"Ultimate Helmet");
    	LanguageRegistry.addName(ultimateChestplate,"Ultimate Chestplate");
    	LanguageRegistry.addName(ultimateLeggings,"Ultimate Leggings");
    	LanguageRegistry.addName(ultimateBoots,"Ultimate Boots");
    	LanguageRegistry.addName(netherStarPiece, "Nether Star Piece");
    	LanguageRegistry.addName(explosiveStick,"Explosive Stick");
    	LanguageRegistry.addName(nauseaBoots,"Nausea Boots");
    	LanguageRegistry.addName(fastBoots,"Fast Boots");
    	LanguageRegistry.addName(miningBoots,"Mining Boots");
    	LanguageRegistry.addName(explosiveStickBig, "Giant Explosive Stick");
    	LanguageRegistry.addName(explosiveStickMega, "Mega Explosive Stick");
    	LanguageRegistry.addName(compressedGoldBlock, "Compressed Gold Block");
    	LanguageRegistry.addName(opGoldenApple, "Golden Apple (Op)");
    	LanguageRegistry.addName(radioBlock, "Block of Radio");
    	LanguageRegistry.addName(enderBlock, "Block of Ender");
    	LanguageRegistry.addName(fddBlock, "Block of fdd");
    	LanguageRegistry.addName(burntPorkchop, "Burnt Porkchop");
    	LanguageRegistry.addName(cookedRedstone, "Cooked Redstone");
    	LanguageRegistry.addName(pianoStick, "Piano Stick");
    }
}
