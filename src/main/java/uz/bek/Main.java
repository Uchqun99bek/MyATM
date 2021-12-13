package uz.bek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://kun.uz/news/2021/12/13/kentukkidagi-tornado-hujumi-fotolar");
            URLConnection urlConnection= url.openConnection();
            BufferedReader reader=
                    new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            URL url1=new URL("https://kun.uz/news/2021/12/13");
            URLConnection urlConnection=url1.openConnection();
            BufferedReader reader=
                    new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;

            while ((line= reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("hshshksahk\s");

    }
}
