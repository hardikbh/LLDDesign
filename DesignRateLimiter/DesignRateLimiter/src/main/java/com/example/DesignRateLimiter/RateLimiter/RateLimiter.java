package com.example.DesignRateLimiter.RateLimiter;

public interface RateLimiter {
    boolean allowRequest(String clientId);
}
