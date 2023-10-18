public class Workflow{

    private Workflow(){
        
    }
    
    public static Workflow createWorkflow()
    {
        Workflow wf = new Workflow();
        return wf;
    }

    //changed void to boolean
    private boolean saveAttorneyDetails(String attorneyDetails)
    {
        return true;
    }

    public boolean saveAttDetails(String attorneyDetails)
    {
        return saveAttorneyDetails(attorneyDetails);
    }

    private int sendRequestForm(int requestFormNumber){
        return 0;
    }

    public int sendForm(int requestFormNumber) {
        return sendRequestForm(requestFormNumber);  
    }

    public boolean attorneyResponse(int requestFormNumber) {
        return false;
    }

    private boolean sendAttorneyResponse(int requestFormNumber) {
        return true;
    }

    public boolean sendAttResponse(int requestFormNumber)
    {
        return sendAttorneyResponse(requestFormNumber);
    }

}