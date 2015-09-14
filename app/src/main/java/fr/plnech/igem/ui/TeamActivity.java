package fr.plnech.igem.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.OnClick;
import fr.plnech.igem.R;

public class TeamActivity extends DetailActivity {

    @Override
    int getTitleResId() {
        return R.string.title_activity_team;
    }

    @Override
    int getLayoutResId() {
        return R.layout.activity_team;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.firstImage)
    protected void onClickGoulwen() {
        Toast.makeText(getApplicationContext(), "You just clicked on Goulwen's avatar!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.secondImage)
    protected void onClickJohanna() {
        Toast.makeText(getApplicationContext(), "You just clicked on Johanna's avatar!", Toast.LENGTH_SHORT).show();
    }

}