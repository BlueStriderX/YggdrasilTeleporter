package voxelmine.yggtp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class TeleportHandler implements Listener {

    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent playerMoveEvent) {
        for(YggdrasilWorld yggWorld : YggdrasilTeleporter.worlds) {
            if(yggWorld.getWorld() == playerMoveEvent.getPlayer().getWorld()) {
                if(playerMoveEvent.getTo().getBlockY() <= 15) {
                }
            }
        }
    }
}
