package ladysnake.effective;

import eu.midnightdust.lib.config.MidnightConfig;

public class EffectiveConfig extends MidnightConfig {
	@Entry
	public static boolean splashes = true;

	@Entry(min = 0f, max = 1.0f, isSlider = true)
	public static float splashRimAlpha = 0.7f;

	@Entry
	public static boolean cascades = true;

	@Entry(min = 0, max = 500, isSlider = true)
	public static int cascadeSoundsVolumeMultiplier = 100;

	@Entry(min = 0, max = 400, isSlider = true)
	public static int cascadeSoundDistanceBlocks = 150;

	@Entry
	public static boolean shouldFlowingWaterSpawnParticlesOnFirstTick = true;

	@Entry(min = 0, max = 100, isSlider = true)
	public static int lapisBlockUpdateParticleChance = 10;

	@Entry(min = 0, max = 200, isSlider = true)
	public static int flowingWaterSplashingDensity = 50;

	@Entry(min = 0, max = 10, isSlider = true)
	public static int rainRippleDensity = 1;

	@Entry
	public static boolean glowingPlankton = true;

	@Entry
	public static boolean glowsquidHypnotize = true;

	@Entry
	public static boolean glowsquidHypnotizeAttractCursor = true;

	@Entry
	public static boolean allayTrails = true;

	@Entry(min = 0, max = 100, isSlider = true)
	public static int allayTwinkleDensity = 5;

	@Entry
	public static boolean goldenAllays = true;

	@Entry
	public static boolean wardenScreenShake = true;

	@Entry
	public static boolean sonicBoomScreenShake = true;

	@Entry
	public static boolean ravagerScreenShake = true;

	@Entry
	public static boolean dragonScreenShake = true;

	@Entry(min = 0, max = 100, isSlider = true)
	public static float fireflyDensity = 1;

	@Entry(min = 0, max = 100, isSlider = true)
	public static float chorusPetalDensity = 1;

	@Entry(min = 0, max = 100, isSlider = true)
	public static float willOWispDensity = 1;

	@Entry
	public static EyesInTheDarkOptions eyesInTheDark = EyesInTheDarkOptions.HALLOWEEN;

	@Entry
	public static boolean improvedFireballs = true;

	@Entry
	public static boolean improvedDragonFireballsAndBreath = true;


	@Entry
	public static CosmeticsOptions cosmetics = CosmeticsOptions.TRUE;

	@Entry
	public static boolean feedbacking = true;

	public static boolean shouldDisplayCosmetics() {
		return cosmetics == CosmeticsOptions.TRUE || cosmetics == CosmeticsOptions.FIRST_PERSON;
	}

	public enum EyesInTheDarkOptions {
		HALLOWEEN, ALWAYS, DISABLED
	}

	public enum CosmeticsOptions {
		FALSE, TRUE, FIRST_PERSON
	}

}
