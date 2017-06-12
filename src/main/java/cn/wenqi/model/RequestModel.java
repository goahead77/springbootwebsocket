package cn.wenqi.model;

/**
 * @author wenqi
 */
public class RequestModel {

    public RequestModel() {

    }

    private String message;

    private String uid;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "RequestModel{" +
                "message='" + message + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}
