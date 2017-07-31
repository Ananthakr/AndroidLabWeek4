package ml.ananthakumar.androidlabweek4;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class AudioManagerActivity extends AppCompatActivity {

    private AudioManager myAudioManager;


    @OnClick(R.id.mode) void checkMode(){
        int mod=myAudioManager.getRingerMode();
        if(mod==AudioManager.RINGER_MODE_VIBRATE){
            Toast.makeText(this,"Now in Vibrate Mode",
                    Toast.LENGTH_LONG).show();
        } else if(mod==AudioManager.RINGER_MODE_NORMAL){
            Toast.makeText(this,"Now in Ringing Mode",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this,"Now in Vibrate Mode",
                    Toast.LENGTH_LONG).show();
        }
    }

    @OnClick(R.id.ring) void ring(){
        myAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
        Toast.makeText(this,"Now in Vibrate Mode",
                Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.vibrate) void vibrate(){
        myAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
        Toast.makeText(this,"Now in Ringer Mode",
                Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.silent) void silent(){

        NotificationManager notificationManager =
                (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N
                && !notificationManager.isNotificationPolicyAccessGranted()) {

            Intent intent = new Intent(
                    android.provider.Settings
                            .ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS);

            startActivity(intent);
        }else {
            myAudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
            Toast.makeText(this, "Now in Silent Mode",
                    Toast.LENGTH_LONG).show();
        }
    }

    @OnClick(R.id.volplus) void volPlus(){

        myAudioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC,AudioManager.ADJUST_RAISE,AudioManager.FLAG_SHOW_UI);
        Toast.makeText(this,"Volume increased",
                Toast.LENGTH_LONG).show();

    }

    @OnClick(R.id.volminus) void volMinus(){

        myAudioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC,AudioManager.ADJUST_LOWER,AudioManager.FLAG_SHOW_UI);
        Toast.makeText(this,"Volume decreased",
                Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_manager);
        myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        ButterKnife.bind(this);

    }
}
