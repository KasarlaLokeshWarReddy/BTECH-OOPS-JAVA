import java.io.*;
import java.net.*;
class Server{
public static void main(String args[])throws Exception
{
ServerSocket ss=new ServerSocket(777);
Socket s=ss.accept();
System.out.println("connection established...");
PrintStream ps=new PrintStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
String str,str1;
double area,a1;
while((str=br.readLine())!=null)
{
System.out.println(str);
a1=Integer.parseInt(str);
area=a1*a1*3.14;
ps.println(""+area);
}
ps.close();
br.close();
kb.close();
ss.close();
s.close();
System.exit(0);
}
}
}
