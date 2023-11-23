package thaumicmyths.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import thaumicmyths.ThaumicMyths;

public class TabThaumicMyths extends CreativeTabs
{
  public TabThaumicMyths()
  {
    super(ThaumicMyths.MOD_ID);
  }

  @Override
  public ItemStack createIcon()
  {
    //TODO: Add new creative tab icon.
    return ItemStack.EMPTY;
  }
}