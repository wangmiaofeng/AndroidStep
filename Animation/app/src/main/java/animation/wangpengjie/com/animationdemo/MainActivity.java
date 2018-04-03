package animation.wangpengjie.com.animationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mdogbk;
    AnimationDrawable mdogAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    protected  void onStart(){
        super.onStart();
        mdogbk = (ImageView) findViewById(R.id.bk);
        mdogbk.setBackgroundResource(R.drawable.dogs);
        mdogAnimation = (AnimationDrawable) mdogbk.getBackground();
    }

    void beginAnimationShow(View v){

        if(mdogAnimation.isRunning())
            mdogAnimation.stop();
        else
            mdogAnimation.start();

    }
}
