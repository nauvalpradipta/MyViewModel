package com.example.myviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;
    private EditText edtLength, edtWidth, edtHeight;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtHeight = findViewById(R.id.edt_height);
        edtWidth = findViewById(R.id.edt_width);
        edtLength = findViewById(R.id.edt_length);

        btnCalculate.setOnClickListener(view -> {
            String length = edtLength.getText().toString();
            String width = edtWidth.getText().toString();
            String height = edtHeight.getText().toString();

            if (width.isEmpty()){
                edtWidth.setError("Please enter width");
            }else if (height.isEmpty()){
                edtHeight.setError("Please enter height");
            }else if (length.isEmpty()){
                edtLength.setError("Please enter length");
            }else {
                String result =
                        String.valueOf(Integer.parseInt(width)
                                * Integer.parseInt(height)
                                * Integer.parseInt(length));
                tvResult.setText(result);
            }
        });
    }
}