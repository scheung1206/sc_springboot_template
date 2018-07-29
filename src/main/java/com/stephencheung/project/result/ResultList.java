package com.stephencheung.project.result;

import java.util.List;

public class ResultList<T> extends AbstractResult{

    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
