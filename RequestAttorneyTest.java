import org.junit.*;

public class RequestAttorneyTest {
    @Test
    public void test1(){
        RequestAttorneyAppointment ra = new RequestAttorneyAppointment();
        Assert.assertEquals("hello world", ra.toString());
    }

    public static void main(String[] args) {
        System.out.println("testing file");        
    }

}
