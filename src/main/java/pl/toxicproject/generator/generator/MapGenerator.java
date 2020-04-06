package pl.toxicproject.generator.generator;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import pl.toxicproject.generator.Main;

public class MapGenerator {
    public static int ex = 0;

    public static int ey = 0;

    public static int ez = 0;

    static Material publicmaterial;

    static Main plugin;

    static World world;

    public MapGenerator(Main plug) {
        plugin = plug;
        world = plug.getServer().getWorld("parkour");
    }

    public static String generateMap(Player player, int numberOfJumps, int difficulty, Material blockmaterial) {
        publicmaterial = blockmaterial;
        Block playerblock = player.getLocation().getBlock().getRelative(BlockFace.DOWN);
        Block block = playerblock;
        block.setType(blockmaterial);
        int x = playerblock.getX();
        int y = playerblock.getY();
        int z = playerblock.getZ();
        ex = x;
        ey = y;
        ez = z;
        setBlock(x, y, z);
        setBlock(x + 1, y, z);
        setBlock(x - 1, y, z);
        setBlock(x, y, z + 1);
        setBlock(x + 1, y, z + 1);
        setBlock(x - 1, y, z + 1);
        setBlock(x, y, z - 1);
        setBlock(x + 1, y, z - 1);
        setBlock(x - 1, y, z - 1);
        for (int i = 1; i <= numberOfJumps; i++) {
            Bukkit.broadcastMessage("x=" + ex + ", y=" + ey + ", z=" + ez);
            JumpGenerator.makeRandomJump(difficulty, ex + 1, ey, ez, world);
        }
        return null;
    }

    public static void setBlock(int x, int y, int z) {
        Block block = world.getBlockAt(x, y, z);
        block.setType(publicmaterial);
    }
}


