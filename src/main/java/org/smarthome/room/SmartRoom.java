package org.smarthome.room;

import org.smarthome.light.SmartLight;

public class SmartRoom {
    public SmartRoom(String roomName, SmartLight smartLight) {
        this.roomName = roomName;
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
