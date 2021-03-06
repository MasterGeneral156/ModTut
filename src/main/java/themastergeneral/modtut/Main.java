/*
 * Main Mod File
 * Loads the mod information
 * Without, no mod would load.
 */
package themastergeneral.modtut;

import themastergeneral.modtut.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	public static final String MODID = "modtut";
	public static final String MODNAME = "TMG Mod Tutorial";
	public static final String VERSION = "1.0.0";
	
	@Instance
	public static Main instance = new Main();
	
	@SidedProxy(clientSide="themastergeneral.modtut.proxy.ClientProxy", serverSide="themastergeneral.modtut.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preINt(FMLPreInitializationEvent e) {
		this.proxy.preInit(e);
	}
	@EventHandler
    public void init(FMLInitializationEvent e) {
		this.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	this.proxy.postInit(e);
    }
}
