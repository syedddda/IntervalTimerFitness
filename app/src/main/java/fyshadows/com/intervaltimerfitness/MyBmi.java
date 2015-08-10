package fyshadows.com.intervaltimerfitness;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USEHUSY on 10-08-2015.
 */
public class MyBmi extends MainActivity{

    TextView height;
    TextView weight;

    String ht;
    String wt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_bmi);

        Intent extras = getIntent();

        height = (TextView) findViewById(R.id.myheight);
        weight = (TextView) findViewById(R.id.myWeight);

        ArrayList<Integer> val = extras.getIntegerArrayListExtra("Values");

        height.setText(val.get(0).toString());
        weight.setText(val.get(1).toString());

    }


}
