package sacha.kleynjans.edu.ece.fr.androidprojet;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by SachaKleynjans on 07/04/2017.
 */

public class MatchCounterFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.match_counter_fragment,container, false);
    }
}
