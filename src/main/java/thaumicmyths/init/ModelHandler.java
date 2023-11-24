package thaumicmyths.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import thaumicmyths.item.VariantItem;

public class ModelHandler
{
  public static void init()
  {
    registerItemModels();
  }

  private static void registerItemModels()
  {
    for(Item item : ItemHandler.ITEMS)
      ModelLoader.setCustomModelResourceLocation(item,
                                                 0,
                                                 new ModelResourceLocation(item.getRegistryName(), null));

    for(VariantItem variantItem : ItemHandler.VARIANT_ITEMS)
      for (int i = 0; i < variantItem.getVariants().length; i++)
        ModelLoader.setCustomModelResourceLocation(variantItem.getItem(),
                                                   variantItem.getMetaVariants()[i],
                                                   variantItem.getModelResourceLocation(variantItem.getVariants()[i]));
  }
}