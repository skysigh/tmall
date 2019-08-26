package entity;

import java.io.Serializable;

public class HttpResult implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean success;
    private String msg;

    public HttpResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
