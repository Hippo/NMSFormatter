package rip.hippo.nmsformat;

import org.bukkit.Bukkit;

/**
 * @author Hippo
 * @version 1.0.0, 7/14/21
 * @since 1.0.0
 */
public enum NMSFormatter {
    ;

    public static final String SERVER_VERSION = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];

    public static String formatNMS(String input) {
        return String.format("net.minecraft.server.%s.%s", SERVER_VERSION, input);
    }

    public static String formatCraft(String input) {
        return String.format("org.bukkit.craftbukkit.%s.%s", SERVER_VERSION, input);
    }
}
