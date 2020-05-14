package sg.edu.np.whackamole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;
    TextView Score;
    int randomLocation,score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Score = findViewById(R.id.Score);
        score = 0;
        Score.setText(String.valueOf(score));

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        setNewMole();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Whack a mole", "Button Left Clicked!");
                if(randomLocation == 0){
                    score ++;
                    Log.d("Whack a mole", "Hit, score added!");
                }
                else{
                    score --;
                    Log.d("Whack a mole", "Missed, score deducted!");
                }
                Score.setText(String.valueOf(score));
                setNewMole();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Whack a mole", "Button Middle Clicked!");
                if(randomLocation == 1){
                    score ++;
                    Log.d("Whack a mole", "Hit, score added!");
                }
                else{
                    score --;
                    Log.d("Whack a mole", "Missed, score deducted!");
                }
                Score.setText(String.valueOf(score));
                setNewMole();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Whack a mole", "Button Left Clicked!");
                if(randomLocation == 2){
                    score ++;
                    Log.d("Whack a mole", "Hit, score added!");
                }
                else{
                    score --;
                    Log.d("Whack a mole", "Missed, score deducted!");
                }
                Score.setText(String.valueOf(score));
                setNewMole();
            }
        });

    }

    public void setNewMole()
    {
        Random ran = new Random();
        randomLocation = ran.nextInt(3);
        button3.setText("0");
        button2.setText("0");
        button1.setText("0");
        if(randomLocation == 0){
            button1.setText("*");

        }
        else if(randomLocation == 1){
            button2.setText("*");
        }
        else if(randomLocation == 2){
            button3.setText("*");
        }
    }
}