package JavaCore_HW1;

public class Course {

    Obstacle[] obstacle;

    public Course(Obstacle[] obstacle) {
        this.obstacle = obstacle;
    }

    public Obstacle getRunDistance() {
        return obstacle[0];
    }

    @Override
    public String toString() {
        return "\nЗадана полоса препятствий: Пробежать " + obstacle[0] + " м," + " перепрыгнуть стену в " + obstacle[1] + " м, " + " проплыть " + obstacle[2] + " м";
    }


    public void doIt(String teamName) {
        Animal[] teamMember = new Animal[4];

        for (Members a : teamMember) {

            for (Obstacle o : obstacle) {
                o.doIt(a);
                if (a.isOnDistance()) {
                    continue;
                }
                break;
            }
        }
    }
}







