package com.mobile.muhammadadilmehmood_labassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static final String NUMBER_INTENT_KEY = "ENTERED_NUMBER";

    private EditText _etEnterNumber;
    private Button _btnDisplayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _etEnterNumber = findViewById(R.id.et_enter_number);
        _btnDisplayImage = findViewById(R.id.btn_display_image);

        _btnDisplayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _enteredNumber = _etEnterNumber.getText().toString().trim();
                if(_enteredNumber.isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.please_enter_number, Toast.LENGTH_SHORT).show();
                }else {
                  int _number = Integer.parseInt(_enteredNumber);
                  if(_number == 0 || _number > 5 || _number < 0) {
                      Toast.makeText(MainActivity.this, R.string.please_enter_number, Toast.LENGTH_SHORT).show();
                  }else {
                      Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                      intent.putExtra(NUMBER_INTENT_KEY, _number);
                      startActivity(intent);
                  }
                }
            }
        });
    }
}