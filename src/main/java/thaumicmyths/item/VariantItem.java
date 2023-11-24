package thaumicmyths.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public interface VariantItem
{
  String[] getVariants();
  int[] getMetaVariants();
  Item getItem();
  ModelResourceLocation getModelResourceLocation(String variant);
}