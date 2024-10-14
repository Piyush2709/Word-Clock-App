package com.example.wordclock;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private EditText cityInput;
    private Button getTimeButton;
    private TextView timeResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityInput = findViewById(R.id.cityInput);
        getTimeButton = findViewById(R.id.getTimeButton);
        timeResult = findViewById(R.id.timeResult);

        getTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getCurrentTime(cityInput.getText().toString());
            }
        });
    }

    private void getCurrentTime(String city) {
        String timezone = TimezoneMapper.getTimezone(city);
        if (timezone == null) {
            timeResult.setText("Invalid city or timezone.");
            return;
        }

        String url = "https://worldtimeapi.org/api/timezone/" + timezone;

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("API Response", response.toString());
                        try {
                            String dateTime = response.getString("datetime");

                            // Extract the date and time separately from the datetime string
                            String date = dateTime.split("T")[0];  // Extract date (before "T")
                            String timeWithOffset = dateTime.split("T")[1]; // Extract time with timezone info

                            // Further clean the time by removing the milliseconds and timezone offset if needed
                            String time = timeWithOffset.split("\\.")[0]; // Extract time up to seconds

                            // Format and display the result with a line break between the time and date
                            timeResult.setText("Current Time: " + time + "\nDate: " + date);

                        } catch (JSONException e) {
                            e.printStackTrace();
                            timeResult.setText("Error: Unable to fetch time - " + e.getMessage());
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("API Error", error.toString());
                if (error.networkResponse != null) {
                    timeResult.setText("Error Code: " + error.networkResponse.statusCode);
                    Log.e("Network Response", "Status Code: " + error.networkResponse.statusCode);
                    Log.e("Network Response Body", new String(error.networkResponse.data));
                } else {
                    timeResult.setText("Error: " + error.getMessage());
                }
            }
        });

        Volley.newRequestQueue(this).add(jsonObjectRequest);
    }
}