package com.stephencheung.project.result;

public class AbstractResult {
    private ResultCode resultCode;
    private ResultReason resultReason;

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public ResultReason getResultReason() {
        return resultReason;
    }

    public void setResultReason(ResultReason resultReason) {
        this.resultReason = resultReason;
    }
}
