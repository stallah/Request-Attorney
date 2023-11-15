/**
 * Workflow
 * @author: Ashna Tirougnaname
 * @version: 5.0
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
    
    public Integer getRequestFormNumber(LinkedList<Integer> list) {
    	return list.remove();
    }



    //workflow methods
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




    public boolean getAttorneyResponse(int requestFormNumber) {
        return false;
    }
    


//send response back to the workflow
    private boolean sendAttorneyResponse(int requestFormNumber) {
        return true;
    }

    public boolean sendAttResponse(Integer requestFormNumber)
    {
        return sendAttorneyResponse(requestFormNumber);
    }

}