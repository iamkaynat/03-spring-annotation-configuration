package org.smarthome.light;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartLight {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

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
