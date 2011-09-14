package com.google.monkeyjump;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainMenu extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Button configureButton = (Button) findViewById(R.id.configure_button);
        configureButton.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
//                        Intent calArea = new Intent(MainMenu.this, Configure.class);
//                        startActivity(calArea);
                	toast("Cliquei em configurações");
                	
                }
        });

        Button rankingButton = (Button) findViewById(R.id.rank_button);
        rankingButton.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
//                        Intent calDist = new Intent(MainMenu.this, Ranking.class);
//                        startActivity(calDist);
                	toast("Cliquei em Ranking");

                }
        });

        Button startButton = (Button) findViewById(R.id.start_button);
        startButton.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
//                        Intent developers = new Intent(MainMenu.this, Game.class);
//                        startActivity(developers);  
                	toast("Cliquei em start");
                }
        });
    }
    
    public void toast(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();

}
    
}