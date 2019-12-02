package com.bawei.rerlian.net;

import android.webkit.JavascriptInterface;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bawei.rerlian.app.MyApp;

/**
 * @auther:董青勇
 * @Date: 2019/12/2
 * @Time: 8:49
 * @Description:
 */
public class NetVolley  {
    private NetVolley() {
    }
    private  static  class  Single{
        private  static  NetVolley netVolley=new NetVolley();
    }

    public static NetVolley getInstance() {
        return Single.netVolley;
    }
    RequestQueue requestQueue= Volley.newRequestQueue(MyApp.context);

    public  interface  MyCalllBack{
        void  onSuccess(String json);
        void  onErrorSuccess(String error);
    }
    public  void doGet(String temUrl, final MyCalllBack myCalllBack){
        StringRequest stringRequest = new StringRequest(temUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                myCalllBack.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                 myCalllBack.onErrorSuccess(error.getMessage());
            }
        });
    }




}
