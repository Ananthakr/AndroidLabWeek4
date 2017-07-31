package ml.ananthakumar.androidlabweek4;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TypefaceActivity extends AppCompatActivity {

    @BindView(R.id.pacifico)
    TextView pacifico;

    @BindView(R.id.amatic)
    TextView amatic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeface);
        ButterKnife.bind(this);

        Typeface face= Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
        pacifico.setTypeface(face);

        Typeface face1= Typeface.createFromAsset(getAssets(), "fonts/Amatic-Bold.ttf");
        amatic.setTypeface(face1);
    }
}
