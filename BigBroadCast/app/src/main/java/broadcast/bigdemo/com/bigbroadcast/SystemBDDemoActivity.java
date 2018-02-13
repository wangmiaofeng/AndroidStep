package broadcast.bigdemo.com.bigbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SystemBDDemoActivity extends AppCompatActivity {

    BroadcastReceiver mbdSysBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_bddemo);
        IntentFilter filterBD = new IntentFilter();
        filterBD.addAction(Intent.ACTION_SCREEN_OFF);
        filterBD.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        filterBD.addAction(Intent.ACTION_SHUTDOWN);

        mbdSysBD = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String actionBDRece = intent.getAction();
                if (actionBDRece.equals(Intent.ACTION_SCREEN_OFF)){
                    Toast.makeText(context,"screen off bd has received in SystemBDDemoActivity...",Toast.LENGTH_SHORT).show();
                }else if(actionBDRece.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
                    Toast.makeText(context,"airplane mode change bd has received in SystemBDDemoActivity...",Toast.LENGTH_SHORT).show();
                }else if(actionBDRece.equals(Intent.ACTION_SHUTDOWN)){
                    Toast.makeText(context,"shut down required has received in SystemBDDemoActivity...",Toast.LENGTH_SHORT).show();
                }

            }
        };

        registerReceiver(mbdSysBD,filterBD);

    }

    protected void onResume(){
        super.onResume();
    }

    protected void onPause(){
        super.onPause();
    }

    protected void onStop(){
        super.onStop();
    }

    protected void onDestroy(){
        super.onDestroy();
        unregisterReceiver(mbdSysBD);
    }
}
