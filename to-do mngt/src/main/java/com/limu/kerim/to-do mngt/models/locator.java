package com.limu.kerim.IssDemo.models;

public class IssLocator {
    //{"timestamp": 1589035753, "message": "success", "iss_position": {"latitude": "-26.7182", "longitude": "-67.3130"}}
    private long timestamp;
    private String message;
    private IssPosition iss_position;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public IssPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(IssPosition iss_position) {
        this.iss_position = iss_position;
    }

    @Override
    public String toString() {
        return "IssLocator{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", iss_position=" + iss_position +
                '}';
    }
}
