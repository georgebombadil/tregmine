package info.tregmine.api;

import org.bukkit.Sound;

/**
 * Represents a notification to send to a player
 * <p>
 * This is called at different times.
 * 
 * <p>
 * Ex: When a player receives a message, they receive Notification.MESSAGE
 * @author Robert Catron
 *
 */
public enum Notification {
	BLESS(Sound.ENDERDRAGON_WINGS),
	COMMAND_FAIL(Sound.ZOMBIE_DEATH),
	MESSAGE(Sound.LEVEL_UP),
	RANK_UP(Sound.FUSE),
	SUMMON(Sound.PORTAL_TRAVEL),
	WARP(Sound.ENDERMAN_TELEPORT);
	
	
	private final Sound sound;
	
	private Notification(Sound sound)
	{
		this.sound = sound;
	}
	
	/**
	 * @return The sound of the notification
	 */
	public Sound getSound() {
		return sound;
	}
}
