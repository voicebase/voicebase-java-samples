package com.voicebase.sample.v3client.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HttpContext;

public class BearerAuthScheme implements ContextAwareAuthScheme {

    private boolean complete = false;

    @Override
    public void processChallenge(Header header) throws MalformedChallengeException {
        this.complete = true;
    }

    @Override
    public Header authenticate(Credentials credentials, HttpRequest request) throws AuthenticationException {
        return authenticate(credentials, request, null);
    }

    @Override
    public Header authenticate(Credentials credentials, HttpRequest request, HttpContext httpContext)
            throws AuthenticationException {
        final String token = credentials.getUserPrincipal().getName();
        return new BasicHeader("Authorization", "Bearer " + credentials.getUserPrincipal().getName());

    }

    @Override
    public String getSchemeName() {
        return "Bearer";
    }

    @Override
    public String getParameter(String name) {
        return null;
    }

    @Override
    public String getRealm() {
        return null;
    }

    @Override
    public boolean isConnectionBased() {
        return false;
    }

    @Override
    public boolean isComplete() {
        return this.complete;
    }
}