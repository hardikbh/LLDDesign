package cache.EvectionPolicy;

import cache.algorithm.Doublylinkedlist;
import cache.algorithm.Node;

import java.util.HashMap;
import java.util.Map;

public class LRUEvectionPolicy<Key> implements EvectionPolicy<Key>{


    Doublylinkedlist<Key> dll;

    Map<Key,Node<Key>> mapper;

    public LRUEvectionPolicy() {
        this.dll = new Doublylinkedlist<>();
        this.mapper = new HashMap<>();
    }

    @Override
    public void keyAccessed(Key key) {
        if(mapper.containsKey(key))
        {
            Node<Key> node = mapper.get(key);
            dll.detachNode(node);
            dll.addNodeAtLast(node);
        }
        else {
            Node<Key> node = dll.addElementatLast(key);
            mapper.put(key, node);
        }

    }

    @Override
    public Key evictKey() {
       Node<Key> node = dll.getFirstNode();
       dll.detachNode(node);
       mapper.remove(node.getValue());
       return node.getValue();
    }


}
