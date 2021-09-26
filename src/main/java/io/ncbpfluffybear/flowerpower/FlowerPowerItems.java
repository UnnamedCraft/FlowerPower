package io.ncbpfluffybear.flowerpower;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import io.ncbpfluffybear.flowerpower.items.InfinityApple;
import io.ncbpfluffybear.flowerpower.items.InfinityBandage;
import io.ncbpfluffybear.flowerpower.items.RecallCharm;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import utils.Constants;
import utils.ItemTags;

/**
 * SlimefunItemStack registration
 * @author NCBPFluffyBear
 */
public class FlowerPowerItems {

    public static final ItemGroup FLOWERPOWER_CATEGORY = new ItemGroup(new NamespacedKey(FlowerPowerPlugin.getInstance(),
            "flowerpower_category"), new CustomItemStack(Material.ALLIUM, "&5魔法鲜花")
    );
    // Multiblocks
    public static final SlimefunItemStack MAGIC_BASIN = new SlimefunItemStack("MAGIC_BASIN",
            Material.CAULDRON,
            "&b魔法花盆",
            "",
            "&7&o一个用于制作魔法物品的花盆",
            "",
            "&7使用&e魔法棒&7右键点击来激活",
            ItemTags.MULTIBLOCK
    );
    // Blocks
    public static final SlimefunItemStack EXPERIENCE_CAULDRON = new SlimefunItemStack("EXPERIENCE_CAULDRON",
            Material.CAULDRON,
            "&a经验池",
            "",
            "&7&o一个可以存储经验的方块",
            "&7&o用于制作魔法花盆",
            "",
            "&e右键点击&7来存入经验",
            "&e潜行并右键点击&7来取出经验",
            ItemTags.MULTIBLOCK
    );
    // Glistening Flowers
    public static final SlimefunItemStack GLISTENING_POPPY = new SlimefunItemStack("GLISTENING_POPPY",
            Material.POPPY,
            "&a闪烁的虞美人",
            "",
            "&7&o一朵发光的虞美人",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack GLISTENING_DANDELION = new SlimefunItemStack("GLISTENING_DANDELION",
            Material.DANDELION,
            "&a闪烁的蒲公英",
            "",
            "&7&o一朵发光的蒲公英",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack GLISTENING_OXEYE_DAISY = new SlimefunItemStack("GLISTENING_OXEYE_DAISY",
            Material.OXEYE_DAISY,
            "&a闪烁的滨菊",
            "",
            "&7&o一朵发光的滨菊",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack GLISTENING_ALLIUM = new SlimefunItemStack("GLISTENING_ALLIUM",
            Material.ALLIUM,
            "&a闪烁的绒球葱",
            "",
            "&7&o一朵发光的绒球葱",
            "",
            ItemTags.CRAFTING_ITEM
    );
    // Items
    public static final SlimefunItemStack MAGICAL_WAND = new SlimefunItemStack("MAGICAL_WAND",
            Material.BLAZE_ROD,
            "&5魔法棒",
            "",
            "&e右键单击&7一个魔法花盆",
            "&7来激活魔法花盆",
            "",
            ItemTags.TOOL
    );
    public static final SlimefunItemStack MAGIC_CREAM = new SlimefunItemStack("MAGIC_CREAM",
            Material.MAGMA_CREAM,
            "&6&l魔法膏",
            "",
            "&7&o一个可以改变魔法属性的粘液球",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack OVERGROWTH_SEED = new SlimefunItemStack("OVERGROWTH_SEED",
            Material.WHEAT_SEEDS,
            "&3开花的种子",
            "",
            "",
            "&e右键单击&7可以使用它的花",
            "&7来复制那朵花",
            "",
            ItemTags.MAGICAL_ITEM
    );
    // Flower Crystals
    public static final SlimefunItemStack RED_CRYSTAL = new SlimefunItemStack("RED_CRYSTAL",
            Material.RED_GLAZED_TERRACOTTA,
            "&c红水晶",
            "",
            "&7&o看起来闪闪发亮……",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack YELLOW_CRYSTAL = new SlimefunItemStack("YELLOW_CRYSTAL",
            Material.YELLOW_GLAZED_TERRACOTTA,
            "&e黄水晶",
            "",
            "&7&o看起来闪闪发亮……",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack WHITE_CRYSTAL = new SlimefunItemStack("WHITE_CRYSTAL",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&f白水晶",
            "",
            "&7&o看起来闪闪发亮……",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack PURPLE_CRYSTAL = new SlimefunItemStack("PURPLE_CRYSTAL",
            Material.PURPLE_GLAZED_TERRACOTTA,
            "&5紫水晶",
            "",
            "&7&o看起来闪闪发亮……",
            "",
            ItemTags.CRAFTING_ITEM
    );
    public static final SlimefunItemStack MOVEMENT_SPEED_CHARM = new SlimefunItemStack("MOVEMENT_SPEED_CHARM",
            Material.SUGAR,
            "&a移动速度符文",
            "",
            "&e右键点击&c来检查此符文",
            "&7&o将此符文拿在副手可以更快地移动",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack ATTACK_SPEED_CHARM = new SlimefunItemStack("ATTACK_SPEED_CHARM",
            Material.SUGAR,
            "&a攻击速度符文",
            "",
            "&e右键点击&c来检查此符文",
            "&7&o将此符文拿在副手可以更快地攻击",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack FLY_SPEED_CHARM = new SlimefunItemStack("FLY_SPEED_CHARM",
            Material.SUGAR,
            "&a飞行速度符文",
            "",
            "&e右键点击&c来检查此符文",
            "&7&o将此符文拿在副手可以更快地飞行",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack DAMAGE_CHARM = new SlimefunItemStack("DAMAGE_CHARM",
            Material.SUGAR,
            "&a伤害符文",
            "",
            "&e右键点击&c来检查此符文",
            "&7&o将此符文拿在副手可以造成更多伤害",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack HEALTH_CHARM = new SlimefunItemStack("HEALTH_CHARM",
            Material.SUGAR,
            "&a恢复符文",
            "",
            "&e右键点击&c来检查此符文",
            "&7&o将此符文拿在副手可以恢复更多血量",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack EXPERIENCE_TOME = new SlimefunItemStack("EXPERIENCE_TOME",
            Material.ENCHANTED_BOOK,
            "&e经验典籍 &a（0 / 1000000）",
            "",
            "&7&o能够储存大量经验",
            "",
            "&e右键单击&7来注入经验",
            "&e潜行并右键点击&7来取出经验",
            "&e左键点击&7可以进行大部分操作",
            "",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack INFINITY_APPLE = new SlimefunItemStack("INFINITY_APPLE",
            new CustomItemStack(SlimefunUtils.getCustomHead("99a79d7e5d1ba739ab4471643e744ef781f7c1d4ea52efc99168d6cb5732326")),
            "&e无限苹果",
            "",
            "&7&o将经验转换为食物",
            "",
            "&e右键单击&7可以食用",
            "",
            "&a每 " + InfinityApple.FOOD_PER_CONSUME + " 点饥饿值 = " + InfinityApple.EXP_PER_CONSUME + " 点经验 ",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack INFINITY_BANDAGE = new SlimefunItemStack("INFINITY_BANDAGE",
            Material.PAPER,
            "&c无限绷带",
            "",
            "&7&o将经验转换为生命值",
            "",
            "&e右键点击&7可以恢复生命值",
            "",
            "&a每 " + InfinityBandage.HEALTH_PER_CONSUME + " 点生命值 = " + InfinityBandage.EXP_PER_CONSUME + " 点经验 ",
            ItemTags.MAGICAL_ITEM
    );
    public static final SlimefunItemStack RECALL_CHARM = new SlimefunItemStack("RECALL_CHARM",
            Material.ENDER_EYE,
            "&5回城符文",
            "",
            "&7&o以经验值为交换",
            "&7&o将你传送到一个标记过的位置……",
            "",
            "&e潜行并右键点击&7来标记当前位置",
            "&e右键点击&7来传送",
            "",
            "&3标记的位置: None",
            "",
            "&a每次传送花费 " + RecallCharm.TELEPORT_COST + " 点经验",
            ItemTags.MAGICAL_ITEM
    );


    private static final Enchantment glowEnchant = Enchantment.getByKey(Constants.GLOW_ENCHANT);

    static {
        GLISTENING_POPPY.addEnchantment(glowEnchant, 1);
        GLISTENING_DANDELION.addEnchantment(glowEnchant, 1);
        GLISTENING_OXEYE_DAISY.addEnchantment(glowEnchant, 1);
        GLISTENING_ALLIUM.addEnchantment(glowEnchant, 1);

        OVERGROWTH_SEED.addEnchantment(glowEnchant, 1);
        INFINITY_BANDAGE.addEnchantment(glowEnchant, 1);
        RECALL_CHARM.addEnchantment(glowEnchant, 1);
    }


    private FlowerPowerItems() {
    }

}
