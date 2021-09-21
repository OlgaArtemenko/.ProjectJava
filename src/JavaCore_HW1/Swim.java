package JavaCore_HW1;

public class Swim extends Obstacle {
    protected float distance;

    public Swim(float distance) {

        this.distance = distance;
    }



    public float getSwimDistance(){
       return distance;
    }

    @Override
    public String toString() {
        return String.valueOf(distance);
    }





}
