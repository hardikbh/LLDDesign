package cache.Storage;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasedStorage<Key,Value> implements Storage<Key,Value>{

    Map<Key,Value> map;
    final int capacity;
    public HashMapBasedStorage(int capacity) {
        this.map=new HashMap<>();
        this.capacity=capacity;
    }

    @Override
    public void add(Key key, Value value) {
       if(capacity>map.size())
       {
           System.out.println(" cannot add ");
       }
       else {
           map.put(key, value);
       }
    }

    @Override
    public Value get(Key key) {
        if(!map.containsKey(key))
        {
            return map.get(key);
        }
        else {
            System.out.println(" cannot have value for this key !!! ");
            return null;
        }
    }

    @Override
    public void remove(Key key) {
        if(map.containsKey(key))
        {
            map.remove(key);
        }


    }
}
