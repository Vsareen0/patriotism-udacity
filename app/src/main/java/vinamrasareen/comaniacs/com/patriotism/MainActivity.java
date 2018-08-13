package vinamrasareen.comaniacs.com.patriotism;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, independence, aboutThisDay, quote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutThisDay = findViewById(R.id.aboutThisDay);
        independence = findViewById(R.id.independence);
        quote = findViewById(R.id.quote);

        textView = findViewById(R.id.text);
        textView.getBackground().setAlpha(128);

        aboutThisDay.getBackground().setAlpha(110);
        quote.getBackground().setAlpha(110);

        ObjectAnimator anim = ObjectAnimator.ofFloat(independence, "ScaleX", 0, 1);
        anim.setDuration(2000);
        anim.start();

        ObjectAnimator anima = ObjectAnimator.ofFloat(quote, "ScaleX", 0, 1);
        anima.setDuration(2000);
        anima.start();

        String[] animatorArray = getResources().getStringArray(R.array.aboutThisDay);
        for(int i=0; i<animatorArray.length; i++){
            aboutThisDay.append(animatorArray[i]);
            ObjectAnimator animation = ObjectAnimator.ofFloat(aboutThisDay, "ScaleY", 0, 1);
            animation.setDuration(2000);
            animation.start();
        }
    }


}
