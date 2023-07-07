import java.io.*;
import java.io.PrintWriter;

public class Test
{
public static void main(String[] args) throws Exception
{
Boolean isAvailable=false;


PrintWriter pw=new PrintWriter("file.txt");
BufferedReader br = new BufferedReader(new FileReader("mef.txt"));
String line=br.readLine();

BufferedReader br1 = new BufferedReader(new FileReader("pqr.txt"));

String lin=br1.readLine();
while(line!=null || lin!=null)
{
if(line.equals(lin))
{
isAvailable=true;
break;
}
lin=br1.readLine();
if(isAvailable=false)
{
pw.println(line);
lin=br1.readLine();
}
}


pw.flush();

br.close();
br1.close();
pw.close();


}


}