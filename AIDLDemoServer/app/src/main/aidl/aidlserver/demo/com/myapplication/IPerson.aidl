// IPerson.aidl
package aidlserver.demo.com.myapplication;

// Declare any non-default types here with import statements

interface IPerson {

    void setAge(int age);
    void setName(String name);
    String display();
}
