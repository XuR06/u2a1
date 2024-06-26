/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a1_xuricky;

/**
 *
 * @author 343207676
 */
public class Vehicle {
    
    private int numOfPassenger;
    private static double gasPrice, distance;
    private double fuelEfficency, farePricePerPerson, revenue;
    private String licensePlate, compareOne, compareTwo;

    
    //constructor
    public Vehicle(String licensePlate,int numOfPassenger, double farePricePerPerson, double fuelEfficency) {
        this.numOfPassenger = numOfPassenger;
        this.farePricePerPerson = farePricePerPerson;
        this.fuelEfficency = fuelEfficency;
        this.licensePlate = licensePlate;
    }

    
    //setters
    public void setGasPricePerLitre(int gasPrice) {
        this.gasPrice = gasPrice;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setNumOfPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public void setFarePricePerPerson(int farePricePerPerson) {
        this.farePricePerPerson = farePricePerPerson;
    }

    public void setFuelEfficency(int fuelEfficency) {
        this.fuelEfficency = fuelEfficency;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    
    
    //getters
    public int getNumOfPassenger() {
        return numOfPassenger;
    }

    public double getFarePricePerPerson() {
        return farePricePerPerson;
    }

    public double getFuelEfficency() {
        return fuelEfficency;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getGasPrice() {
        return gasPrice;
    }

    public double getDistance() {
        return distance;
    }
    
    public double getRevenue(){
        return revenue = numOfPassenger*farePricePerPerson;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "numOfPassenger=" + numOfPassenger + ", fuelEfficency=" + fuelEfficency + ", farePricePerPerson=" + farePricePerPerson + ", revenue=" + revenue + ", licensePlate=" + licensePlate + ", compareOne=" + compareOne + ", compareTwo=" + compareTwo + '}';
    }
    
    
}
