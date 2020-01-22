package devmike.leviapps.co.sample;

import androidx.appcompat.app.AppCompatActivity;
import devmike.leviapps.co.timeddogx.TimedDogXWorker;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new TimedDogXWorker.Builder(this)
                .seconds(10)
                .listener(new TimedDogXWorker.OnTimeOutListener() {
            @Override
            public void onTimeOut(boolean isForeground) {

            }
        }).build();

        final TextView tv = findViewById(R.id.hello_world);

        ValueAnimator valAnim = ValueAnimator.ofInt(0, 200).setDuration(1000);
        valAnim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                tv.getLayoutParams().height = (Integer) animation.getAnimatedValue();
            }
        });
    }

}
