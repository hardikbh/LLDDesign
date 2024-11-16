package com.example.DesignRateLimiter.RateLimiter;

import java.util.Map;

public class FixedWindow implements RateLimiter{
    private final int requestCount;   // 5
    private final long windowTimeLimit;   // 60
    private Map<String,Integer> requests;  // client id , no of request
    private Map<String,Long> windowStartTime;// client id,

    public FixedWindow(int requestCount, long windowTimeLimit, Map<String, Integer> requests, Map<String, Long> windowStartTime) {
        this.requestCount = requestCount;
        this.windowTimeLimit = windowTimeLimit;
        this.requests = requests;
        this.windowStartTime = windowStartTime;
    }


    @Override
    public boolean allowRequest(String clientId) {
        long currentTime = System.currentTimeMillis();
        windowStartTime.putIfAbsent(clientId,currentTime);
        requests.putIfAbsent(clientId,0);
        if(currentTime-windowStartTime.get(clientId)>=windowTimeLimit)  // when client request more after windowtimelimit
        {
            windowStartTime.put(clientId,currentTime);
            requests.put(clientId,0);
        }
        int currentRequest = requests.get(clientId);
        if(currentRequest<=requestCount)
        {
            requests.put(clientId,currentRequest+1);
            return true;
        }
        return false;
    }
}
