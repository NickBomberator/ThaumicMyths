package thaumicmyths.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;
import thaumicmyths.item.TabThaumicMyths;
import thaumicmyths.item.VariantItem;

import java.util.ArrayList;
import java.util.List;

public class ItemHandler
{
  public static final CreativeTabs TAB = new TabThaumicMyths();
  public static final List<Item> ITEMS = new ArrayList<>();
  public static final List<VariantItem> VARIANT_ITEMS = new ArrayList<>();
  public static final List<ItemBlock> BLOCK_ITEMS = new ArrayList<>();


  public static void init(IForgeRegistry<Item> registry)
  {
    for(ItemBlock itemBlock : BLOCK_ITEMS)
      registry.register(itemBlock);

  }

  private static Item registerItem(IForgeRegistry<Item> registry, Item item)
  {
    registry.register(item);

    if (item.getHasSubtypes() && item instanceof VariantItem)
      VARIANT_ITEMS.add((VariantItem) item);
    else
      ITEMS.add(item);

    return item;
  }
}