package aidlserver.demo.com.aidldemoclient;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import aidlserver.demo.com.myapplication.IPerson;

public class MainActivity extends AppCompatActivity {

    private IPerson iPerson;

    private ServiceConnection conn = new ServiceConnection() {
        @Override
        synchronized public void onServiceConnected(ComponentName name, IBinder service) {
            iPerson = IPerson.Stub.asInterface(service);
            System.out.println("iperson----------:" + iPerson);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            iPerson = null;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDemoMesg(View v){
        try {

            Intent intent = new Intent("aidlserver.demo.com.myapplication.MyRemoteService");
            //intent.setPackage(this.getPackageName());
            intent.setPackage("aidlserver.demo.com.myapplication");
            bindService(intent, conn, Service.BIND_AUTO_CREATE);

            String msg = iPerson.display();
            // 显示方法调用返回值
            System.out.println("ipersion----"+"current msg is "+msg);
            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onDestroy() {
        unbindService(conn);
        super.onDestroy();
    }
}
