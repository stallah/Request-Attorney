/**
 * Workflow
 * @author: Ashna Tirougnaname
 * @version: 6.0
 */
import java.util.Iterator;
import java.util.LinkedList;

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
    
    //getter for the request for number
    public Integer getRequestFormNumber(LinkedList<Integer> list) {
    	return list.remove();
    }

    //workflow methods
    //saves attorney details
    private boolean saveAttorneyDetails(String attorneyDetails)
    {
        return true;
    }

    public boolean saveAttDetails(String attorneyDetails) {
        return saveAttorneyDetails(null);
    }


    //not using
    private int sendRequestForm(int requestFormNumber){
        return 0;
    }

    public int sendForm(int requestFormNumber) {
			return sendRequestForm(requestFormNumber); 
    }



    //gets the attorney response (if they have accepted or rejected the form)
    public boolean getAttorneyResponse(int requestFormNumber) {
        return false;
    }
    


    //send attorney response back to the workflow
    private boolean sendAttorneyResponse(int requestFormNumber) {
        return true;
    }

    public boolean sendAttResponse(Integer requestFormNumber)
    {
        return sendAttorneyResponse(requestFormNumber);
    }

}