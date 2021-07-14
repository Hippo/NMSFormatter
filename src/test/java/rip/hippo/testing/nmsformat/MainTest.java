package rip.hippo.testing.nmsformat;

import org.bukkit.Bukkit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import rip.hippo.mockserver.v1_8_R3.MockServer;
import rip.hippo.nmsformat.NMSFormatter;

/**
 * @author Hippo
 * @version 1.0.0, 7/14/21
 * @since 1.0.0
 */
public final class MainTest {

    @Test
    public void formatTest() {
        Bukkit.setServer(new MockServer());
        assertEquals("v1_8_R3", NMSFormatter.SERVER_VERSION);
        assertEquals("net.minecraft.server.v1_8_R3.Entity", NMSFormatter.formatNMS("Entity"));
        assertEquals("org.bukkit.craftbukkit.v1_8_R3.CraftWorld", NMSFormatter.formatCraft("CraftWorld"));
    }
}
