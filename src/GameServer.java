import java.io.*; 
import java.text.*; 
import java.util.*; 
import java.net.*;

// Main class
public class GameServer{
 
    // Main driver method
    public static void main(String[] args)
    { 
        // server is listening on port 5056 
        ServerSocket ss;
        try{
        ss = new ServerSocket(5056); 
          
        // running infinite loop for getting 
        // client request 
        while (true)  
        { 
            Socket s = null; 
              
                // socket object to receive incoming client requests 
                s = ss.accept(); 
                  
                System.out.println("A new client is connected : " + s); 
                  
                // obtaining input and out streams 
                DataInputStream dis = new DataInputStream(s.getInputStream()); 
                DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
                  
                System.out.println("Assigning new thread for this client"); 
  
                // create a new thread object 
                Thread t = new GameClientHandler(s, dis, dos); 
  
                // Invoking the start() method 
                t.start(); 
                  
        }

        }
        catch (Exception e){

                e.printStackTrace(); 
            }

    }
}
