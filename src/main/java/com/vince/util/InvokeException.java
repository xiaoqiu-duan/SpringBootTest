package com.vince.util;

/**
 * Package: com.vince.util
 * User: 诸葛子房
 * Email: xiaoiqu2017wy@163.com
 * Date: 2019/3/21
 * Time: 14:25
 * Description:
 */
public class InvokeException extends Exception {
    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public InvokeException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public InvokeException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    public InvokeException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }


}
