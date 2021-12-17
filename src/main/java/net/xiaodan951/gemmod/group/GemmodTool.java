package net.xiaodan951.gemmod.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.xiaodan951.gemmod.item.tools.ItemRegistry;

public class GemmodTool extends ItemGroup {
    public GemmodTool() {
        super("gemmod_tool");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.Obsidian_Pickaxe.get());
    }
}
