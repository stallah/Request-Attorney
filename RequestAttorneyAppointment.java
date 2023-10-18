public class RequestAttorneyAppointment {
    private int requestFormNumber;
    private String appointmentDetail;

    public RequestAttorneyAppointment(){
        this.appointmentDetail = null;
        this.requestFormNumber = 0;
    }

    public RequestAttorneyAppointment(String appointmentDetail, int requestFormNumber){
        this.requestFormNumber = requestFormNumber;
        this.appointmentDetail = appointmentDetail;
    }

    public int getRequestFormNumber(){
        return this.requestFormNumber;
    }

    public void setRequestFormNumber(int requestFormNumber){
        this.requestFormNumber = requestFormNumber;
    }

    public String getAppointmentDetail(){
        return this.appointmentDetail;
    }
    
    public void setAppointmentDetail(String appointmentDetail){
        this.appointmentDetail = appointmentDetail;
    }

    public boolean acceptRequest(int requestFormNumber){
        return true;
    }

    public boolean rejectRequest(int requestFormNumber){
        return true;
    }

    public void updateAvailability(String newAvailability){
        System.out.println("new availability details");
    }

    public void appointmentDetails(int requestFormNumber){
        System.out.println("appointment details");
    }

}
