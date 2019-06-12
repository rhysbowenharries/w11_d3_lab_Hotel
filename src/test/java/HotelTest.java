import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Guest guest;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Hotel hotel;

    @Before
    public void before(){
        guest = new Guest("Rhys");
        bedroom = new Bedroom( 1, 2, "Double");
        conferenceRoom = new ConferenceRoom( "Excelsior", 20);
        hotel = new Hotel();
    }

    @Test
//    can add room into hotel room array?
    public void canAddRoomToHotel(){
        hotel.addRoom(bedroom);
        assertEquals(1, hotel.bedRoomCount());
    }

//    @Test
//    can get number of rooms in hotel room array?

}
