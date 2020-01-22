package devmike.leviapps.co.sample;

import android.app.Application;

import devmike.leviapps.co.timeddogx.TimedDog;

/**
 * Created by Gbenga Oladipupo on 2020-01-21.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TimedDog.init(this);
    }
}
