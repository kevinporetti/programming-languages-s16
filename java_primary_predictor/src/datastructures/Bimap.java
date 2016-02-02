/**
 * Created by Kevin Poretti on 1/31/2016.
 */
package datastructures;

import java.util.HashMap;
import java.util.Map;

public class Bimap<K, V>
{
    public Map<K, V> forward;
    public Map<V, K> backward;

    public Bimap()
    {
        this.forward    = new HashMap<K, V>();
        this.backward   = new HashMap<V, K>();
    }

    public void put(K key, V value)
    {
        this.forward.put(key, value);
        this.backward.put(value, key);
    }
}
