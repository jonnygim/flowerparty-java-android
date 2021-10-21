package com.example.flowerparty;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class MyPlantsRequest extends StringRequest {
    // Setting Sever URL ( php )
    final static private String URL = "http://ci2021flower.dongyangmirae.kr/MyPlants.php";
    private Map<String, String> map;

    public MyPlantsRequest(String userID, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID", userID);
    }

    @Nullable
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
