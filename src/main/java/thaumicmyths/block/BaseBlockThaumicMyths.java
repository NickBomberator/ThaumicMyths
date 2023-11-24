package thaumicmyths.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thaumicmyths.init.ItemHandler;

public class BaseBlockThaumicMyths extends Block
{
  public BaseBlockThaumicMyths(Material material, String name)
  {
    super(material);
    setRegistryName(name);
    setTranslationKey(name);
    setCreativeTab(ItemHandler.TAB);

    setResistance(2.0F);
    setHardness(1.5F);
  }
}