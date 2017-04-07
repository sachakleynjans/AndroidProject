package sacha.kleynjans.edu.ece.fr.androidprojet;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by SachaKleynjans on 07/04/2017.
 */

public class MainActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
    public void goStatistiques(View v){
        Intent stat = new Intent(this,StatActivity.class);
        startActivity(stat);
    }
    public void goStartMatch(View v){
        Intent startMatch = new Intent(this,MatchActivity.class);
        startActivity(startMatch);
    }
}
