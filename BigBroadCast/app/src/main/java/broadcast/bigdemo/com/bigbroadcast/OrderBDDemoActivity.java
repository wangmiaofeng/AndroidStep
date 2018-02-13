package broadcast.bigdemo.com.bigbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class OrderBDDemoActivity extends AppCompatActivity {

    BroadcastReceiver mBdOrderbd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_bddemo);
    }

    @Override
    protected void onResume(){
        super.onResume();
        IntentFilter intFilterBd = new IntentFilter();
        intFilterBd.addAction(Intent.ACTION_SCREEN_OFF);
        intFilterBd.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        mBdOrderbd = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {

                String actionIntent = intent.getAction();

                if (actionIntent.equals(Intent.ACTION_SCREEN_OFF)){
                    Toast.makeText(context,"screen off is received by orderBDDemoActivity",Toast.LENGTH_SHORT).show();
                }

            }
        };

        registerReceiver(mBdOrderbd,intFilterBd);
    }

    @Override
    protected void onPause(){
        super.onPause();
        unregisterReceiver(mBdOrderbd);
    }
}
