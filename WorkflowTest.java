/**
 * A JUnit tester file to test methods from Workflow file.
 * @author: Ashna Tirougnaname
 * @version: 1.0
 */

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

public class WorkflowTest {
    //testing for saving attorney details
    @Test
    public void testSaveAttorneyDetails() {
        Workflow wf = Workflow.createWorkflow();
        Assert.assertNotNull(wf);
    }
    
    //testing for sending request form
    @Test
    public void testSendRequestForm() {
        Workflow wf = Workflow.createWorkflow();
        Assert.assertNotNull(wf);
        //testing if form number is equal
        Assert.assertEquals(0, wf.sendForm(0));
        //testing if form number is a positive number
        Assert.assertTrue(wf.sendForm(0)>0);

    }

    //testing for attorney response
    @Test
    public void testAttorneyResponse() {
        Workflow wf = Workflow.createWorkflow();
        Assert.assertNotNull(wf);
        //testing for attorney response
        Assert.assertTrue(wf.sendAttResponse(0));
    }

    //testing for saving attorney response
    @Test
    public void testSendAttorneyResponse() {
        Workflow wf = Workflow.createWorkflow();
        Assert.assertNotNull(wf);
        //testing if attorney details are saved successfully
        Assert.assertTrue(wf.saveAttDetails(null));
    }
}
