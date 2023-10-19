/**
 * Workflow
 * @author: Ashna Tirougnaname
 * @version: 5.0
 */

public class Workflow{
    
    //private default constructor
    private Workflow(){
        
    }
    
    //creating object
    public static Workflow createWorkflow()
    {
        Workflow wf = new Workflow();
        return wf;
    }



    //workflow methods
    //save attorney details
    private boolean saveAttorneyDetails(String attorneyDetails)
    {
        return true;
    }

    public boolean saveAttDetails(String attorneyDetails) {
        return saveAttorneyDetails(null);
    }


    //send request form
    private int sendRequestForm(int requestFormNumber){
        return 0;
    }

    public int sendForm(int requestFormNumber) {
        return sendRequestForm(requestFormNumber);  
    }



    //attorney response
    public boolean attorneyResponse(int requestFormNumber) {
        return false;
    }
    


    //send attorney response
    private boolean sendAttorneyResponse(int requestFormNumber) {
        return true;
    }

    public boolean sendAttResponse(int requestFormNumber)
    {
        return sendAttorneyResponse(requestFormNumber);
    }

}