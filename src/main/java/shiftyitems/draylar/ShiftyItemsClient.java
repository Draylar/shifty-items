package shiftyitems.draylar;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import shiftyitems.draylar.config.ShiftyItemsConfig;

public class ShiftyItemsClient implements ClientModInitializer {

    public static final ShiftyItemsConfig CONFIG = AutoConfig.register(ShiftyItemsConfig.class, JanksonConfigSerializer::new).getConfig();

    @Override
    public void onInitializeClient() {

    }
}
