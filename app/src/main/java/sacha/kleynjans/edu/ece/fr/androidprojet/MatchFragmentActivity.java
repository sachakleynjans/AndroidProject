package sacha.kleynjans.edu.ece.fr.androidprojet;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SachaKleynjans on 07/04/2017.
 */

public class MatchFragmentActivity extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.team_name_fragment, container, false);
    }

}
