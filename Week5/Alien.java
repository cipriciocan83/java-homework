public class Alien implements Character {
    int health = 200;
    int energy = 100;
    boolean isDead = false;


    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setHealth() {
        this.health = health;
    }

    @Override
    public void isDead() {
        if(health > 0){
            isDead = false;
        } else {
            isDead = true;
        }
    }

    public void biteHuman(Human human){
        if (this.energy >= 80 && this.energy <= 100){
            human.health -= 25;
            this.energy -= 10;
        } else if(this.energy >= 50 && this.energy < 80){
            human.health -= 15;
            this.energy -= 10;
        }else if (this.energy < 50){
            human.health -=10;
            this.energy -=10;

        }
    }
}
