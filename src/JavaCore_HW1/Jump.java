package JavaCore_HW1;

public  class Jump extends Obstacle {

            private float distance;

        public Jump(float distance) {

            this.distance = distance;
        }

    public float getJumpDistance(){
       return distance;
    }


    @Override
    public String toString() {
        return String.valueOf(distance);
    }



    }

