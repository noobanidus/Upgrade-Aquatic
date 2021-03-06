package com.teamabnormals.upgrade_aquatic.client.particle;

import java.util.EnumMap;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.teamabnormals.upgrade_aquatic.common.blocks.BlockJellyTorch;
import com.teamabnormals.upgrade_aquatic.core.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class UAParticleSprites {
	
	public static ResourceLocation[] PRISMARINE_FRAMES = new ResourceLocation[] {
		new ResourceLocation("upgrade_aquatic:textures/particles/prismarine_coral_crystal_1.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/prismarine_coral_crystal_2.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/prismarine_coral_crystal_3.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/prismarine_coral_crystal_4.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/prismarine_coral_crystal_5.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/prismarine_coral_crystal_6.png")
	};
	
	public static ResourceLocation[] ELDER_PRISMARINE_FRAMES = new ResourceLocation[] {
		new ResourceLocation("upgrade_aquatic:textures/particles/elder_prismarine_coral_crystal_1.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/elder_prismarine_coral_crystal_2.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/elder_prismarine_coral_crystal_3.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/elder_prismarine_coral_crystal_4.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/elder_prismarine_coral_crystal_5.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/elder_prismarine_coral_crystal_6.png")
	};
	
	public static ResourceLocation[] SPECTRAL_FRAMES = new ResourceLocation[] {
		new ResourceLocation("upgrade_aquatic:textures/particles/spectral_consume_1.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/spectral_consume_2.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/spectral_consume_3.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/spectral_consume_4.png")
	};
	
	public static ResourceLocation[] SONAR_FRAMES = new ResourceLocation[] {
		new ResourceLocation("upgrade_aquatic:textures/particles/sonar_1.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/sonar_2.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/sonar_3.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/sonar_4.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/sonar_5.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/sonar_6.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/sonar_7.png"),
		new ResourceLocation("upgrade_aquatic:textures/particles/sonar_8.png")
	};
	
	public static final EnumMap<BlockJellyTorch.JellyTorchType, List<ResourceLocation>> JELLY_TORCHES = new EnumMap<>(BlockJellyTorch.JellyTorchType.class);

    static {
        for (BlockJellyTorch.JellyTorchType torchType : BlockJellyTorch.JellyTorchType.values()) {
            ImmutableList.Builder<ResourceLocation> builder = ImmutableList.builder();
            for (int i = 1 ; i <= 3; i++) {
                builder.add(new ResourceLocation(Reference.MODID, "textures/particles/jelly/jellyglow_" + torchType.name().toLowerCase() + "_" + i + ".png"));
            }
            JELLY_TORCHES.put(torchType, builder.build());
        }
    }
    
}
