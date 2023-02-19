package CODES.LINKED_LIST.StriversLL;

public class LRUCache {
    public static void main(String[] args) {
        DLL_LRU lruCache = new DLL_LRU(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1));
        lruCache.put(3, 3);
        System.out.println(lruCache.get(2));
        lruCache.put(4, 4);
        lruCache.get(1);
        lruCache.get(3);
        lruCache.get(4);
    }
}
