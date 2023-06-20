package com.project.Wastelessharvest.Response;



public class LoginResponse {

    String message;
    boolean status;
    int cutomerid;

    public LoginResponse(String message, boolean status ,int cutomerid ) {
        this.message = message;
        this.status = status;
        this.cutomerid=cutomerid;
    }

    public LoginResponse() {
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCustomerId(){
        return cutomerid;
    }

    public void setCutomerid(int cutomerid) {
        this.cutomerid = cutomerid;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", cutomerid=" + cutomerid +
                '}';
    }

}

