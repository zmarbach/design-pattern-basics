package designpatterns.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public class CacheSingleton {
    //could EAGERLY create instance with = new CacheSingleton() and simply return INSTANCE in getInstance()...no need for null check
    //this would guarantee thread safety rather than using "synchronized", but may not be best if its expensive to create instance of this class
    private static CacheSingleton INSTANCE;
    private List<String> cacheData;


    //private constructor ensures that ONLY THIS CLASS can create instance
    private CacheSingleton(){
        cacheData = new ArrayList<>();
    }

    //STATIC means this is class method so must call CacheSingleton.getInstance()
    //use synchronized for thread safety - otherwise one thread might stop before completing and second thread could create new instance...then its not Singleton
    //BUT synchronized can cause performance hit, there are other options (EAGER instantiation OR use volatile keyword on class level instance variable)
    public static synchronized CacheSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new CacheSingleton();
        }
        return INSTANCE;
    }

    public void addDataToCache(String data){
        cacheData.add(data);
    }

    public List<String> getCacheData() {
        return cacheData;
    }
}
