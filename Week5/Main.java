public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Alien alien = new Alien();

        System.out.println("The human's health level before the alien's first bite is: " + human.health);
        System.out.println("The alien's energy level before the first bite is: " + alien.energy);

        alien.biteHuman(human);
        System.out.println();
        System.out.println("The human's health level after the alien first bit is: " + human.health);
        System.out.println("The alien's energy level after the first bite is: " + alien.energy);

        System.out.println();
        System.out.println("The alien's health level before the human shooting is: " + alien.health);
        System.out.println("The human's ammo level before the shooting is: " + human.ammo);

        System.out.println();
        System.out.println("The human shoots 2 times!!!");

        human.shootAlien(alien);
        human.shootAlien(alien);
        System.out.println();
        System.out.println("The alien's health level after the shooting is : " + alien.health);
        System.out.println("The human's ammo level after the human shooting is: " + human.ammo);

    }
}
