import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void addRoom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int bedRoomCount() {
        return this.bedrooms.size();
    }
}
