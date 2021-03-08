package com.zom.nmz_util;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("nmzutil")
public interface NMZUtilConfig extends Config
{
	@ConfigItem(
		keyName = "healthNotification",
		name = "Health Notification",
		description = "Toggles notifications when your hitpoints gets above your threshold. <br>" +
			" Only starts to work after going equal or below the threshold",
		position = 1
	)
	default boolean hitPointsNotification()
	{
		return false;
	}

	@ConfigItem(
		keyName = "hitpointThreshold",
		name = "Hitpoint threshold",
		description = "Send notification when hitpoints exceed set value",
		position = 2
	)
	default int hitPointThreshold()
	{
		return 0;
	}

	@ConfigItem(
		keyName = "swapBarrel",
		name = "Barrel Menu Swap",
		description = "Swap 'Check' with 'Take' on potion storage barrels",
		position = 4
	)
	default boolean swapBarrels()
	{
		return false;
	}
}
