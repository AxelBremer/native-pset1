package axelbremer.axelbremer_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void boxClick(View view) {
        View part;
        switch(view.getId()){
            case R.id.glassesBox:
                View glasses = findViewById(R.id.glasses);
                changeVisibility(glasses);
                break;
            case R.id.mouthBox:
                part = findViewById(R.id.mouth);
                changeVisibility(part);
                break;
            case R.id.eyesBox:
                part = findViewById(R.id.eyes);
                changeVisibility(part);
                break;
            case R.id.shoesBox:
                part = findViewById(R.id.shoes);
                changeVisibility(part);
                break;
            case R.id.eyebrowsBox:
                part = findViewById(R.id.eyebrows);
                changeVisibility(part);
                break;
            case R.id.hatBox:
                part = findViewById(R.id.hat);
                changeVisibility(part);
                break;
            case R.id.earsBox:
                part = findViewById(R.id.ears);
                changeVisibility(part);
                break;
            case R.id.noseBox:
                part = findViewById(R.id.nose);
                changeVisibility(part);
                break;
            case R.id.armsBox:
                part = findViewById(R.id.arms);
                changeVisibility(part);
                break;
            case R.id.moustacheBox:
                part = findViewById(R.id.moustache);
                changeVisibility(part);
                break;
        }
    }

    private void changeVisibility(View view) {
        if (view.getVisibility() == View.VISIBLE) {
            view.setVisibility(View.INVISIBLE);
        } else {
            view.setVisibility(View.VISIBLE);
        }
    }
}
