package JavaCore_HW1.lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class WeatherRequest {

            public static void main(String[] args) throws IOException {


            final String PROTOKOL = "http";
            final String BASE_HOST = "dataservice.accuweather.com";
            final String FORECASTS = "forecasts";
            final String VERSION = "v1";
            final String DAILY = "daily";
            final String DAYS = "5day";
            final String CITY_CODE = "198217";
            final String API_KEY_QUERY_PARAM = "apikey";
            final String API_KEY = "zKdf3zbAGyJArabeObUwYHNTdxAOLbI9";


            final OkHttpClient okHttpClient = new OkHttpClient();


            HttpUrl httpUrl = new HttpUrl.Builder()
                    .scheme(PROTOKOL)
                    .host(BASE_HOST)
                    .addPathSegment(FORECASTS)
                    .addPathSegment(VERSION)
                    .addPathSegment(DAILY)
                    .addPathSegment(DAYS)
                    .addPathSegment(CITY_CODE)
                    .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                    .build();

            Request request = new Request.Builder()
                    .url(httpUrl)
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            System.out.println(response.body().string());
        }
    }
