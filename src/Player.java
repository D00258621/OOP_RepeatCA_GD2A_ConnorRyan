public class Player {

    private int id;
    private String name;
    private int age;
    private double winrate;

    public Player(int id, String name, int age, double winrate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.winrate = winrate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWinrate() {
        return winrate;
    }

    public void setWinrate(double winrate) {
        this.winrate = winrate;
    }

    @Override
    public String toString() {
        return "Player "+id+": Name: "+name+" Age: "+age+" Winrate: "+winrate;
    }
}
