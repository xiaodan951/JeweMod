package net.xiaodan951.gemmod.items.weapons;

import net.minecraft.item.SwordItem;
import net.xiaodan951.gemmod.group.ModGroup;

public class Obsidian_Sword extends SwordItem {
    public Obsidian_Sword() {
        super(ModItemTier.OBSIDIAN, 3, -2.5f, new Properties().group(ModGroup.GemmodWeapons));
    }
}
