package org.smarthome.light;

public class SmartLight {
    private String brand;
    private String brightness;

    public void  turnOn(){
        System.out.println("Smart Light is on.");
    }
    public void turnOff(){
        System.out.println("Smart Light is turn off.");
    }

    public String displayLight(){
        return "Brand : " + this.brand + " Brightness : " + this.brightness;
    }
}
