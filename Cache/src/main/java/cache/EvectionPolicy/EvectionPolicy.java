package cache.EvectionPolicy;

public interface EvectionPolicy<Key> {
      void keyAccessed(Key key);

      Key evictKey();

}
