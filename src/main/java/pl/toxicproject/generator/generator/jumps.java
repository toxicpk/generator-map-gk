package pl.toxicproject.generator.generator;

import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.World;

public class jumps {
    public static void makeRandomJump(int difficulty, int x, int y, int z, World world) {
        Random rand = new Random();
        int id = 1;
        Bukkit.broadcastMessage("po co to tu jest XD");
        int ex = 0;
        int ey = 0;
        int ez = 0;
        if (difficulty == 0) {
            id = rand.nextInt(4) + 1;
            if (id == 1) {
                ex = x + 2;
                ey = y;
                ez = z;
            }
            if (id == 2) {
                ex = x + 2;
                ey = y + 1;
                ez = z;
            }
            if (id == 3) {
                ex = x + 2;
                ey = y;
                ez = z + 1;
            }
            if (id == 4) {
                ex = x + 2;
                ey = y;
                ez = z + 1;
            }
            if (id == 5) {
                ex = x + 2;
                ey = y;
                ez = z - 1;
            }
        }
        if (difficulty == 1) {
            id = rand.nextInt(7) + 1;
            if (id == 1) {
                ex = x + 3;
                ey = y;
                ez = z;
            }
            if (id == 2) {
                ex = x + 4;
                ey = y - 1;
                ez = z;
            }
            if (id == 3) {
                ex = x + 3;
                ey = y;
                ez = z + 1;
            }
            if (id == 4) {
                ex = x + 3;
                ey = y;
                ez = z - 1;
            }
            if (id == 5) {
                ex = x + 4;
                ey = y - 2;
                ez = z + 1;
            }
            if (id == 6) {
                ex = x + 4;
                ey = y - 2;
                ez = z - 1;
            }
            if (id == 7) {
                ex = x + 3;
                ey = y;
                ez = z + 2;
            }
            if (id == 8) {
                ex = x + 3;
                ey = y;
                ez = z - 2;
            }
        }
        mow.setBlock(ex, ey, ez);
        mow.ex = ex;
        mow.ey = ey;
        mow.ez = ez;
    }
}
