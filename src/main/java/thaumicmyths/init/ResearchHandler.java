package thaumicmyths.init;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumicmyths.ThaumicMyths;

public class ResearchHandler
{
  public static final String CATEGORY_NAME = "THAUMIC_MYTHS";
  private static final String RESEARCH_KEY = "FIRSTSTEPS";

  public static void init()
  {
    ResearchCategories.registerCategory(CATEGORY_NAME, RESEARCH_KEY, new AspectList(),
                                        new ResourceLocation(ThaumicMyths.MOD_ID, "textures/gui/research_icon.png"),
                                        new ResourceLocation(ThaumicMyths.MOD_ID, "textures/gui/research_back.png"));

    ThaumcraftApi.registerResearchLocation(new ResourceLocation(ThaumicMyths.MOD_ID, "research/misc.json"));
  }
}