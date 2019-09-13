package com.renzo.onlinestore.result;

public enum CodeMsg {

    // -100 - -200 for general information
    SUCCESS(100100, "SUCCESS"),
    ERROR(200100, "SERVER ERROR");


    private int code;
    private String msg;
    CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
