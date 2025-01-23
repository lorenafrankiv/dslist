package com.devsuperior.dslist.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardException implements Serializable {

    private Instant timestamp;
    private String message;
    private String path;

    public StandardException() {
    }

    public StandardException(Instant timestamp, String message, String path) {
        this.timestamp = timestamp;
        this.message = message;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
