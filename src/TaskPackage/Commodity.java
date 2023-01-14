package TaskPackage;

public class Commodity  {

    private String name;
    private Double lengthOfCommodity;
    private Double widthOfCommodity;
    private Double weight;

    public Commodity(String name, Double lengthOfCommodity, Double widthOfCommodity, Double weight) {
        this.name = name;
        this.lengthOfCommodity = lengthOfCommodity;
        this.widthOfCommodity = widthOfCommodity;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public Double getLengthOfCommodity() {
        return lengthOfCommodity;
    }

    public Double getWidthOfCommodity() {
        return widthOfCommodity;
    }

    public Double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLengthOfCommodity(Double lengthOfCommodity) {
        this.lengthOfCommodity = lengthOfCommodity;
    }

    public void setWidthOfCommodity(Double widthOfCommodity) {
        this.widthOfCommodity = widthOfCommodity;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name = '" + name + '\'' +
                ", lengthOfCommodity = " + lengthOfCommodity +
                " sm, widthOfCommodity = " + widthOfCommodity +
                " sm, weight = " + weight +
                " kg}\n";
    }

}

































