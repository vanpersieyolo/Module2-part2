package Singleton;

public class Connection {
   private static Connection _instance;
   public synchronized static Connection get_instance(){
      if (_instance == null){
         _instance = new Connection();
      }
      return _instance;
   }

}
