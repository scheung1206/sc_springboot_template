package com.stephencheung.project.result;

public class Result<T> extends AbstractResult {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
