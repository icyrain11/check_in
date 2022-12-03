package com.myjob.checkin.util;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.loadtime.Aj;

import java.io.Serializable;

/**
 * @author icyrain11
 * @version 1.8
 */
@Data
public class AjaxJson<T> implements Serializable {

    private static final long serialVersionUID = 1L;    // 序列化版本号

    public static final int CODE_SUCCESS = 200;            // 成功状态码
    public static final int CODE_ERROR = 500;            // 错误状态码
    public static final int CODE_WARNING = 501;            // 警告状态码
    public static final int CODE_NOT_JUR = 403;            // 无权限状态码
    public static final int CODE_NOT_LOGIN = 401;        // 未登录状态码
    public static final int CODE_INVALID_REQUEST = 400;    // 无效请求状态码
    public static final int REQUIRED_PASSWORD = 405;       // 未输入密码
    public static final int INVALID_PASSWORD = 406;        // 无效的密码


    @ApiModelProperty(value = "业务状态码，0 为正常，其他值均为异常，异常情况下见响应消息", example = "0")
    private int code;

    @ApiModelProperty(value = "响应消息", example = "ok")
    private String msg;

    @ApiModelProperty(value = "响应数据")
    private T data;


    // ============================  构建  ==================================


    public AjaxJson() {
    }


    public AjaxJson(int code, String msg) {
        this.msg = msg;
        this.data = data;
    }

    public AjaxJson(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //返回成功
    public static <T> AjaxJson getSuccess() {
        return new AjaxJson(CODE_SUCCESS, "ok", null);
    }

    public static <T> AjaxJson getSuccess(T data) {
        return new AjaxJson(CODE_SUCCESS, "ok", data);
    }

    //返回失败
    public static <T> AjaxJson getFailure() {
        return new AjaxJson(CODE_ERROR, "failure", null);
    }

    public static <T> AjaxJson getFailure(int code, String msg) {
        return new AjaxJson(code, msg);
    }


}
