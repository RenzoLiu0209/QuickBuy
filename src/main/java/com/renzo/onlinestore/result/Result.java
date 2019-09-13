package com.renzo.onlinestore.result;

public class Result<T> {
    int code;
    String msg;
    T data;

    public static <T> Result<T> success(T data) {
        return new Result(CodeMsg.SUCCESS, data);
    }

    public static <T> Result<T> error(CodeMsg cm) {
        return new Result<>(cm);
    }

    private Result(CodeMsg cm, T data) {
        this.code = cm.getCode();
        this.msg = cm.getMsg();
        this.data = data;
    }

    private Result(CodeMsg cm) {
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
