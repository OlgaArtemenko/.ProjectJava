package JavaCore_HW1;

import java.util.Random;

public class Team {
    public static String getNameTeam;
    String nameTeam;
    Animal[] teamMember;



    public Team(String nameTeam) {

        this.nameTeam = nameTeam;

            }


    public static Animal[] fillTeam() {

        Animal[] teamMember = new Animal[4];
        Animal obj = null;
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomNumber = random.nextInt(8);
            switch (randomNumber) {
                case 0:
                    obj = new Cat("Барсик");
                    break;
                case 1:
                    obj = new Dog("Шарик");
                    break;
                case 2:
                    obj = new Horse("Гречка");
                    break;
                case 3:
                    obj = new Cat("Бизон");
                    break;
                case 4:
                    obj = new Dog("Мухтар");
                    break;
                case 5:
                    obj = new Horse("Плутон");
                    break;
                case 6:
                    obj = new Cat("ЯЯ");
                    break;
                case 7:
                    obj = new Dog("Белка");
                    break;
                case 8:
                    obj = new Horse("Бизон");
                    break;
            }
            teamMember[i] = obj;

            System.out.print(teamMember[i] + " ");

        }
        return teamMember;


    }



    public Animal[] getMember(){
        return teamMember;
    }


    public String getNameTeam(String nameTeam) {
        return nameTeam;

    }
    

        @Override
        public String toString () {
            return "Команда " + nameTeam + ": ";
        }


    public Animal[] getMembers(){
               return fillTeam();
    }
}











