package sacha.kleynjans.edu.ece.fr.androidprojet;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static sacha.kleynjans.edu.ece.fr.androidprojet.R.id.score1;


/**
 * Created by SachaKleynjans on 07/04/2017.
 */


public class  MatchActivity extends FragmentActivity {

    int but1=0;
    int but2=0;
    int faute1=0;
    int faute2=0;
    int arret1=0;
    int arret2=0;

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
        stat.putExtra("nameTeam1", R.id.name_team1);
        startActivity(stat);
    }
    public void goal1(View v) {
        Button goalButton1 = (Button) findViewById(R.id.goalButton1);
        but1+=1;
        String score = Integer.toString(but1);
        goalButton1.setText(score);
    }
    public void goal2(View v) {
        Button goalButton2 = (Button) findViewById(R.id.goalButton2);
        but2+=1;
        String score = Integer.toString(but2);
        goalButton2.setText(score);
    }
    public void faute1(View v) {
        System.out.println(faute1);
        faute1+=1;
    }
    public void faute2(View v) {
        faute2+=1;
        System.out.println(faute2);
    }
    public void arret1(View v) {
        arret1+=1;
        System.out.println(arret1);
    }
    public void arret2(View v) {
        arret2+=1;
        System.out.println(arret2);
    }
}


