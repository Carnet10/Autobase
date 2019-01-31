package Autobase_Class;

public class Cost implements java.io.Serializable {
    private double cost1 ;


    public Cost(double cost1) {
        this.cost1 = cost1;

    }

    public Cost() {

    }

    public double getCost1() {
        return cost1;
    }

    public void setCost1(double cost1) {
        this.cost1 = cost1;
    }
    public void showCost(){
        System.out.println("Cтоимость перевозки: " + " "+getCost1()+" USD");
    }
}
