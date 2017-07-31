package ml.ananthakumar.androidlabweek4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.alertdialog) void gotoAlert(){
        Intent int1= new Intent(MainActivity.this,AlertActivity.class);
        startActivity(int1);
    }

    @OnClick(R.id.autocomplete) void gotoAutocomplete(){
        Intent int2= new Intent(MainActivity.this,AutoCompleteActivity.class);
        startActivity(int2);
    }

    @OnClick(R.id.audiomanager) void gotoAudioManager(){
        Intent int3= new Intent(MainActivity.this,AudioManagerActivity.class);
        startActivity(int3);
    }

    @OnClick(R.id.audiorecorder) void gotoAudioRecorder(){
        Intent int4= new Intent(MainActivity.this,AudioRecorderActivity.class);
        startActivity(int4);
    }

    @OnClick(R.id.texttovoice) void gotoTextToVoice(){
        Intent int5= new Intent(MainActivity.this,TextToSpeechActivity.class);
        startActivity(int5);
    }

    @OnClick(R.id.typeface) void gotoTypeface(){
        Intent int6= new Intent(MainActivity.this,TypefaceActivity.class);
        startActivity(int6);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
