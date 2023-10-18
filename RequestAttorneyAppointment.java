
/**
 * Business Object to request an attorney for appointment
 * @author Smita Tallah
 * @version 1.0
 */
public class RequestAttorneyAppointment {
    private int requestFormNumber;
    private String appointmentDetail;

    private RequestAttorneyAppointment(){
        this.appointmentDetail = null;
        this.requestFormNumber = 0;
    }

    private RequestAttorneyAppointment(String appointmentDetail, int requestFormNumber){
        this.requestFormNumber = requestFormNumber;
        this.appointmentDetail = appointmentDetail;
    }

    public static RequestAttorneyAppointment createRequestAttorneyAppointment(String appointmentDetail, int requestFormNumber){
        RequestAttorneyAppointment ra = new RequestAttorneyAppointment();
        ra.setAppointmentDetail(appointmentDetail);
        ra.setRequestFormNumber(requestFormNumber);
        return ra;
    }

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

    public boolean acceptRequest(int requestFormNumber){
        return true;
    }

    public boolean rejectRequest(int requestFormNumber){
        return true;
    }
    //void to boolean
    public boolean updateAvailability(String newAvailability){
        System.out.println("new availability details");
        return true;
    }
    //void to string
    public String appointmentDetails(int requestFormNumber){
        System.out.println("appointment details");
        return null;

    }

}
