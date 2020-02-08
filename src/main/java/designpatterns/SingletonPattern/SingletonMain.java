package designpatterns.SingletonPattern;

import designpatterns.ParentMain;

public class SingletonMain extends ParentMain {
    public SingletonMain(String patternName) {
        super(patternName);
    }

    @Override
    public void execute() {
    //ONE and ONLY ONE instance of a class and entire app has global access to it
    //great for classes that you need to remain consistent (counting site viewers, cache history, etc)
        System.out.println("-------- SINGLETON ----------");
        //create first instance
        System.out.println("creating singleton");
        CacheSingleton cacheSingleton1 = CacheSingleton.getInstance();
        //add data
        System.out.println("adding red and blue...");
        cacheSingleton1.addDataToCache("red");
        cacheSingleton1.addDataToCache("blue");

        //get instance
        System.out.println("getting another instance of singleton...except it is the same instance really");
        CacheSingleton cacheSingleton2 = CacheSingleton.getInstance();
        //add data
        System.out.println("adding green and yellow to this \"new\" singleton instance");
        cacheSingleton2.addDataToCache("green");
        cacheSingleton2.addDataToCache("yellow");

        //both of these should be the same because pointing to same instance
        System.out.println("Version 1 data: " + cacheSingleton1.getCacheData());
        System.out.println("Version 2 data: " + cacheSingleton2.getCacheData());

        System.out.println("Can see that the data is the same in either \"version\" of the singleton instance");
    }
}
