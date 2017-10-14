package com.voicebase.sample.v3client.auth;

// From https://stackoverflow.com/questions/20146557/how-to-access-bearer-authenticated-service-from-android

import java.security.Principal;

import org.apache.http.auth.BasicUserPrincipal;
import org.apache.http.auth.Credentials;

public class BearerTokenCredentials implements Credentials {
    private Principal userPrincipal;

    public BearerTokenCredentials(String token) {
        this.userPrincipal = new BasicUserPrincipal(token);
    }

    @Override
    public Principal getUserPrincipal() {
        return userPrincipal;
    }

    @Override
    public String getPassword() {
        return null;
    }

}