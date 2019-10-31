public class Human implements Character {
    boolean isDead = false;
    int health = 100;
    int ammo = 200;

    @Override
    public int getHealth(){
        return health;
    }

    @Override
    public void setHealth() {
        this.health = health;
    }

    @Override
    public void isDead() {
        if(health > 0){
            this.isDead = false;
        } else {
            this.isDead = true;
        }
    }

    public void shootAlien(Alien alien){
        this.ammo -=15;
        alien.health -=25;
    }
}
