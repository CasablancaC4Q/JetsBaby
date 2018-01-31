package comli.example.c4q.jets.retrofitmodel;

import java.util.ArrayList;

/**
 * Created by c4q on 1/28/18.
 */

public class NewsModel {
    private String copyright,url ;
    private ArrayList<Docs> results;

    public String getCopyright() {
        return copyright;
    }

    public ArrayList<Docs> getResults() {
        return results;
    }

    public String getUrl() {
        return url;
    }
}
