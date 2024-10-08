package net.wavemc.pvp.kit;


import org.bukkit.DyeColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Dye;
import net.wavemc.pvp.cooldown2.WaveCooldown2;
import net.wavemc.pvp.cooldown2.WaveCooldownAPI;
import net.wavemc.core.bukkit.WaveBukkit;
import net.wavemc.core.bukkit.account.WavePlayer;
import net.wavemc.core.bukkit.item.ItemBuilder;
import net.wavemc.pvp.cooldown2.ItemCooldown;



public class KitHandler2 implements Listener {

	public void execute(Player player) {
		player.setGameMode(GameMode.SURVIVAL);
		player.getInventory().clear();
		player.getInventory().setArmorContents(null);
		player.setAllowFlight(false);
		player.setFlying(false);
		player.getActivePotionEffects().forEach(potion -> player.removePotionEffect(potion.getType()));
		player.getInventory().setHeldItemSlot(0);
		/* 348 */  
		
			player.getInventory().setItem(0, new ItemBuilder("§7Espada", Material.STONE_SWORD)
					.nbt("cancel-drop")
					.toStack()
			);
		
	    WavePlayer p = WaveBukkit.getInstance().getPlayerManager().getPlayer(player.getName());
		 if (!KitManager.getPlayer(p.getName()).hasKit(WaveKit.NEO)) {
			 Habilidade.removeAbility(player);
			}

		player.getInventory().setItem(8, new ItemBuilder("§9Bússola", Material.COMPASS)
				.nbt("kit-handler", "search-players")
				.nbt("cancel-drop")
				.toStack()
		);
		 
		

		player.getInventory().setItem(13, new ItemStack(Material.BOWL, 32));
		player.getInventory().setItem(14, new ItemStack(Material.RED_MUSHROOM, 32));
		player.getInventory().setItem(15, new ItemStack(Material.BROWN_MUSHROOM, 32));
	
	
	player.getInventory().setItem(3 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(4 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(5 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(6 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(7 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(9 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(10 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(11 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(12 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(16 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(17 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(18 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(19 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(20 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(21 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(22 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(23 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(24 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(25 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(26 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(27 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(28 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(29 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(30 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(31 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(32 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(33 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(34 , new ItemStack(Material.MUSHROOM_SOUP));
			player.getInventory().setItem(35 , new ItemStack(Material.MUSHROOM_SOUP));
			
		}
	

protected boolean hasCooldown(Player player) {
    return WaveCooldown2.hasCooldown(player, KitManager2.getPlayer(player.getName()).getkit2().getName());
}

protected boolean hasCooldown(Player player, String cooldown) {
    return WaveCooldown2.hasCooldown(player, cooldown);
}

protected boolean inCooldown(Player player, String cooldown) {
    return WaveCooldown2.inCooldown(player, cooldown);
}

protected boolean inCooldown(Player player) {
    return WaveCooldown2.inCooldown(player, KitManager2.getPlayer(player.getName()).getkit2().getName());
}

protected void sendMessageCooldown(Player player) {
	WaveCooldown2.sendMessage(player, KitManager2.getPlayer(player.getName()).getkit2().getName());
}

protected void sendMessageCooldown(Player player, String cooldown) {
	WaveCooldown2.sendMessage(player, cooldown);
}

protected void addCooldown(Player player, String cooldownName, long time) {
    if (WaveCooldown2.hasCooldown(player, cooldownName)) {
        WaveCooldown2.removeCooldown(player, cooldownName);
    }
    WaveCooldown2.addCooldown(player, new WaveCooldownAPI(cooldownName, time));
}

protected void addCooldown(Player player, long time) {
    if (WaveCooldown2.hasCooldown(player, KitManager2.getPlayer(player.getName()).getkit2().getName())) {
        WaveCooldown2.removeCooldown(player, KitManager2.getPlayer(player.getName()).getkit2().getName());
    }
    WaveCooldown2.addCooldown(player, new WaveCooldownAPI(KitManager2.getPlayer(player.getName()).getkit2().getName(), time));
}

protected void addItemCooldown(Player player, ItemStack item, String cooldownName, long time) {
    if (WaveCooldown2.hasCooldown(player, cooldownName)) {
        WaveCooldown2.removeCooldown(player, cooldownName);
    }
    WaveCooldown2.addCooldown(player, new ItemCooldown(item, cooldownName, time));
}
}