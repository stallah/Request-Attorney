
/**
 * Business Object to request an attorney for appointment in RA
 * @author Smita Tallah
 * @version 3.0
 */
import java.util.LinkedList;

/**
 * Business Object to request an attorney for appointment in RA
 * @author Smita Tallah
 * @version 1.0
 */
public class RequestAttorneyAppointment {
    private int requestFormNumber;
    private String appointmentDetail;
	protected static LinkedList<Integer> list = new LinkedList<>();
	
    //private default constructor
    private RequestAttorneyAppointment(){
        this.appointmentDetail = null;
        this.requestFormNumber = 0;
        this.list = null;
    }
    //private constructors with paramaters
    /*
    private RequestAttorneyAppointment(String appointmentDetail, int requestFormNumber){
        this.requestFormNumber = requestFormNumber;
        this.appointmentDetail = appointmentDetail;
    }
    
*/
    //creates the object
    public static RequestAttorneyAppointment createRequestAttorneyAppointment(String appointmentDetail, int requestFormNumber){
        RequestAttorneyAppointment ra = new RequestAttorneyAppointment();
        ra.setAppointmentDetail(appointmentDetail);
        ra.setRequestFormNumber(requestFormNumber);
        //add to list of request form numbers
        //list.add((Integer)requestFormNumber);
        return ra;
    }

    public LinkedList<Integer> getRequestFormNumbers(){
    	list.add(112);
    	list.add(113);
    	list.add(115);
    	
    	return list;
    }
    
  //setters and getters for attributes
    protected int getRequestFormNumber(){
        return this.requestFormNumber;
    }

    private void setRequestFormNumber(int requestFormNumber){
        this.requestFormNumber = requestFormNumber;
    }

    protected String getAppointmentDetail(){
        return this.appointmentDetail;
    }

    private void setAppointmentDetail(String appointmentDetail){
        this.appointmentDetail = appointmentDetail;
    }

    //object methods
    public static boolean acceptRequest(int requestFormNumber){
        return true;
    }
//used by approver
    public static boolean rejectRequest(int requestFormNumber){
        return true;
    }
//used by data entry
    public boolean updateAvailability(String newAvailability){
        return true;
    }
    
    public static String appointmentDetails(int requestFormNumber){
        return "01/01/2024";

    }

}
