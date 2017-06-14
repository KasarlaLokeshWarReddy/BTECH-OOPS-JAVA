/* Write a java program that reads file name from the user then displays information about whether the file exists, whether the file is readable, whether the file is writable, the type of the file and length of the file in bytes.*/
import java.io.File;
class FileDemo
{
	static void p(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		File f1=new File("/java/COPYRIGHT");
		p("File Name:"+f1.getName());
		p("Path:"+f1.getPath());
		p("Abs path:"+f1.getAbsolutePath());
		p("Parent:"+f1.getParent());
		p(f1.exists()?"exists":"does not exist");
		p(f1.canWrite()?"is writeable":"is not writeable");
		p(f1.canRead()?"is readable":"is not readable");
		p("is"+(f1.isDirectory()?" ":"not"+"a directory"));
		p(f1.isFile()?"is normal file":"might be a named pipe");
		p(f1.isAbsolute()?"is absolute":"is not absoluted");
		p("File last modified:"+f1.lastModified());
		p("File size:"+f1.length()+"Bytes");
	}
}
/*

Output: 
File Name:COPYRIGHT
Path:\java\COPYRIGHT
Abs path:C:\java\COPYRIGHT
Parent:\java
does not exist
is not writeable
is not readable
isnota directory
might be a named pipe
is not absoluted
File last modified:0
File size:0Bytes
*/