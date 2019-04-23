package com.company;

import java.util.ArrayList;
import java.util.Enumeration;

public class Inventory
{
    //Inventory
    private String Car;
    private String Accessories;
    private ArrayList<Inventory> Parts;

   /* public Inventory(String _car, String _accessories, String _parts){
        this.Car = _car;
        this.Accessories = _accessories;
        this.Parts = _parts;
    } */

    //Lists for all Inventory things
    ArrayList<Inventory> carList = new ArrayList();
    ArrayList<Inventory> accessoryList = new ArrayList();
    ArrayList<Inventory> partsList = new ArrayList();

    //Parts List
    String part1 = "Brakes";
    //Methods
    public String getCar() {
        return Car;

    }

    public void setCar(String _car) {
        Car = _car;

    }

    public String getAccessories() {
        return Accessories;

    }

    public void setAccessories(String _accessories) {
        Accessories = _accessories;

    }

    public String getParts() {
        return Parts.toString();

    }

    public void setParts(ArrayList<Inventory> Parts) {
        Parts.toString();
    }

    public static void printParts(ArrayList<Inventory> partsList)
    {
        System.out.println("Parts list: ");
        for (Inventory part : partsList)
        {
            System.out.println(part.part1);
        }
    }
}
