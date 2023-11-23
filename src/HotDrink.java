public class HotDrink extends BottleOFWater {
    private int temp;

    public HotDrink(String name, int cost, int volume, int temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "BottleOFWater{" +
                "name=" + super.getName() +
                ";cost=" + super.getCost() +
                ";volume=" + super.getVolume() +
                ";temp=" + temp +
                '}';
    }

}
