package ml.ananthakumar.androidlabweek4;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AutoCompleteActivity extends AppCompatActivity {

    @BindView(R.id.autoCompleteTextView)
    AutoCompleteTextView auto;

    String[] series={"Game of thrones","Breaking Bad","Better Call Saul","Westworld","Person of Interest","Silicon Valley","Suits"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);
        ButterKnife.bind(this);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, series);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        auto.setTextColor(Color.BLUE);
    }
}
