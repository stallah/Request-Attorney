
/**
 * Business Object to request an attorney for appointment
 * @author Smita Tallah
 * @version 1.0
 */
public class RequestAttorneyAppointment {
    private int requestFormNumber;
    private String appointmentDetail;

    //private default constructor
    private RequestAttorneyAppointment(){
        this.appointmentDetail = null;
        this.requestFormNumber = 0;
    }

    //creates the object
    public static RequestAttorneyAppointment createRequestAttorneyAppointment(String appointmentDetail, int requestFormNumber){
        RequestAttorneyAppointment ra = new RequestAttorneyAppointment();
        ra.setAppointmentDetail(appointmentDetail);
        ra.setRequestFormNumber(requestFormNumber);
        return ra;
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
    public boolean acceptRequest(int requestFormNumber){
        return true;
    }

    public boolean rejectRequest(int requestFormNumber){
        return true;
    }

    public boolean updateAvailability(String newAvailability){
        return true;
    }
    
    public String appointmentDetails(int requestFormNumber){
        return null;

    }

}
