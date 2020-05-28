package com.rockbass.rickandmortyapp.Location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.rockbass.rickandmortyapp.R;
import com.rockbass.rickandmortyapp.RetrofitGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LocationActivity extends AppCompatActivity {

    private final static String TAG = "LocationActivity";
    private String url;
    TextView textViewName, textViewType, textViewDimension,textViewUrl, textViewCreated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        textViewName = this.findViewById(R.id.textView_name_location);
        textViewType = this.findViewById(R.id.textview_type_location);
        textViewDimension = this.findViewById(R.id.textview_dimension);
        textViewUrl = this.findViewById(R.id.textview_url);
        textViewCreated = this.findViewById(R.id.textview_created);

        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            url = bundle.getString("url");
            personajeLocation(url);
            }
        }

    private void personajeLocation(String url) {

        RetrofitGenerator.getLocationService().getLocationUrl(url).enqueue(new Callback<ResultLocation>() {
            @Override
            public void onResponse(Call<ResultLocation> call, Response<ResultLocation> response) {
                if(response.isSuccessful()){
                    if(response.body()!= null){
                        textViewName.setText(response.body().name);
                        textViewType.setText(response.body().type);
                        textViewDimension.setText(response.body().dimension);
                        textViewUrl.setText(response.body().url);
                        textViewCreated.setText(response.body().created);
                    }
                }
            }

            @Override
            public void onFailure(Call<ResultLocation> call, Throwable t) {
                Log.e(TAG, t.getMessage(), t);
            }
        });
    }

}
