package thaumicmyths.init;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockHandler
{
  public static void init(IForgeRegistry<Block> registry)
  {

  }

  private static Block registerBlock(IForgeRegistry<Block> registry, Block block)
  {
    registry.register(block);

    ItemBlock itemBlock = new ItemBlock(block);
    itemBlock.setRegistryName(block.getRegistryName());
    ItemHandler.BLOCK_ITEMS.add(itemBlock);

    return block;
  }
}