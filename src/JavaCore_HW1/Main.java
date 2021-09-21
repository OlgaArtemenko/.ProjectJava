package JavaCore_HW1;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat(" ");
        cat1.animalInfo();
        Dog dog1 = new Dog(" ");
        dog1.animalInfo();
        Horse horse1 = new Horse(" ");
        horse1.animalInfo();

        Team newTeam = new Team("Бойцы");
        System.out.print("\n" + newTeam);
        Team.fillTeam();

        Team newTeam2 = new Team("Покемоны");
        System.out.print("\n" + newTeam2);
        Team.fillTeam();

        Obstacle[] obstacle = {new Run(60), new Jump(2), new Swim(4)};

        Course course = new Course(obstacle);
        System.out.println(course);



        course.doIt("Бизоны");


    }


}

