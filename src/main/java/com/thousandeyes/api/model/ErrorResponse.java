package com.thousandeyes.api.model;

/**
 * Created by Roberto on 31/07/2015.
 */
public class ErrorResponse extends Response{

    public static final String UNAUTHORIZED = "You have no authorization to make the request. " +
            "Make sure your API token is correct.";
    public static final String BAD_REQ_SAME_IDS = "The ids provided cannot be the same.";


    public ErrorResponse(int errorCode, String message) {
        super(errorCode, message);
    }
}
