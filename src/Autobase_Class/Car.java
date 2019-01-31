package Autobase_Class;

public class Car implements java.io.Serializable {
    private String brand;
    private String model;
    private String reg_number;

   /* public Car(String brand1, String model1, String reg_number1,St) {
        this.brand = brand1;
        this.model = model1;
        this.reg_number = reg_number1;
    }*/

    public Car(String brand, String model, String reg_number) {
        this.brand = brand;
        this.model = model;
        this.reg_number = reg_number;
    }
  /* public Car() {

    }*/

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getReg_number() {
        return reg_number;
    }

    public void setReg_number(String reg_number) {
        this.reg_number = reg_number;
    }
    public void showCar(){
        System.out.println("Регистрационые данные автомобиля: " +getBrand()+ " "+getModel()+" "+getReg_number());
        System.out.println();
    }
    @Override
    public String toString(){
        return brand + " " + model + " " + reg_number;

    }

    //System.out.println("Ф.И.О. Водителя: " + getdFirstName()+ " "+getdSecondName()+" "+getdPaternalName());


}
