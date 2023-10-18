/**
 * A JUnit tester file to test methods from business object file:
 * RequestAttorneyAppointment
 * @author: Smita Tallah
 * @version: 1.0
 */
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

public class RequestAttorneyTest {
    @Test
    public void testObject(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, 0);
        Assert.assertNotNull(ra);
        Assert.assertEquals(0, ra.getRequestFormNumber());
        Assert.assertEquals(null, ra.getAppointmentDetail());
    }

    @Test
    public void testConstructor(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment("Today", 0);
        Assert.assertNotNull(ra);
        Assert.assertEquals("Today", ra.getAppointmentDetail());
        Assert.assertEquals(0, ra.getRequestFormNumber());

    }
    @Test
    public void testAcceptRequest(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, 0);
        Assert.assertNotNull(ra);
        Assert.assertTrue(ra.acceptRequest(0));
    }

    @Test
    public void testRejectRequest(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, 0);
        Assert.assertTrue(ra.acceptRequest(0));
    }

    @Test
    public void testUpdateAvailability(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, 0);
        Assert.assertNotNull(ra);
        Assert.assertTrue(ra.updateAvailability(null));
        //Assert.assertEquals("new availability details",);
    }

    @Test
    public void testAppointmentDetails(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, 0);
        Assert.assertNotNull(ra);
        Assert.assertEquals(null, ra.appointmentDetails(0));
        //Assert.assertEquals("new availability details",);
    }
    @Test
    public void testNegativeFormNumber(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, 1);
        RequestAttorneyAppointment rr = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, -1);
        //Assert.Positive(ra.getAppointmentDetail());
        Assert.assertTrue(rr.getRequestFormNumber()>0);
        Assert.assertTrue(ra.getRequestFormNumber()>0);
    }


    public static void main(String[] args) {
        System.out.println("testing file");        
    }

}
