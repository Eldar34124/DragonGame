public class Dragon implements BitAble {
    private int Hp;
    private int Sila;
    private int points;
    private int orujyia;

    public Dragon(int hp, int Sila, int points, int orujyia) {
        this.Hp = hp;
        this.Sila = Sila;
        this.points = points;
        this.orujyia = orujyia;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getSila() {
        return Sila;
    }

    public void setSila(int sila) {
        Sila = sila;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getOrujyia() {
        return orujyia;
    }

    public void setOrujyia(int orujyia) {
        this.orujyia = orujyia;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "Hp=" + Hp +
                ", Health=" + Sila +
                ", points=" + points +
                ", orujyia=" + orujyia +
                '}';


    }

    @Override
    public int bitHeroToDragon(Hero hero, int chislo) {
        if (chislo>25) {
            this.Hp = this.Hp - hero.getSila();
        }else{
            System.out.println("udar ne popal po dragonu");
        }
        return this.Hp;
    }
}
