package talaso.learning.developingstory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView story;
    private Button top,bottom;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // connecting with view
        TextView story = findViewById(R.id.storyTextView);
        Button top = findViewById(R.id.buttonTop);
        Button bottom = findViewById(R.id.buttonBottom);

        top.setOnClickListener(v -> {
            if(mStoryIndex == 1 || mStoryIndex == 2){
                story.setText(R.string.T3_Story);
                top.setText(R.string.T3_Ans1);
                bottom.setText((R.string.T3_Ans2));
                mStoryIndex = 3;
            }else{
                story.setText(R.string.T6_End);
                top.setVisibility(View.GONE);
                bottom.setVisibility(View.GONE);
            }

        });
        bottom.setOnClickListener(v -> {
            if(mStoryIndex == 1){
            story.setText(R.string.T2_Story);
            top.setText(R.string.T2_Ans1);
            bottom.setText(R.string.T2_Ans2);
            mStoryIndex =2;
        }else if (mStoryIndex == 2){
                story.setText(R.string.T4_End);
                top.setVisibility(View.GONE);
                bottom.setVisibility(View.GONE);
            }
            else{
                story.setText(R.string.T5_End);
                top.setVisibility(View.GONE);
                bottom.setVisibility(View.GONE);
            }
    });
    }
}