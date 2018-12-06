import java.util.*;

public class QuadraticHashtable<T> {
  protected int capacity = 0;
  private int jump = 1;
  private List<String> keys = null;
  private List<T> values = null;

  private int probeCount = 0;

  public int getProbeCount() {
    return this.probeCount;
  }

  public void resetProbeCount() {
    this.probeCount = 0;
  }

  public QuadraticHashtable(int capacity) {
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
  //  int num = (previousHash % capacity)

    probeCount++;
    return (previousHash * previousHash) % capacity;
  }

  public void insert(String key, T value) {
    int pos = hash(key);
    while (keys.get(pos) != null){
        pos = rehash(pos);

        jump++;
    }
    jump = 1;
    keys.set(pos, key);
    values.set(pos, value);

  }
}
