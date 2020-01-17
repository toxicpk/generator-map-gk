package pl.toxicproject.generator.generator;

public class Vector3 {
    int ex;

    int ey;

    int ez;

    public Vector3(int x, int y, int z) {
        this.ex = x;
        this.ey = y;
        this.ez = z;
    }

    public int getX() {
        return this.ex;
    }

    public int getY() {
        return this.ey;
    }

    public int getZ() {
        return this.ez;
    }
}
