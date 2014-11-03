//The original code without any commit ,is copied from http://stackoverflow.com/questions/238547/how-do-you-programmatically-download-a-webpage-in-java
//This is my contribution
//This code is written in java
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.io.InputStream;
import java.net.MalformedURLException;

public class Exersice {
public static void main(String[] args) {
    URL url;
    InputStream is = null;
    BufferedReader br;
    String line;

    try {
        Scanner in=new Scanner(System.in);
        System.out.printf("Type the name of the site");
        //example "http://stackoverflow.com/"
        String a=in.nextLine();
        
        url = new URL(a);
        is = url.openStream();  // throws an IOException here
        br = new BufferedReader(new InputStreamReader(is));

        while ((line = br.readLine()) != null) {
            System.out.printf(line);
        }
    } catch (MalformedURLException mue) {
         mue.printStackTrace();
    } catch (IOException ioe) {
         ioe.printStackTrace();
    } finally {
        try {
            if (is != null) is.close();
        } catch (IOException ioe) {
            // nothing to see here
        }
    }
}
}
