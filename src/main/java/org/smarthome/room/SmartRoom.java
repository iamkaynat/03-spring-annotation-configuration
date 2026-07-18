package org.smarthome.room;

import org.smarthome.light.SmartLight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartRoom {
    @Autowired
    public SmartRoom( SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public SmartLight getSmartLight() {
        return smartLight;
    }

    public void setSmartLight(SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    private String roomName;
    private SmartLight smartLight;

    public String displayRoom(){
        return "Smart Room Name : " + this.roomName + "Smart Light : " + smartLight.displayLight();
    }
}
