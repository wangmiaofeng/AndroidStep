package broadcast.bigdemo.com.bigbroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static String START_SYS_BD_DEMO = "broadcast.bigdemo.com.bigbroadcast.SystemBDDemoActivity";
    private static String START_ORDER_BD_DEMO = "broadcast.bigdemo.com.bigbroadcast.OrderBDDemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /*
    * start system broadcast demo
    *
    * */

    public void startSystemBDDemo(View v){
        Intent intentSysBD = new Intent (START_SYS_BD_DEMO);
        startActivity(intentSysBD);
    }

    /*
    * start order broadcast demo
    *
    * */
    public void startOrderBDDemo(View v){
        Intent intentSysBD = new Intent (START_ORDER_BD_DEMO);
        startActivity(intentSysBD);
    }

}
