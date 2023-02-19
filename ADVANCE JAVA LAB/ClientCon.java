import java.net.*;
import java.io.*;
public class ClientCon {
    public static void main(String args[]){
        try{
            Socket s=new Socket("localhost",3333);
            DataInputStream dIn=new DataInputStream(s.getInputStream());
            DataOutputStream dOut=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str=" ";
            String str2=" ";
            while(!str.equals("quit")){
                str=br.readLine();
                dOut.writeUTF(str);
                dOut.flush();
                str2=dIn.readUTF();
                System.out.println("Server says: "+str2);
            }
            dOut.close();
            s.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
