import java.net.*;
import java.io.*;
public class ServerCon {
    public static void main(String args[]){
        try{
            ServerSocket ss=new ServerSocket(3333);
            Socket s=ss.accept();
            DataInputStream dIn=new DataInputStream(s.getInputStream());
            DataOutputStream dOut=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str="",str2="";
            while(str!="quit"){
                str=dIn.readUTF();
                System.out.println("Client says: "+str);
                str2=br.readLine();
                dOut.writeUTF(str2);
                dOut.flush();
            }
            dIn.close();
            s.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        } 
        
    }
}
