package medicalapp.irfanullah.com.medicalapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import medicalapp.irfanullah.com.medicalapp.DiseasActivity;
import medicalapp.irfanullah.com.medicalapp.Models.DiseaseModel;
import medicalapp.irfanullah.com.medicalapp.R;

public class DiseaseRVAdapter extends RecyclerView.Adapter<DiseaseRVAdapter.DiseaseViewHolder> {
    private Context context;
    private ArrayList<DiseaseModel> diseaseModels;


    public DiseaseRVAdapter(Context context, ArrayList<DiseaseModel> dM) {
        this.context = context;
        this.diseaseModels = dM;
    }

    @NonNull
    @Override
    public DiseaseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.disease_row,viewGroup,false);
        return new DiseaseViewHolder(view, this.context);
    }

    @Override
    public void onBindViewHolder(@NonNull DiseaseViewHolder diseaseViewHolder, int i) {

        diseaseViewHolder.diseaseTitle.setText(this.diseaseModels.get(i).getDISEASE_NAME());

    }

    @Override
    public int getItemCount() {
        return this.diseaseModels.size();
    }


    public void filteredList(ArrayList<DiseaseModel> fDM)
    {
        this.diseaseModels = fDM;
        notifyDataSetChanged();
    }

    public static class DiseaseViewHolder extends RecyclerView.ViewHolder {
        ConstraintLayout diseaseRowLayout;
        TextView diseaseTitle;
        private final String DISEASE_INTENT_EXTRA = "disease_name";

        public DiseaseViewHolder(@NonNull View itemView, final Context context) {
            super(itemView);
            diseaseRowLayout = itemView.findViewById(R.id.disease_row_layout);
            diseaseTitle = itemView.findViewById(R.id.diseaseTitle);

            diseaseRowLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView tx = v.findViewById(R.id.diseaseTitle);
                    String diseaseTitle = tx.getText().toString();
                    Intent diseaseDetailActivity = new Intent(context,DiseasActivity.class);
                    diseaseDetailActivity.putExtra(DISEASE_INTENT_EXTRA,diseaseTitle.toLowerCase());
                    context.startActivity(diseaseDetailActivity);
                   // Toast.makeText(context,diseaseTitle,Toast.LENGTH_LONG).show();
                }
            });


        }
    }
}
