package cn.wenqi.model;

/**
 * @author wenqi
 */
public class ResponseModel {

    private int respCode;

    private Object respData;

    public ResponseModel(int respCode, Object respData) {
        this.respCode = respCode;
        this.respData = respData;
    }

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public Object getRespData() {
        return respData;
    }

    public void setRespData(Object respData) {
        this.respData = respData;
    }
}
