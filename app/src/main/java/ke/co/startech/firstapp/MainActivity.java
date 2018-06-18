package ke.co.startech.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//Never have a capital letter image or file in RES folder
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
