package slimeknights.tconstruct.tools.modifiers;

import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;

import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.tools.ToolNBT;
import slimeknights.tconstruct.library.utils.HarvestLevels;
import slimeknights.tconstruct.library.utils.TagUtil;
import slimeknights.tconstruct.library.utils.Tags;
import slimeknights.tconstruct.library.modifiers.Modifier;

public class ModDiamond extends Modifier {

  public ModDiamond() {
    super("diamond");

    addAspects(new ModifierAspect.SingleAspect(this), new ModifierAspect.DataAspect(this, EnumChatFormatting.AQUA), ModifierAspect.freeModifier);
  }

  @Override
  public void updateNBT(NBTTagCompound modifierTag) {
    // no extra data needed
  }

  @Override
  public void applyEffect(NBTTagCompound rootCompound, NBTTagCompound modifierTag) {
    ToolNBT data = TagUtil.getToolStats(rootCompound);
    data.durability += 500;

    TagUtil.setToolTag(rootCompound, data.get());
  }
}
