package org.smarthome.home;

import org.smarthome.room.SmartRoom;

public class SmartHome {
    private String ownerName;
    private String address;

    public SmartHome(String ownerName, String address, SmartRoom smartRoom) {
        this.ownerName = ownerName;
        this.address = address;
        this.smartRoom = smartRoom;
    }

    private SmartRoom smartRoom;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SmartRoom getSmartRoom() {
        return smartRoom;
    }

    public void setSmartRoom(SmartRoom smartRoom) {
        this.smartRoom = smartRoom;
    }

    public String displayHome(){
        return "Smart Home : Owner name :" + this.ownerName + " Address : " + this.address + "Smart Room : " + smartRoom.displayRoom();
    }
}
