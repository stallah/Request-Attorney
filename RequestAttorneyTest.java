import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

public class RequestAttorneyTest {
    @Test
    public void testObject(){
        RequestAttorneyAppointment ra = new RequestAttorneyAppointment();
        Assert.assertNotNull(ra);
        Assert.assertEquals(0, ra.getRequestFormNumber());
        Assert.assertEquals(null, ra.getAppointmentDetail());
    }

    @Test
    public void testConstructor(){
        RequestAttorneyAppointment ra = new RequestAttorneyAppointment("Today", 0);
        Assert.assertNotNull(ra);
        Assert.assertEquals("Today", ra.getAppointmentDetail());
        Assert.assertEquals(0, ra.getRequestFormNumber());

    }
    @Test
    public void testAcceptRequest(){
        RequestAttorneyAppointment ra = new RequestAttorneyAppointment();
        Assert.assertNotNull(ra);
        Assert.assertTrue(ra.acceptRequest(0));
    }

    @Test
    public void testRejectRequest(){
        RequestAttorneyAppointment ra = new RequestAttorneyAppointment();
        Assert.assertTrue(ra.acceptRequest(0));
    }

    @Test
    public void testUpdateAvailability(){
        RequestAttorneyAppointment ra = new RequestAttorneyAppointment();
         Assert.assertNotNull(ra);
        ra.updateAvailability("hello");
       
        //Assert.assertEquals("new availability details",);
    }
    public static void main(String[] args) {
        System.out.println("testing file");        
    }

}
