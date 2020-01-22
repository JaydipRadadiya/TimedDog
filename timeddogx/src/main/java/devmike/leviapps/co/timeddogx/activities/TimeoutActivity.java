package devmike.leviapps.co.timeddogx.activities;

import androidx.appcompat.app.AppCompatActivity;
import devmike.leviapps.co.timeddogx.TimedDogXWorker;

/**
 * Created by Gbenga Oladipupo on 2020-01-22.
 */
public class TimeoutActivity extends AppCompatActivity {


    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        TimedDogXWorker.touch();
        //TimeoutSensor.TimeoutSensorTask.touch();
    }

}
