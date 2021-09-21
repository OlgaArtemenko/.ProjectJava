package JavaCore_HW1;

public class Run extends Obstacle {
        private float distance;



        public Run(float distance) {
            this.distance = distance;
        }



        public float getRunDistance(){
                  return distance;
        }

        @Override
        public String toString() {
            return String.valueOf(distance);
        }


    }
