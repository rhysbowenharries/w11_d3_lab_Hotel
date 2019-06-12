import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Bedroom bedroom;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int bedRoomCount() {
        return this.bedrooms.size();
    }

    public void checkInGuestToBedroom(Bedroom bedroom, Guest guest) {
        bedroom.addGuestToRoom(guest);
    }


}
