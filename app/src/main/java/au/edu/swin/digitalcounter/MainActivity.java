package au.edu.swin.digitalcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnadd, btmsub;
int counter=0;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btnadd= (Button) findViewById(R.id.buttonAdd);
        btmsub=(Button) findViewById(R.id.buttonSub);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                tv.setText("Total is : "+counter);
            }
        });
        btmsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                tv.setText("Total is : "+counter);
            }
        });
        setContentView(R.layout.activity_main);
    }
}
