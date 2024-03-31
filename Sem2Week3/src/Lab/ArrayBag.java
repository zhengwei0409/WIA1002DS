
package Lab;

/**
 *
 * @author zhengwei
 */
public class ArrayBag<T> implements BagInterface<T> {
    
    private T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    // Constructor
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }
    public ArrayBag(int size) {
        this.bag = (T[]) new Object[size];
        numberOfEntries = 0;
    }
    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return this.getCurrentSize() == bag.length;
    }

    @Override
    public boolean isEmpty() {
        return this.getCurrentSize() == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if(!this.isFull()) {
            bag[this.getCurrentSize()] = newEntry;
            numberOfEntries++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T remove() {
        if(!this.isEmpty()) {
            T temp = bag[this.getCurrentSize()-1];
            bag[this.getCurrentSize()-1] = null;
            numberOfEntries--;
            return temp;
            
        } else {
            return null;
        }
    }

    @Override
    public boolean remove(T anEntry) {
        if(!this.isEmpty()) {
            for(int i = 0; i < this.getCurrentSize(); i++) {
                if(bag[i] == anEntry) {
                    bag[i] = null;
                    for(int j = i; j < this.getCurrentSize() - 1; j++) {
                        bag[j] = bag[j+1]; 
                        bag[j+1] = null;
                    }
                    numberOfEntries--;
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void clear() {
        bag = (T[]) new Object[DEFAULT_CAPACITY];
        numberOfEntries = 0; 
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int freq = 0;
        for(int i = 0; i < this.getCurrentSize(); i++) {
            if(bag[i] == anEntry) {
                freq++;
            }
        }
        return freq;
    }

    @Override
    public boolean contains(T anEntry) {
        for(int i = 0; i < this.getCurrentSize(); i++) {
            if(bag[i].equals(anEntry)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[this.getCurrentSize()];
        
        for(int i = 0; i < this.getCurrentSize(); i++) {
            result[i] = bag[i];
        }
        
        return result;
    }
    
    @Override
    public BagInterface<T> union(BagInterface<T> bag) {
        ArrayBag<T> result = new ArrayBag<>(this.getCurrentSize() + bag.getCurrentSize());
        
        for(int i = 0; i < this.getCurrentSize(); i++) {
            result.add(this.bag[i]);
        }
        
        T[] bag2 = bag.toArray();
        
        for(int i = 0; i < bag2.length; i++) {
            result.add(bag2[i]);
        }
        
        return result;
    }
    
    @Override
    public BagInterface<T> intersect(BagInterface<T> bag) {
        ArrayBag<T> result = new ArrayBag<>();
        
        T[] bag1 = this.toArray();

        
        for(int i = 0; i < this.getCurrentSize(); i++) {
            if(!result.contains(bag1[i])) {
                int cnt = Math.min(this.getFrequencyOf(bag1[i]), bag.getFrequencyOf(bag1[i]));
                
                for(int j = 0; j < cnt; j++) {
                    result.add(bag1[i]);
                }
                
                
            }
        }
        
        return result;
    }
    
    
    @Override
    public BagInterface<T> difference(BagInterface<T> bag) {
        ArrayBag<T> result = new ArrayBag<>();
        
        for(T element : this.toArray()) {
            
            if(!result.contains(element)) {
                int different = this.getFrequencyOf(element) - bag.getFrequencyOf(element);
            
                for(int j = 0; j < different; j++) {
                    result.add(element);
                }
            }

        }
        
        return result;
        
    }
    
}
