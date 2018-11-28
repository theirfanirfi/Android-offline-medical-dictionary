package medicalapp.irfanullah.com.medicalapp.DiseaseFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import medicalapp.irfanullah.com.medicalapp.R;

public class Whatis extends Fragment {
    private final String WHAT_IS_IT = "whatit";

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public Whatis() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String detail = getArguments().getString(WHAT_IS_IT);
        View rootView = inflater.inflate(R.layout.fragment_diseases, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.detail);
        textView.setText(detail);
        return rootView;
    }
}