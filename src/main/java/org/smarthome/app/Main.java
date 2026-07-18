package org.smarthome.app;

import org.smarthome.home.SmartHome;
import org.smarthome.room.SmartRoom;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SmartHome home = context.getBean(SmartHome.class);
        SmartRoom room = home.getSmartRoom();
        room.setRoomName("Living Room");
        room.getSmartLight().setBrand("Philips");
        room.getSmartLight().setBrightness("100%");
        home.setOwnerName("Unzala");
        home.setAddress("Noida");
        home.setSmartRoom(room);
        System.out.println(home.displayHome());
    }
}
