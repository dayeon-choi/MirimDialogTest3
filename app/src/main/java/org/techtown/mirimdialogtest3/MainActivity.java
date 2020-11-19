package org.techtown.mirimdialogtest3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    ImageView imageView;
    TextView textView;
    Button button;
    View dialogView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(radioGroupListener);

        textView=(TextView)findViewById(R.id.dialog_text);
        imageView=(ImageView)findViewById(R.id.dialog_image);

        dialogView=View.inflate(MainActivity.this,R.layout.dialog,null);
        button=findViewById(R.id.btn_show);
        button.setOnClickListener(btnHereListener);
    }
    RadioGroup.OnCheckedChangeListener radioGroupListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch(i){
                case R.id.rad_dog:
                    textView.setText("강아지");
                    imageView.setImageResource(R.drawable.dog);
                    break;
                case R.id.rad_cat:
                    textView.setText("고양이");
                    imageView.setImageResource(R.drawable.kettiy);
                    break;
                case R.id.rad_horse:
                    textView.setText("말");
                    imageView.setImageResource(R.drawable.horse);
                    break;
                case R.id.rad_rabbit:
                    textView.setText("토끼");
                    imageView.setImageResource(R.drawable.rabbit);
                    break;
            }
        }
    };
    View.OnClickListener btnHereListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
}