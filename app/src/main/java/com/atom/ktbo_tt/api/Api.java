package com.atom.ktbo_tt.api;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Api {

    // HTTP Client
    private static OkHttpClient client = new OkHttpClient();

    // URL
    private static final String URL = "http://ictis.sfedu.ru/rasp/HTML/7.htm";

    private static Request createOkHttpRequest() {
        Request request = new Request.Builder()
                .url("http://ictis.sfedu.ru/rasp/HTML/7.htm")
                .build();
        return request;
    }

    public static void executeRequest(Callback callback) {
        Request request = createOkHttpRequest();
        client.newCall(request).enqueue(callback);
    }

    /*


    new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                // TODO: Handler error
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
                System.out.println(response.body().string());
            }
        }
    *
    *
    * */

}
