package iea.iearthia.core;

import iea.iearthia.core.proxy.CommonProxy;
import iea.iearthia.core.util.Constants;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Constants.MODID, name = Constants.NAME, version = Constants.VERSION)
public class IearthiaCore
{
    private static Logger logger;
    @SidedProxy(clientSide = "iea.iearthia.core.proxy.ClientProxy", serverSide = "iea.iearthia.core.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
        logger.info("Preinit...");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        logger.info("Init...");

    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        logger.info("Postinit...");
    }
}
