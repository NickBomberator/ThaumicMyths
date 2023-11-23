package thaumicmyths;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thaumicmyths.init.ResearchHandler;

@Mod(modid = ThaumicMyths.MOD_ID, name = ThaumicMyths.NAME, version = ThaumicMyths.VERSION, useMetadata = true)
public class ThaumicMyths
{
  public static final String MOD_ID = "thaumicmyths";
  public static final String NAME = "Thaumic Myths";
  public static final String VERSION = "1.0.0-ALPHA";

  @EventHandler
  public static void preInit(FMLPreInitializationEvent event)
  {

  }

  @EventHandler
  public static void init(FMLInitializationEvent event)
  {
    ResearchHandler.init();
  }

  @EventHandler
  public static void postInit(FMLPostInitializationEvent event)
  {

  }
}