package JavaCore_HW1;


public class Animal implements Members {

    String name;
    float runLimit;
    float swimLimit;
    float jumpLimit;
    String type;
    boolean onDistance;

    public Animal() {
    }


    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное " + name);
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public String toString() {
        return "Животное: " + name;
    }

   public void run(float distance){
        if (distance <= runLimit){
            System.out.println(type + " " + name + " " + " пробежал заданную дистанцию");
        } else {
            System.out.println(type + " " + name + " " + " сошёл с дистании");
            onDistance = false;
        }
    }

    public void jump(float distance) {
        if (distance <= jumpLimit) {
            System.out.println(type + " " + name + " " + " взял заданную высоту");
        } else {
            System.out.println(type + " " + name + " " + " сошёл с дистанции");
            onDistance = false;
        }
    }

    public void swim(float distance) {
        if (swimLimit == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (distance <= swimLimit) {
            System.out.println(type + " " + name + " " + " проплыл заданную дистанцию");
        } else {
            System.out.println(type + " " + name + " " + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }


    public void showResult() {
        System.out.println(type + " " + name + ": " + onDistance);
    }


        }




