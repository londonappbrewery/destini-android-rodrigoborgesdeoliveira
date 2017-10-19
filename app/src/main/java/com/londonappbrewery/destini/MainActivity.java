package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyTextView;
    private Button buttonTop, buttonBottom;
    private int storyIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (storyIndex) {
                    case 1:
                        storyIndex = 3;
                        storyTextView.setText(R.string.T3_Story);
                        buttonTop.setText(R.string.T3_Ans1);
                        buttonBottom.setText(R.string.T3_Ans2);
                        break;
                    case 2:
                        storyIndex = 3;
                        storyTextView.setText(R.string.T3_Story);
                        buttonTop.setText(R.string.T3_Ans1);
                        buttonBottom.setText(R.string.T3_Ans2);
                        break;
                    case 3:
                        storyIndex = 6;
                        storyTextView.setText(R.string.T6_End);
                        buttonTop.setVisibility(View.GONE);
                        buttonBottom.setVisibility(View.GONE);
                        break;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (storyIndex) {
                    case 1:
                        storyIndex = 2;
                        storyTextView.setText(R.string.T2_Story);
                        buttonTop.setText(R.string.T2_Ans1);
                        buttonBottom.setText(R.string.T2_Ans2);
                        break;
                    case 2:
                        storyIndex = 4;
                        storyTextView.setText(R.string.T4_End);
                        buttonTop.setVisibility(View.GONE);
                        buttonBottom.setVisibility(View.GONE);
                        break;
                    case 3:
                        storyIndex = 5;
                        storyTextView.setText(R.string.T5_End);
                        buttonTop.setVisibility(View.GONE);
                        buttonBottom.setVisibility(View.GONE);
                        break;
                }
            }
        });

    }
}
