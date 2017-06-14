/*Write a Java program that implements a simple client/server application. The client sends data to a server. The server receives the data, uses it to produce a result, and then sends the result back to the client. The client displays the result on the console.  For ex: The data sent from the client is the radius of a circle, and the result produced by the server is the area of the circle. (Use java.net)*/

import java.io.*;
import java.net.*;
class Client{
public static void main(String args[])throws Exception
{
Socket s=new Socket("localhost",777);
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
String str,str1;
while(!(str=kb.readLine()).equals("exit"))
{
dos.writeBytes(str+"\n");
str1=br.readLine();
System.out.println(str1);
}
s.close();
dos.close();
br.close();
kb.close();
}
}
