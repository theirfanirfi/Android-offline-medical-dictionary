package medicalapp.irfanullah.com.medicalapp.DiseaseFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import medicalapp.irfanullah.com.medicalapp.R;

public class WhereIsItFound extends Fragment {
    private final String WHERE_IS_IT_FOUND = "whereitf";
    private static final String ARG_SECTION_NUMBER = "section_number";

    public WhereIsItFound() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        String detail = bundle.getString(WHERE_IS_IT_FOUND);
        View rootView = inflater.inflate(R.layout.fragment_diseases, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.detail);
        textView.setText(detail);
        return rootView;
    }
}