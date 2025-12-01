package quest_08_interface;

public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    // take off, must be on ground
    @Override
    public void takeOff() {
        if (!this.flying) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    // ascent, must be in the air
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    // glide, must be in the air
    @Override
    public void glide() {
        if (this.flying) {
            System.out.printf("%s glides into the air.%n", this.getName());
        }
    }

    // descent, must be in the air
    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    // land, must be in the air and altitude must be <=1
    @Override
    public void land() {
        if (this.flying && this.altitude <= 1) {
            this.flying = false;
            System.out.printf("%s lands on the ground.%n", this.getName());
        }
        if (this.flying && this.altitude > 1) {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }
}