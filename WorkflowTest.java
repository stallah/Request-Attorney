/**
 * A JUnit tester file to test methods from Workflow file.
 * @author: Ashna Tirougnaname
 * @version: 1.0
 */

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

public class WorkflowTest {
    @Test
    public void testSaveAttorneyDetails() {
        Workflow wf = Workflow.createWorkflow();
        Assert.assertNotNull(wf);
        
    }
    
    @Test
    public void testSendRequestForm() {
        Workflow wf = Workflow.createWorkflow();
        Assert.assertNotNull(wf);
        Assert.assertEquals(0, wf.sendForm(0));
        Assert.assertTrue(wf.sendForm(0)>0);

    }

    @Test
    public void testAttorneyResponse() {
        Workflow wf = Workflow.createWorkflow();
        Assert.assertNotNull(wf);
        Assert.assertTrue(wf.sendAttResponse(0));
    }

    @Test
    public void testSaveAttorneyResponse() {
        Workflow wf = Workflow.createWorkflow();
        Assert.assertNotNull(wf);
        Assert.assertTrue(wf.saveAttDetails(null));
    }
}
