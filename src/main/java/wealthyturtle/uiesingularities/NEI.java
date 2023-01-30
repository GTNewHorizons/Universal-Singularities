package wealthyturtle.uiesingularities;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemStack;

import codechicken.nei.api.API;

public final class NEI {

    private NEI() {}

    public static void hide(@Nonnull final ItemStack itemStack) {
        API.hideItem(itemStack);
    }
}
