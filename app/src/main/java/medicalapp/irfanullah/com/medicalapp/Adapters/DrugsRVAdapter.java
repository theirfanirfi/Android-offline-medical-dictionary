package medicalapp.irfanullah.com.medicalapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import medicalapp.irfanullah.com.medicalapp.DrugDetail;
import medicalapp.irfanullah.com.medicalapp.DrugModel;
import medicalapp.irfanullah.com.medicalapp.R;

public class DrugsRVAdapter extends RecyclerView.Adapter<DrugsRVAdapter.DrugsViewHolder>{

    private Context context;
    private String[] DRUGS;
    private ArrayList<DrugModel> drugModels;
    public DrugsRVAdapter(Context context,ArrayList<DrugModel> drugs) {
        this.context = context;
        this.drugModels = drugs;
    }

    @NonNull
    @Override
    public DrugsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.drugs_row,viewGroup,false);
        return new DrugsViewHolder(view, this.context);
    }

    @Override
    public void onBindViewHolder(@NonNull DrugsViewHolder drugsViewHolder, int i) {
//        String Drug_name = "";
//        if(drugModels.get(i).getDRUG_NAME().length() > 25){
//            Drug_name = drugModels.get(i).getDRUG_NAME().substring(0,25)+" ...";
//
//        }
//
//        else
//        {
//            Drug_name = drugModels.get(i).getDRUG_NAME();
//        }


        drugsViewHolder.dTitle.setText(drugModels.get(i).getDRUG_NAME());
    }

    @Override
    public int getItemCount() {
        return drugModels.size();
    }

    public void filteredList(ArrayList<DrugModel> dm)
    {
            this.drugModels = dm;
            notifyDataSetChanged();
    }




    public static class DrugsViewHolder extends RecyclerView.ViewHolder {

        TextView dTitle, dId;
        ConstraintLayout layout;
        private final static String INTENT_DRUG_EXTRA = "drug_name";
        public DrugsViewHolder(@NonNull View itemView, final Context context) {
            super(itemView);

            dTitle = itemView.findViewById(R.id.drugTitle);

            layout = itemView.findViewById(R.id.drug_row_layout);

            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView title = v.findViewById(R.id.drugTitle);
                    Intent drugDetailActivity = new Intent(context,DrugDetail.class);
                    drugDetailActivity.putExtra(INTENT_DRUG_EXTRA,title.getText().toString());
                    context.startActivity(drugDetailActivity);
                }
            });


//            dTitle.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    TextView title = v.findViewById(R.id.drugTitle);
//                    Intent drugDetailActivity = new Intent(context,DrugDetail.class);
//                    drugDetailActivity.putExtra(INTENT_DRUG_EXTRA,title.getText().toString());
//                    context.startActivity(drugDetailActivity);
//
//                }
//            });

        }


    }


}
