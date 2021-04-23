package voxelmine.yggtp;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.ArrayList;

public class YggdrasilTeleporter extends JavaPlugin {
	
  private static YggdrasilTeleporter plugin;
  private String NAME = "Yggdrasil Teleporter";
  private String VERSION = "0.1.0";
  private String AUTHOR = "TheDerpGamerX";
  private String pluginNameFull = NAME + "v" + VERSION;
  public static ArrayList<YggdrasilWorld> worlds;

  @Override
  public void onEnable() {
	plugin = this;
    System.out.println("Loading " + pluginNameFull + "...");
    
    //Events
    //getServer().getPluginManager().registerEvents(new CustomBlockHandler(), this);
    
    //Commands
    //getCommand("<command>").setExecutor(new <CommandClass>());
  }
  
  public static YggdrasilTeleporter getPlugin() {
	  return plugin;
  }
}
