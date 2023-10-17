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

    public boolean acceptRequest(int requestFormNumber){
        return false;
    }

    public boolean rejectRequest(int requestFormNumber){
        return false;
    }

    public void updateAvailability(String newAvailability){

    }

    public void appointmentDetails(int requestFormNumber){

    }

    public String toString(){
        return "hello world";
    }
}
