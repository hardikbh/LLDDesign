package com.example.DesignRateLimiter.factory;

import com.example.DesignRateLimiter.RateLimiter.FixedWindow;
import com.example.DesignRateLimiter.RateLimiter.RateLimiter;

import java.util.HashMap;

public class RateLimiterFactory {
    public static RateLimiter getInstanceOf(String ratelimitertype)
    {
        switch(ratelimitertype)
        {
            case "fixed":
                return new FixedWindow(10,60,new HashMap<>(),new HashMap<>());
                break;
            case "sliding":
                return new SlidingWindow(10,60,new HashMap<>(),new HashMap<>());
            break;
        }
    }
}


