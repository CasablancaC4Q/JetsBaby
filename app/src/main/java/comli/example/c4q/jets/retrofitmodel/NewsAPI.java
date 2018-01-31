package comli.example.c4q.jets.retrofitmodel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by c4q on 1/28/18.
 */

public interface NewsAPI {

//    @GET("1.json  ?api-key=    b6075f230e154c32accba228515bdce5")
    @GET("home.json?api-key=b6075f230e154c32accba228515bdce5")
    Call<NewsModel>getNewsModel();


    //Dynamic method
    //use if you would like user to alter the information returned from api call
    //
//    @GET("{section}.{format}")
//    Call<NewsModel>test(@Path("section") String s, @Path("format") String f);


}
