package JavaCore_HW1;

public class Cat extends Animal {




        public Cat(String name) {
            this.name = name;
            this.runLimit = 40;
            this.swimLimit = 0;
            this.jumpLimit = 4;
            this.type = "Кот";
        }


        @Override
        public void animalInfo() {
            System.out.println("Кот " + name + " бегает на " + runLimit + " м, прыгает на " + jumpLimit + " м, но не умеет плавать.");
        }

        @Override
        public String toString() {
            return "Кот " + name + ", ";
        }



        }




