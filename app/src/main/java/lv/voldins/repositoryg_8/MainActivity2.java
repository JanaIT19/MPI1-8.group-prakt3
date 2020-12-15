package lv.voldins.repositoryg_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button activity1;
    private Button readPreferences;
    TextView text;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        activity1 = (Button) findViewById(R.id.activity1);
        activity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        readPreferences = (Button) findViewById(R.id.preferences);
        readPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                String textStr = preferences.getString("name", "");
                text = (TextView) findViewById(R.id.textView);
                text.setText(textStr);
            }
        });
    }
    public void openActivity1(){
        finish();
    }
}