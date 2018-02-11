package aidlserver.demo.com.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyRemoteService extends Service {

    // 声明IPerson接口
    private Binder iPerson = new IPersonImpl();

    public MyRemoteService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
        return iPerson;
    }
}
