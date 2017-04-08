package sacha.kleynjans.edu.ece.fr.androidprojet;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;


/**
 * Created by SachaKleynjans on 07/04/2017.
 */

public class  MatchActivity extends FragmentActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_activity);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MatchFragmentActivity fragment = new MatchFragmentActivity();
        fragmentTransaction.add(R.id.container, fragment);
        fragmentTransaction.commit();
    }
    protected void goStartMatch(View v){
        setContentView(R.layout.match_activity);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MatchCounterFragment fragment = new MatchCounterFragment();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }
    public void goStatistiques(View v){
        Intent stat = new Intent(this,StatActivity.class);
        startActivity(stat);
    }

    /*protected void goal1(View v) {
        System.out.println("But 1");
        int intScore = 0;
        String score = score1.getText().toString();
        intScore = Integer.parseInt(score);
        intScore += 1;
        score = Integer.toString(intScore);
        score1.setText(score);
    }*/

}


