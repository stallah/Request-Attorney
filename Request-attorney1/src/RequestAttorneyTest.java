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
        //testing expected results from attriubtes
        Assert.assertEquals(0, ra.getRequestFormNumber());
        Assert.assertEquals(null, ra.getAppointmentDetail());
    }

    @Test
    public void testConstructor(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment("Today", 0);
        Assert.assertNotNull(ra);
        //testing constructor with parameters using getters
        Assert.assertEquals("Today", ra.getAppointmentDetail());
        Assert.assertEquals(0, ra.getRequestFormNumber());

    }
    @Test
    public void testAcceptRequest(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, 0);
        Assert.assertNotNull(ra);
        //testing boolean for requests
        Assert.assertTrue(ra.acceptRequest(0));
    }

    @Test
    public void testRejectRequest(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, 0);
        Assert.assertNotNull(ra);
        //testing boolean for requests
        Assert.assertTrue(ra.rejectRequest(0));
    }

    @Test
    public void testUpdateAvailability(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, 0);
        Assert.assertNotNull(ra);
        //testing condition if availability is updated
        Assert.assertTrue(ra.updateAvailability(null));
    }

    @Test
    public void testAppointmentDetails(){
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, 0);
        Assert.assertNotNull(ra);
        //testing return of appointmentDetails()
        Assert.assertEquals(null, ra.appointmentDetails(0));
    }
    @Test
    public void testFormNumber(){
        //testing positive/negative request form numbers
        RequestAttorneyAppointment rr = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, -1);
        RequestAttorneyAppointment ra = RequestAttorneyAppointment.createRequestAttorneyAppointment(null, 1);
        Assert.assertFalse(rr.getRequestFormNumber()>0);
        Assert.assertTrue(ra.getRequestFormNumber()>0);

    }

}
