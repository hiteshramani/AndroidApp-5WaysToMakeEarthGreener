package com.example.android.a5waystomaketheearthgreener;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Click(View view){
        Intent intent = new Intent(this, DisplayDescription.class);
        String button_1_data = "Did you know that a cell phone charger can still consume electricity" +
                " even when a phone isn't connected to it? In the average home, 25% of the electricity" +
                " used to power home electronics is consumed while the products are turned off. To " +
                "stop these \"phantom\" loads when devices are not in use, unplug them or connect " +
                "them to power strips, which can then be turned off.";
        intent.putExtra("KEY_BUTTON_1",button_1_data);
        startActivity(intent);

    }

    public void onButton2Click(View view){
        Intent intent = new Intent(this, DisplayDescription.class);
        String button_2_data = "By recycling materials such as aluminum cans, newspapers, and glass " +
                "jars, you can save energy and landfill space, conserve natural resources, and also " +
                "prevent pollution. Recycling one ton of paper saves 17 mature trees, 7,000 gallons " +
                "of water, three cubic yards of landfill space, two barrels of oil, and 4,100 " +
                "kilowatt-hours of electricity – enough energy to power the average US home for " +
                "five months. Visit our recycling directory to find recycling opportunities in your " +
                "community.";
        intent.putExtra("KEY_BUTTON_2",button_2_data);
        startActivity(intent);

    }


    public void onButton3Click(View view){
        Intent intent = new Intent(this, DisplayDescription.class);
        String button_3_data = "A faucet that leaks one drip per second can waste more than 3,000 " +
                "gallons of water each year. A leaky toilet can waste up to 200 gallons of water " +
                "every day. To determine whether your toilet has a leak, place a drop of food " +
                "coloring in the tank; if the color appears in the bowl without flushing, you have " +
                "a leak. To find and fix air leaks, ENERGY STAR offers a free guide.";
        intent.putExtra("KEY_BUTTON_3",button_3_data);
        startActivity(intent);

    }

    public void onButton4Click(View view){
        Intent intent = new Intent(this, DisplayDescription.class);
        String button_4_data = "Electronics, CFLs, certain batteries, and other household hazardous " +
                "wastes contain toxic materials so they should not be sent to landfills where they " +
                "can pollute the surrounding land and water. A single computer monitor may contain " +
                "4 pounds of lead as well as other toxic heavy metals. Many companies and municipal " +
                "governments offer free collection programs, and in some cases you can even get " +
                "paid to recycle old electronics.";
        intent.putExtra("KEY_BUTTON_4",button_4_data);
        startActivity(intent);

    }

    public void onButton5Click(View view){
        Intent intent = new Intent(this, DisplayDescription.class);
        String button_5_data = "Food travels an average of 1,200 miles before it reaches your plate," +
                " so buy locally produced items to save energy and prevent emissions from going into" +
                " the air. Visit USDA.gov to find a farmers market in your area. Also, choose fresh " +
                "foods instead of frozen, since frozen foods require 10 times more energy to " +
                "produce. Finally, organic foods are both good for the environment and good for " +
                "your health since synthetic hormones, most conventional pesticides, as well as " +
                "other potentially hazardous practices are not used.";
        intent.putExtra("KEY_BUTTON_5",button_5_data);
        startActivity(intent);

    }

}
