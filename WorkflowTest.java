/**
 * A JUnit tester file to test methods from Workflow file.
 * @author: Ashna Tirougnaname
 * @version: 1.0
 */

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
