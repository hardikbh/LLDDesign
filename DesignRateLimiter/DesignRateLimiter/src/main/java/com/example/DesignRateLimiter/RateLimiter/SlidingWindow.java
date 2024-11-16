package com.example.DesignRateLimiter.RateLimiter;
public class SlidingWindow implements RateLimiter{

    @Override
    public boolean allowRequest(String clientId) {
        return false;
    }
}