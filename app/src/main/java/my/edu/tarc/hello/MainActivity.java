package my.edu.tarc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewMyName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //show ui
        //R = resources class
        setContentView(R.layout.activity_main);

        textViewMyName = (TextView)findViewById(R.id.TextViewMessage);
        textViewMyName.setText("My name is "+getText(R.string.my_name));
    }
    public void showMessage(View view){
        textViewMyName.setText("Button is clicked");
    }
}
