package Autobase_Class;
 import java.io.*;
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;
import java.util.ArrayList;

public class Driver implements java.io.Serializable {
    private String dSecondName; //фамилия водителя
    private String dFirstName; //имя водителя
    private String dPaternalName;//отчество водителя
    boolean dAdmission = true; //допуск водителя к перевозке


   /* // конструктор 1
    public Driver(String dSecondName, String dFirstName, String dPaternalName, boolean dAdmission) {
        this.dSecondName = dSecondName;
        this.dFirstName = dFirstName;
        this.dPaternalName = dPaternalName;
        this.dAdmission = dAdmission;
    }*/
    // конструктор 2
   public Driver(String dSecondName, String dFirstName, String dPaternalName) {
        this.dSecondName = this.dSecondName;
        this.dFirstName = this.dFirstName;
        this.dPaternalName = this.dPaternalName;
    }
    // конструктор 3
    public Driver(String token, String s, String token1, String s1, String token2) {
        this.dSecondName = dSecondName;
        this.dFirstName = dFirstName;
        this.dPaternalName = dPaternalName;
        this.dAdmission = dAdmission;
    }
    public String getdSecondName() { //геттер
        return dSecondName;
    }

    public void setdSecondName(String dSecondName) { // сеттер
        this.dSecondName = dSecondName;
    }

    public String getdFirstName() { //геттер
        return dFirstName;
    }

    public void setdFirstName(String dFirstName) { // сеттер
        this.dFirstName = dFirstName;
    }

    public String getdPaternalName() { //геттер
        return dPaternalName;
    }

    public void setdPaternalName(String dPaternalName) { // сеттер
        this.dPaternalName = dPaternalName;
    }

    public boolean isdAdmission() { //геттер
        return dAdmission;
    }

    public void setdAdmission(boolean dAdmission) { // сеттер
        this.dAdmission = dAdmission;

    }

    public void showDriver(){
        System.out.println("Ф.И.О. Водителя: " + getdFirstName()+ " "+getdSecondName()+" "+getdPaternalName());
        System.out.println();
    }



}




