package JavaCore_HW1;

public class Horse extends Animal {

    public Horse(String name) {
        this.name = name;
        this.runLimit = 100;
        this.swimLimit = 50;
        this.jumpLimit = 3;
    }

    @Override
    public void animalInfo() {
        System.out.println("Лошадь " + name + " бегает на " + runLimit + " м, прыгает на " + jumpLimit + " м, плавает на "+ swimLimit + " м.");
    }

    @Override
    public String toString() {
        return "Лошадь " + name + ", ";
    }
}
