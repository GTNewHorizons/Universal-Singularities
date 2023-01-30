package wealthyturtle.uiesingularities.proxy;

import net.minecraftforge.client.MinecraftForgeClient;

import fox.spiteful.avaritia.render.FancyHaloRenderer;

public final class ClientProxy extends CommonProxy {

    @Override
    public void init() {
        final FancyHaloRenderer fancyHaloRenderer = new FancyHaloRenderer();
        singularities.forEach(singularity -> MinecraftForgeClient.registerItemRenderer(singularity, fancyHaloRenderer));
    }
}
