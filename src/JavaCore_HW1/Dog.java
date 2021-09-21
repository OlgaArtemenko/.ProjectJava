package JavaCore_HW1;

public class Dog extends Animal{

    public Dog(String name) {
        this.name = name;
        this.runLimit = 70;
        this.swimLimit = 30;
        this.jumpLimit = 2;
    }

    @Override
    public void animalInfo() {
        System.out.println("Собака " + name + " бегает на " + runLimit + " м, прыгает на " + jumpLimit + " м, плавает на "+ swimLimit + " м.");
    }

    @Override
    public String toString() {
        return "Собака " + name + ", ";
    }
}


