package thaumicmyths.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import thaumicmyths.ThaumicMyths;
import thaumicmyths.init.ItemHandler;

public class BaseItemThaumicMyths extends Item implements VariantItem
{
  protected final String BaseName;
  protected String[] Variants;
  protected int[] MetaVariants;


  public BaseItemThaumicMyths(String name)
  {
    this(name, name);
  }

  public BaseItemThaumicMyths(String name, String... variants)
  {
    setRegistryName(name);
    setTranslationKey(name);
    setCreativeTab(ItemHandler.TAB);
    setNoRepair();
    setHasSubtypes(variants.length > 1);

    BaseName = name;
    Variants = variants;
    MetaVariants = new int[variants.length];
    for(int m = 0; m < variants.length; m++)
      MetaVariants[m] = m;
  }


  @Override
  public String getTranslationKey(ItemStack stack)
  {
    int metadata = stack.getMetadata();

    return hasSubtypes && metadata < Variants.length && !BaseName.equals(Variants[metadata])
           ? super.getTranslationKey(stack) + '.' + Variants[metadata]
           : super.getTranslationKey(stack);
  }

  @Override
  public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
  {
    if(tab != ItemHandler.TAB && tab != CreativeTabs.SEARCH)
      return;

    if(!hasSubtypes)
    {
      super.getSubItems(tab, items);
    }
    else
    {
      for(int meta : MetaVariants)
        items.add(new ItemStack(this, 1, meta));
    }
  }

  public String[] getVariants()
  {
    return Variants;
  }

  public int[] getMetaVariants()
  {
    return MetaVariants;
  }

  public Item getItem()
  {
    return this;
  }

  public ModelResourceLocation getModelResourceLocation(String variant)
  {
    return variant.equals(BaseName)
           ? new ModelResourceLocation(ThaumicMyths.MOD_ID + ':' + BaseName)
           : new ModelResourceLocation(ThaumicMyths.MOD_ID + ':' + BaseName, variant);
  }
}