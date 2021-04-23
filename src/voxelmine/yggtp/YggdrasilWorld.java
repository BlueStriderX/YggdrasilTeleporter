package voxelmine.yggtp;

import org.bukkit.World;
import java.util.Map;

public class YggdrasilWorld {

    private World world;
    private Map<YggdrasilWorld, TeleportType> teleports;
    private int level;

    public YggdrasilWorld(World world, Map<YggdrasilWorld, TeleportType> teleports, int level) {
        this.world = world;
        this.teleports = teleports;
        this.level = level;
    }

    public World getWorld() {
        return world;
    }

    public Map<YggdrasilWorld, TeleportType> getTeleports() {
        return teleports;
    }

    public int getLevel() {
        return level;
    }
}
