/* Write a java program that reads a file and displays the  file and displays the  file on the screen, with a line number before each line.*/

import java.io.*;
class FileDemo1
{
public static void main(String args[]) throws IOException
{
int i;
BufferedReader br1=new BufferedReader(new      
        InputStreamReader(System.in));
String src=new String();
FileWriter fo=new FileWriter("file1.txt");
FileReader fr=new FileReader("file1.txt");
BufferedReader br=new BufferedReader(fr);
String s;
System.out.println("Enter the text (to stop entering enter -111)");
do
{
src=br1.readLine();
char buffer[]=new char[src.length()];
src.getChars(0,src.length(),buffer,0);
for(i=0;i<buffer.length;i++)
fo.write(buffer[i]);
fo.write('\n');
}while(!src.equals("end"));
fo.close();
i=1;
System.out.println("Content from the file");
while((s=br.readLine())!=null)
System.out.println(i+++"."+s);
fr.close();
}
}
/*
Output:

Enter the text (to stop entering enter end)
srtist
cse
ece
eie
mech
csit
end
Content from the file
1.srtist
2.cse
3.ece
4.eie
5.mech
6.csit
7.end
*/
