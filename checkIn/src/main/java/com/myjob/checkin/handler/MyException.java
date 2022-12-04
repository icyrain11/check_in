package com.myjob.checkin.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author icyrain11
 * @version 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyException extends RuntimeException {
    //状态码
    private Integer code;

    //消息
    private String msg;
}
