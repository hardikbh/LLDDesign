package cache;

import cache.EvectionPolicy.EvectionPolicy;
import cache.EvectionPolicy.LRUEvectionPolicy;
import cache.Storage.Storage;
import cache.algorithm.Node;

public class Cache<Key,Value> {

    private EvectionPolicy<Key> evectionPolicy;
    private Storage<Key,Value> storage;

    public Cache(EvectionPolicy evectionPolicy,Storage storage)
    {
        this.evectionPolicy=evectionPolicy;
        this.storage=storage;
    }
    public void addValue(Key key, Value value)
    {
       try {
           storage.add(key, value);
           evectionPolicy.keyAccessed(key);
       }
       catch (Exception ex)
       {
           Key KeyNeedToEvict = evectionPolicy.evictKey();
           storage.remove(KeyNeedToEvict);
           addValue(key,value);

       }

    }

    public Value getValue(Key key)
    {

        try {
           Value val = storage.get(key);
            evectionPolicy.keyAccessed(key);
            return val;
        }
        catch (Exception ex) {
             System.out.println(" No key is present ");
             return null;
        }

    }
}
