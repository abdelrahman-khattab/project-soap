package com.restsoap.api.exceptions.types;

import jakarta.xml.ws.WebFault;

@WebFault
public class WSNotFoundEx extends Exception {
    public WSNotFoundEx(String message) {
        super(message);

    }
}
