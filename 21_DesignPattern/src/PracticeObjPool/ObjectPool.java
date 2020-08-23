//package PracticeObjPool;
//
//import javax.management.ObjectName;
//import java.util.Enumeration;
//import java.util.Hashtable;
//
//public abstract class ObjectPool<T> {
//    private long expirationTime;
//    private Hashtable<T,Long> locked, unlocked;
//
//    public ObjectPool(){
//        expirationTime = 3000;
//        locked = new Hashtable<T, Long>();
//        unlocked = new Hashtable<T, Long>();
//    }
//    protected abstract T create();
//    public  abstract  boolean validate(T o);
//    public synchronized T checkOut(){
//        long now = System.currentTimeMillis();
//        T t;
//        if (unlocked.size()>0){
//            Enumeration<T> e = unlocked.keys();
//            while (e.hasMoreElements()){
//                t = e.nextElement();
//                if ((now - unlocked.get(t)) > expirationTime){
//                    unlocked.remove(t);
//                    expa
//                }
//            }
//        }
//    }
//}
