package Autobase_Class;
import java.util.*;
//import java.util.Scanner;
import java.io.*; //для маркировки сериализации import java.io.Serializable;

public class Autobase_Class{ //
    public static void main(String[] args){

        ArrayList<Driver>DrList = new ArrayList<Driver>();
        ArrayList<Car>CarList = new ArrayList<Car>();
        ArrayList<Cost>CostList = new ArrayList<Cost>();
        ArrayList<Route>RouteList = new ArrayList<Route>();
        do {
            System.out.println("Введите значение от 0 до : 9");
            System.out.println("\t0. Вывести список");
            System.out.println("\t1. Регистация водителей в программе");
            System.out.println("\t2. Отображения списка зарегитрированных в программе водителей");
            System.out.println("\t3. Регистация автомобилей на автобазе");
            System.out.println("\t4. Зарегистрированные на автобазе автомобили");
            System.out.println("\t5. Установить стоимость перевозки");
            System.out.println("\t6. Отобразить стоимость перевозки");
            System.out.println("\t7. Регистация в программе заявок на перевозку");
            System.out.println("\t8. Посмотр заявку на перевозку в программе");
            System.out.println("\t9. Демо версия программы билд 0.1A");
            System.out.println("\t10. Установить водителя, назначить ему рейс, установить состояние рейса и автомобиля");
            System.out.println("\t11. Добавить водителя и новый рейс");
            System.out.println("\t12. Изменить состояние автомобиля и отметку о выполнении рейса для водителя");
            System.out.println("\t13. Отстранить водителя от работы");
            System.out.println("\t14. Изменить рейс у водителя");


            int c = new Scanner(System.in).nextInt();
            Scanner input = new Scanner(System.in);
            //----Driver-----
            String dSecondName=null;
            String dFirstName=null;
            String dPaternalName=null;
            Driver obj = new Driver(dSecondName, dFirstName, dPaternalName);
            //----Car-----
            String brand = null;
            String model= null;
            String reg_number=null;
            Car cobj = new Car(brand, model, reg_number);
            //----Cost----
            double cost = 0.0;
            Cost costobj = new Cost(cost);
            //----Route----
            String source=null;   // место отправления
            String destination=null;  // место назначения
            int range=0;
            Route robj = new Route(source,destination,range);

            switch (c) {

                case 0:

                break;
                case 1:
                    System.out.println("Введите Ф.И.О. водителей ");
                    System.out.println("Для выхода из регистрации нажмите - q");
                    System.out.println("Введите Фамилию водителя");
                    obj.setdFirstName(input.nextLine());
                    System.out.println("Введите имя водителя");
                    obj.setdSecondName(input.nextLine());
                    System.out.println("Введите отчество водителя");
                    obj.setdPaternalName(input.nextLine());
                    DrList.add(obj);
                    for (Driver dr : DrList) {//с помощью цикла for each c ArrayList читаем поля поочередно сохраняя с переменную dr
                        dr.showDriver();
                        System.out.println("Размер ArrayList DrList:   " + DrList.size());
                    }
                    try {
                        FileOutputStream fileOut = new FileOutputStream("E:\\JAVA_1\\Autobase\\driver.ser");
                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                        out.writeObject(obj);
                        out.close();
                        fileOut.close();
                        System.out.println("Сериализованная информация о Driver сохранена в \\JAVA_1\\Autobase\\driver.ser");
                    }catch(IOException i) {
                        i.printStackTrace();
                    }
                    if (input.nextLine().equals("q")) {
                        break;
                    }
                    break;

                case 2:
                    Driver d = null;
                    try {
                        FileInputStream fileIn = new FileInputStream("E:\\JAVA_1\\Autobase\\driver.ser");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        d = (Driver) in.readObject();
                        in.close();
                        fileIn.close();
                    }catch(IOException i) {
                        i.printStackTrace();
                        return;
                    }catch(ClassNotFoundException cl) {
                        System.out.println("Driver класс не найден");
                        cl.printStackTrace();
                        return;
                    }

                    System.out.println("Десериализованный Driver...");
                    System.out.println("Имя: " + d.getdFirstName());
                    System.out.println("Фамилия: " + d.getdSecondName());
                    System.out.println("Отчетсво: " + d.getdPaternalName());

                   for (Driver dr : DrList) {
                    dr.showDriver();
                    System.out.println("Размер ArrayList DrList:   " + DrList.size());
                }

                    if (input.nextLine().equals("q")) {
                        break;
                    }

                case 3:
                    System.out.println("Регистрация автомобиля: ");
                    System.out.println("Для выхода из регистрации нажмите - q");
                    System.out.println("Введите марку автомобиля");
                    cobj.setBrand(input.nextLine());
                    System.out.println("Введите модель авто");
                    cobj.setModel(input.nextLine());
                    System.out.println("Введите регистрационный номер автомобиля");
                    cobj.setReg_number(input.nextLine());
                    CarList.add(cobj);
                    for (Car cr : CarList) {//с помощью цикла for each c ArrayList читаем поля поочередно сохраняя с переменную dr
                        cr.showCar();
                        System.out.println("Размер ArrayList CarList:   " + CarList.size());
                    }
                    try {
                        FileOutputStream fileOut1 = new FileOutputStream("E:\\JAVA_1\\Autobase\\car.ser");
                        ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
                        out1.writeObject(cobj);
                        out1.close();
                        fileOut1.close();
                        System.out.println("Сериализованная информация о Driver сохранена в \\JAVA_1\\Autobase\\car.ser");
                    }catch(IOException i) {
                        i.printStackTrace();
                    }
                    /*for (Car cr : CarList) {//с помощью цикла for each c ArrayList читаем поля поочередно сохраняя с переменную dr
                        cr.showCar();
                        System.out.println("Размер ArrayList CarList:   " + CarList.size());
                    }*/
                    if (input.nextLine().equals("q")) {
                        break;
                    }
                    break;

                case 4:
                    Car ca = null;
                    try {
                        FileInputStream fileIn = new FileInputStream("E:\\JAVA_1\\Autobase\\car.ser");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        ca = (Car) in.readObject();
                        in.close();
                        fileIn.close();
                    }catch(IOException i) {
                        i.printStackTrace();
                        return;
                    }catch(ClassNotFoundException cl2) {
                        System.out.println("Car класс не найден");
                        cl2.printStackTrace();
                        return;
                    }
                    System.out.println("Десериализованный Car...");
                    System.out.println("Регистрационые данные автомобиля: "+ ca.getBrand() +" "+ca.getModel()+" "+  ca.getReg_number());
                    System.out.println();
                    for (Car cr : CarList) {
                        cr.showCar();
                        System.out.println("Размер ArrayList CarList:   " + CarList.size());
                    }
                    if (input.nextLine().equals("q")) {
                        break;
                    }
                case 5:
                    System.out.println("Внесение в программу стоимости перевозки: ");
                    System.out.println("Для выхода из регистрации нажмите - q");
                    System.out.println("Введите стоимость перевозки");
                    costobj.setCost1(input.nextDouble());
                    CostList.add(costobj);
                    for (Cost co : CostList) {//с помощью цикла for each c ArrayList читаем поля поочередно сохраняя с переменную dr
                        co.showCost();
                        System.out.println("Размер ArrayList CostList:   " + CostList.size());
                    }
                    try {
                        FileOutputStream fileOut = new FileOutputStream("E:\\JAVA_1\\Autobase\\cost.ser");
                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                        out.writeObject(costobj);
                        out.close();
                        fileOut.close();
                        System.out.println("Сериализованная информация о Driver сохранена в \\JAVA_1\\Autobase\\cost.ser");
                    }catch(IOException i) {
                        i.printStackTrace();
                    }
                    if (input.nextLine().equals("q")) {
                        break;
                    }

                case 6:
                    Cost cos= null;
                    try {
                        FileInputStream fileIn = new FileInputStream("E:\\JAVA_1\\Autobase\\cost.ser");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        cos = (Cost) in.readObject();
                        in.close();
                        fileIn.close();
                    }catch(IOException i) {
                        i.printStackTrace();
                        return;
                    }catch(ClassNotFoundException cl) {
                        System.out.println("Cost класс не найден");
                        cl.printStackTrace();
                        return;
                    }
                    System.out.println("Десериализованный Cost...");
                    System.out.println("Тариф перевозки составляет: " + cos.getCost1()+ "USD");

                    for(Cost co:CostList){
                        co.showCost();
                        System.out.println("Размер ArrayList DrList:   " + CostList.size());
                    }
                    if (input.nextLine().equals("q")) {
                        break;
                    }
                case 7:
                    System.out.println("Регистрация заявки на перевозку ");
                    System.out.println("Для выхода из регистрации нажмите - q");
                    //while (true) {
                    System.out.println("Введите пункт отправления: ");
                    robj.setSource(input.nextLine());
                    System.out.println("Введите пункт назначения: ");
                    robj.setDestination(input.nextLine());
                    System.out.println("Введите растояние перевозки: ");
                    robj.setRange(input.nextInt());
                    RouteList.add(robj);
                    for(Route rt: RouteList){
                        rt.showRoute();
                        System.out.println("Размер ArrayList RouteList: " + RouteList.size());
                        try {
                            FileOutputStream fileOut = new FileOutputStream("E:\\JAVA_1\\Autobase\\route.ser");
                            ObjectOutputStream out = new ObjectOutputStream(fileOut);
                            out.writeObject(robj);
                            out.close();
                            fileOut.close();
                            System.out.println("Сериализованная информация о Route сохранена в \\JAVA_1\\Autobase\\route.ser");
                        }catch(IOException i) {
                            i.printStackTrace();
                        }
                        if (input.nextLine().equals("q")) {
                            break;
                        }
                        break;

                    }

                    robj.showRoute();
                    if (input.nextLine().equals("q")) {
                        break;
                    }
                    break;
                case 8:
                Route rout = null;
                    try {
                        FileInputStream fileIn = new FileInputStream("E:\\JAVA_1\\Autobase\\route.ser");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        rout = (Route) in.readObject();
                        in.close();
                        fileIn.close();
                    }catch(IOException i) {
                        i.printStackTrace();
                        return;
                    }catch(ClassNotFoundException cl) {
                        System.out.println("Route класс не найден");
                        cl.printStackTrace();
                        return;
                    }

                    System.out.println("Зарегитрированная заявка на перевозку: " + rout.getSource()+" "+ rout.getDestination()+" "+ rout.getRange()+ " км.");

                System.out.println("Зарегитрированная заявка на перевозку: ");
                for(Route rt: RouteList){
                    rt.showRoute();
                }
                if (input.nextLine().equals("q")) {
                    break;
                }
                break;
                case 9:
                    System.out.println("Обработка заявки на перевозку");
                    System.out.println("Введите пункт отправления: ");
                    //String from = scan.nextLine();
                    String from = new Scanner(System.in).nextLine();
                    System.out.println("Введите пункт назначения: ");
                    //String where = scan.nextLine();
                    String where = new Scanner(System.in).nextLine();
                    System.out.println("Введите растояние: ");
                    //int range = scan.nextInt();
                    range = new Scanner(System.in).nextInt();
                    System.out.println("Введите марку авто: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("Введите стоимость за 1 км: ");
                    double prise = new Scanner(System.in).nextDouble();// переводит на новую строку-  nextDouble()
                    //double prise = scan.nextDouble();

                    System.out.println("\n\n\n"+"Счет на перевозку от ООО \"СА Интернейшионал ТРанспорт Логистик\""+"\n"+"Маршрт перевозки: \n");
                    System.out.println("из: "+ from+"\n"+ "в: "+ where);
                    System.out.println("\n"+"Перевозка будет осуществляться автомобилем: "+ name +"\n"+ "Растояние перевозки: "+ range +"км."+"\n");
                    System.out.println("Стоимость перевозки составит: "+ prise*range +"USD"+"\n"+"Генеральный директор ООО \"СА Интернейшионал Транспорт Логистик\""+ "\n"+  "Гапеев Сергей __________    "+"\n"+"Коммерческий директор ООО \"СА Интернейшионал Транспорт Логистик\""+ "\n"+  "Царанок Александр __________ м п"+"\n");
                    if (input.nextLine().equals("q")) {
                        break;
                    }
                    break;

                default:
                    System.out.println("Ты можеш выбрать только 0-9! Досвидания...");
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }
}

