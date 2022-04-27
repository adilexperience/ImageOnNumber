package com.mobile.muhammadadilmehmood_labassignment1;

import static com.mobile.muhammadadilmehmood_labassignment1.MainActivity.NUMBER_INTENT_KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity {
    static final int DEFAULT_VALUE = 0;
    private int _number_received = 0;
    private ImageView _ivDisplayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        _number_received = getIntent().getIntExtra(NUMBER_INTENT_KEY ,DEFAULT_VALUE);
        Toast.makeText(DisplayActivity.this, _number_received + "", Toast.LENGTH_SHORT).show();

        _ivDisplayImage = findViewById(R.id.iv_display_image);


        switch (_number_received) {
            case 1:
                _ivDisplayImage.setImageResource(R.drawable.one);
                break;
            case 2:
                _ivDisplayImage.setImageResource(R.drawable.two);
                break;
            case 3:
                _ivDisplayImage.setImageResource(R.drawable.three);
                break;
            case 4:
                _ivDisplayImage.setImageResource(R.drawable.four);
                break;
            case 5:
                _ivDisplayImage.setImageResource(R.drawable.five);
                break;
            default:
                _ivDisplayImage.setImageResource(R.drawable.one);
                break;
        }
    }
}