package medicalapp.irfanullah.com.medicalapp.Adapters;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import medicalapp.irfanullah.com.medicalapp.R;

public class SideMenuAdapter extends ArrayAdapter {
    private static String[] TITLES;
    public SideMenuAdapter(Context context, String[] titles) {
        super(context, R.layout.sidemenu,titles);
        this.TITLES = titles;
    }


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View row = inflater.inflate(R.layout.sidemenu,parent,false);
//        if(position ==0)
//        {
//            ImageView iv = row.findViewById(R.id.imageView);
//            iv.setVisibility(View.GONE);
////            ConstraintLayout layout = row.findViewById(R.id.sideConsLayout);
////            layout.setBackgroundColor((int) R.color.colorPrimary);
//        }
        TextView title = row.findViewById(R.id.listTextTitle);
        title.setText(this.TITLES[position]);
        return row;
    }


    @Override
    public Filter getFilter() {

        return super.getFilter();
    }
}
