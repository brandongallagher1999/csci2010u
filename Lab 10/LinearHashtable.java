import java.util.*;

public class LinearHashtable<T> {
  protected int capacity = 0;
  private List<String> keys = null;
  private List<T> values = null;

  private int probeCount = 0;

  public int getProbeCount() {
    return this.probeCount;
  }

  public void resetProbeCount() {
    this.probeCount = 0;
  }

  public LinearHashtable(int capacity) {
    this.keys = new ArrayList<String>();
    for (int i = 0; i < capacity; i++) {
      this.keys.add(null);
    }
    this.values = new ArrayList<T>();
    for (int i = 0; i < capacity; i++) {
      this.values.add(null);
    }
    this.capacity = capacity;
  }

  public int hash(String key) {
    int sum = 0;
    for (int i = 0; i < key.length(); i++) {
      sum += (int)key.charAt(i);
    }
    return sum % capacity;
  }

  public int rehash(int previousHash){

    //probeCount++;
    return (previousHash + 1) % capacity;
  }

  public void insert(String key, T value) {
    // determine the hash
    // TODO
    int pos = hash(key);
    while (keys.get(pos) != null){
      probeCount++;
        pos = rehash(pos);
    }
    keys.set(pos, key);
    values.set(pos, value);

  }
}
