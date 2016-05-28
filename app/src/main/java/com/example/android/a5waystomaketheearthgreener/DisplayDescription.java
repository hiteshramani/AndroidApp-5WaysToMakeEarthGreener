package com.example.android.a5waystomaketheearthgreener;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by hitesh on 5/28/16.
 */
public class DisplayDescription extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_description);
        Bundle bundlen = getIntent().getExtras();
        TextView textView = (TextView) findViewById(R.id.display_text);
        if(bundlen != null){
            if(bundlen.containsKey("KEY_BUTTON_1")) {
                textView.setText(getIntent().getExtras().getString("KEY_BUTTON_1"));
            }
            else if(bundlen.containsKey("KEY_BUTTON_2")){
                textView.setText(getIntent().getExtras().getString("KEY_BUTTON_2"));
            }
            else if(bundlen.containsKey("KEY_BUTTON_3")){
                textView.setText(getIntent().getExtras().getString("KEY_BUTTON_3"));
            }
            else if(bundlen.containsKey("KEY_BUTTON_4")){
                textView.setText(getIntent().getExtras().getString("KEY_BUTTON_4"));
            }
            else if(bundlen.containsKey("KEY_BUTTON_5")){
                textView.setText(getIntent().getExtras().getString("KEY_BUTTON_5"));
            }
        }
    }

}
