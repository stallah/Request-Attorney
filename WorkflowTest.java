import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

public class WorkflowTest {
    @Test
    public void testSendRequestForm() {
        Workflow wf = new Workflow();
        Assert.assertNotNull(wf);
        Assert.assertEquals(0, wf.sendRequestForm(0));

    }

    @Test
    public void testAttorneyResponse() {
        Workflow wf = new Workflow();
        Assert.assertNotNull(wf);
        Assert.assertFalse(wf.attorneyResponse(0));
    }
}
