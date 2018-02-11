package aidlserver.demo.com.myapplication;

import android.os.RemoteException;

/**
 * Created by wangpengjie-os on 2018/1/18.
 */

public class IPersonImpl extends  IPerson.Stub {
    // 声明两个变量
    private int age;
    private String name;

    @Override
    public void setAge(int age) throws RemoteException {
        this.age = age;
    }

    @Override
    public void setName(String name) throws RemoteException {
        this.name = name;
    }

    @Override
    public String display() throws RemoteException {
        return "wang pengjie";
    }

}
