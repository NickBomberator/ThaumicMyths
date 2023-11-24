package thaumicmyths;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thaumicmyths.init.BlockHandler;
import thaumicmyths.init.ItemHandler;
import thaumicmyths.init.ModelHandler;

@EventBusSubscriber
public class Registrar
{
  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event)
  {
    ItemHandler.init(event.getRegistry());
  }

  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public static void registerModels(ModelRegistryEvent event)
  {
    ModelHandler.init();
  }

  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> event)
  {
    BlockHandler.init(event.getRegistry());
  }
}