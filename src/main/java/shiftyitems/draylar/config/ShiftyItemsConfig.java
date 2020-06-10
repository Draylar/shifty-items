package shiftyitems.draylar.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

import java.util.Collections;
import java.util.List;

@Config(name = "shiftyitems")
public class ShiftyItemsConfig implements ConfigData {

    @Comment(value = "A list of items that will allow for interactions while shifting.")
    public List<String> validItems = Collections.singletonList("minecraft:shears");
}
