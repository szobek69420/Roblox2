package main.java.org.linalg;

public class Vec2 implements Cloneable{
    public float x, y;

    public Vec2(float x, float y)
    {
        this.x=x;
        this.y=y;
    }

    public Vec2(float szam)
    {
        this.x=szam;
        this.y=szam;
    }

    public Vec2()
    {
        this.x=0;
        this.y=0;
    }

    @Override
    public Vec2 clone() {
        try {
            Vec2 clone = (Vec2) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static Vec2 sum(Vec2 a, Vec2 b)
    {
        return new Vec2(0);
    }
}
