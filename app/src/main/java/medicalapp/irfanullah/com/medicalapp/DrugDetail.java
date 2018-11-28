package medicalapp.irfanullah.com.medicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import medicalapp.irfanullah.com.medicalapp.Data.DrugUtil;

public class DrugDetail extends AppCompatActivity {

    private String DRUG_NAME;
    private final static String INTENT_DRUG_EXTRA = "drug_name";
    Toolbar toolbar;
    DrugUtil drugUtil;
    ArrayList<DrugModel> drugModels, singleDrug;

    //components
    TextView drugTitle, moa_title, moa_text, podose_title,podose_text, ivdose_title,ivdose_text, ccb_title, ccb_text, dka_title, dka_text;
    TextView proc_sed_title, proc_sed_text, rsi_ind_title, rsi_ind_text, usual_cont_infusion_title, usual_cont_infusion_text,pcp_title,pcp_text;
    TextView cont_infusion_title, cont_infusion_text, pulse_title, pulse_text, asthma_title, asthma_text, hsr_title, hsr_text,sulfo_toxicity_title,sulfo_toxicity_text;
    TextView ventilator_sed_title,ventilator_sed_text,tca_title, tca_text,salycylate_title,salycylate_text,emergent_title,emergent_text,adult_brad_title,adult_brad_text;
    TextView anaph_title,anaph_text,ped_anaph_title,ped_anaph_text,hyper_ten_title,hyper_ten_text,trouble_title,trouble_text, dose_title, dose_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug_detail);


        //initializing objects


        //initializing detail componenets

        drugTitle = findViewById(R.id.drug_title);
        moa_title = findViewById(R.id.moa_title);
        moa_text = findViewById(R.id.moa_text);

        podose_title = findViewById(R.id.podose_title);
        podose_text = findViewById(R.id.podose_text);


        ivdose_title = findViewById(R.id.ivdose_title);
        ivdose_text = findViewById(R.id.ivdose_text);

        ccb_title = findViewById(R.id.ccboverdose_title);
        ccb_text = findViewById(R.id.ccboverdose_text);

        dka_title = findViewById(R.id.dka_title);
        dka_text = findViewById(R.id.dka_text);

        proc_sed_title = findViewById(R.id.proc_sedation_title);
        proc_sed_text = findViewById(R.id.proc_sedation_text);

        rsi_ind_title = findViewById(R.id.rsi_indication_title);
        rsi_ind_text = findViewById(R.id.rsi_indication_text);

        usual_cont_infusion_title = findViewById(R.id.usual_cont_infusion_title);
        usual_cont_infusion_text = findViewById(R.id.usual_cont_infusion_text);

        cont_infusion_title = findViewById(R.id.cont_infusion_title);
        cont_infusion_text = findViewById(R.id.cont_infusion_text);

        pulse_title = findViewById(R.id.pulse_title);
        pulse_text = findViewById(R.id.pulse_text);

        asthma_title = findViewById(R.id.asthma_title);
        asthma_text = findViewById(R.id.asthma_text);

        hsr_title = findViewById(R.id.hsr_title);
        hsr_text = findViewById(R.id.hsr_text);

        pcp_title = findViewById(R.id.pcp_title);
        pcp_text = findViewById(R.id.pcp_text);

        sulfo_toxicity_title = findViewById(R.id.sulfo_toxicity_title);
        sulfo_toxicity_text = findViewById(R.id.sulfo_toxicity_text);

        ventilator_sed_title = findViewById(R.id.ventilator_sed_title);
        ventilator_sed_text = findViewById(R.id.ventilator_sed_text);

        tca_text = findViewById(R.id.tca_text);
        tca_title = findViewById(R.id.tca_title);

        salycylate_title = findViewById(R.id.salycylate_title);
        salycylate_text = findViewById(R.id.salycylate_text);

        emergent_title = findViewById(R.id.emergent_title);
        emergent_text = findViewById(R.id.emergent_text);

        adult_brad_title = findViewById(R.id.adult_brad_title);
        adult_brad_text = findViewById(R.id.adult_brad_text);


        anaph_title = findViewById(R.id.anaph_title);
        anaph_text = findViewById(R.id.anaph_text);

        ped_anaph_title = findViewById(R.id.ped_anaph_title);
        ped_anaph_text = findViewById(R.id.ped_anaph_text);


        trouble_title = findViewById(R.id.trouble_title);
        trouble_text = findViewById(R.id.trouble_text);

        dose_title = findViewById(R.id.dose_title);
        dose_text = findViewById(R.id.dose_text);

        hyper_ten_title = findViewById(R.id.hyper_ten_title);
        hyper_ten_text = findViewById(R.id.hyper_ten_text);

        drugUtil = new DrugUtil();
        singleDrug = new ArrayList<>();

        getSupportActionBar().setTitle("Detail");

        //setSupportActionBar(toolbar);

       // toolbar.setTitle("Detail");

        drugModels = drugUtil.getDrugs();

        if(getIntent().getExtras() != null) {
            DRUG_NAME = getIntent().getExtras().getString(INTENT_DRUG_EXTRA).toLowerCase();
        }
        else
        {
            finish();
        }


        for(DrugModel item : drugModels)
        {
            if(item.getDRUG_NAME().toLowerCase().equals(DRUG_NAME))
            {
                singleDrug.add(item);
                break;
            }
        }

        //Toast.makeText(this,singleDrug.get(0).getDRUG_NAME().toString(),Toast.LENGTH_LONG).show();
        drugTitle.setText(singleDrug.get(0).getDRUG_NAME().toString());

        if(!singleDrug.get(0).getMOA().isEmpty())
        {
            moa_title.setVisibility(View.VISIBLE);
            moa_text.setVisibility(View.VISIBLE);
            moa_text.setText(singleDrug.get(0).getMOA());
        }


        //po dose

        if(!singleDrug.get(0).getPO_DOSE().isEmpty())
        {
            podose_title.setVisibility(View.VISIBLE);
            podose_text.setVisibility(View.VISIBLE);
            podose_text.setText(singleDrug.get(0).getPO_DOSE());
        }

        //iv dose

        if(!singleDrug.get(0).getIV_DOSE().isEmpty())
        {
            ivdose_title.setVisibility(View.VISIBLE);
            ivdose_text.setVisibility(View.VISIBLE);
            ivdose_text.setText(singleDrug.get(0).getIV_DOSE());
        }

        //ccb over dose

        if(!singleDrug.get(0).getCCB_OVERDOSE().isEmpty())
        {
            ccb_title.setVisibility(View.VISIBLE);
            ccb_text.setVisibility(View.VISIBLE);
            ccb_text.setText(singleDrug.get(0).getCCB_OVERDOSE());
        }


        //dka

        if(!singleDrug.get(0).getDKA_HHS().isEmpty())
        {
            dka_title.setVisibility(View.VISIBLE);
            dka_text.setVisibility(View.VISIBLE);
            dka_text.setText(singleDrug.get(0).getDKA_HHS());
        }

        //procedural Sedation

        if(!singleDrug.get(0).getPROCEDURAL_SEDATION().isEmpty())
        {
            proc_sed_title.setVisibility(View.VISIBLE);
            proc_sed_text.setVisibility(View.VISIBLE);
            proc_sed_text.setText(singleDrug.get(0).getPROCEDURAL_SEDATION());
        }

        //rsi indication

        if(!singleDrug.get(0).getRSI_INDICATION().isEmpty())
        {
            rsi_ind_title.setVisibility(View.VISIBLE);
            rsi_ind_text.setVisibility(View.VISIBLE);
            rsi_ind_text.setText(singleDrug.get(0).getRSI_INDICATION());
        }

        //usual continuous infusion

        if(!singleDrug.get(0).getUSUAL_CONTINOUS_INFUSION().isEmpty())
        {
            usual_cont_infusion_title.setVisibility(View.VISIBLE);
            usual_cont_infusion_text.setVisibility(View.VISIBLE);
            usual_cont_infusion_text.setText(singleDrug.get(0).getUSUAL_CONTINOUS_INFUSION());
        }

        //continuous infusion

        if(!singleDrug.get(0).getCONTINOUS_INFUSION().isEmpty())
        {
            cont_infusion_title.setVisibility(View.VISIBLE);
            cont_infusion_text.setVisibility(View.VISIBLE);
            cont_infusion_text.setText(singleDrug.get(0).getCONTINOUS_INFUSION());
        }

        //Pulseless torsades

        if(!singleDrug.get(0).getPULSELESS_TORSADES().isEmpty())
        {
            pulse_title.setVisibility(View.VISIBLE);
            pulse_text.setVisibility(View.VISIBLE);
            pulse_text.setText(singleDrug.get(0).getPULSELESS_TORSADES());
        }

        //Asthma exacerbation

        if(!singleDrug.get(0).getASTHMA_EXACERBATION().isEmpty())
        {
            asthma_title.setVisibility(View.VISIBLE);
            asthma_text.setVisibility(View.VISIBLE);
            asthma_text.setText(singleDrug.get(0).getASTHMA_EXACERBATION());
        }


        //Hyper sensitivity reaction

        if(!singleDrug.get(0).getHYPER_SENSITIVITY_REACTION().isEmpty())
        {
            hsr_title.setVisibility(View.VISIBLE);
            hsr_text.setVisibility(View.VISIBLE);
            hsr_text.setText(singleDrug.get(0).getHYPER_SENSITIVITY_REACTION());
        }

        //Hyper sensitivity reaction

        if(!singleDrug.get(0).getPCP_PNA().isEmpty())
        {
            pcp_title.setVisibility(View.VISIBLE);
            pcp_text.setVisibility(View.VISIBLE);
            pcp_text.setText(singleDrug.get(0).getPCP_PNA());
        }


        //sulfonylurea toxicity

        if(!singleDrug.get(0).getSULFONYLUREA_TOXICITY().isEmpty())
        {
            sulfo_toxicity_title.setVisibility(View.VISIBLE);
            sulfo_toxicity_text.setVisibility(View.VISIBLE);
            sulfo_toxicity_text.setText(singleDrug.get(0).getSULFONYLUREA_TOXICITY());
        }


        //Ventilator Sedation

        if(!singleDrug.get(0).getVENTILATOR_SEDATION().isEmpty())
        {
            ventilator_sed_title.setVisibility(View.VISIBLE);
            ventilator_sed_text.setVisibility(View.VISIBLE);
            ventilator_sed_text.setText(singleDrug.get(0).getVENTILATOR_SEDATION());
        }

        //TCA Toxicity

        if(!singleDrug.get(0).getTCA_TOXICITY().isEmpty())
        {
            tca_title.setVisibility(View.VISIBLE);
            tca_text.setVisibility(View.VISIBLE);
            tca_text.setText(singleDrug.get(0).getTCA_TOXICITY());
        }

        //Salicylate Toxicity

        if(!singleDrug.get(0).getSALICYLATE_TOXICITY().isEmpty())
        {
            salycylate_title.setVisibility(View.VISIBLE);
            salycylate_text.setVisibility(View.VISIBLE);
            salycylate_text.setText(singleDrug.get(0).getSALICYLATE_TOXICITY());
        }



        //Emergent indications

        if(!singleDrug.get(0).getEMERGENT_INDICATIONS().isEmpty())
        {
            emergent_title.setVisibility(View.VISIBLE);
            emergent_text.setVisibility(View.VISIBLE);
            emergent_text.setText(singleDrug.get(0).getEMERGENT_INDICATIONS());
        }

        //Adult Bradycardia

        if(!singleDrug.get(0).getADULT_BRADYCARDIA().isEmpty())
        {
            adult_brad_title.setVisibility(View.VISIBLE);
            adult_brad_text.setVisibility(View.VISIBLE);
            adult_brad_text.setText(singleDrug.get(0).getADULT_BRADYCARDIA());
        }

        //Anaphylaxis

        if(!singleDrug.get(0).getANAPHYLAXIS().isEmpty())
        {
            anaph_title.setVisibility(View.VISIBLE);
            anaph_text.setVisibility(View.VISIBLE);
            anaph_text.setText(singleDrug.get(0).getANAPHYLAXIS());
        }

        //Ped Anaphylaxis

        if(!singleDrug.get(0).getPEDS_ANAPHYLAXIS().isEmpty())
        {
            ped_anaph_title.setVisibility(View.VISIBLE);
            ped_anaph_text.setVisibility(View.VISIBLE);
            ped_anaph_text.setText(singleDrug.get(0).getPEDS_ANAPHYLAXIS());
        }

        //Hyper tension refactory

        if(!singleDrug.get(0).getHYPER_TENSION_REFACTORY().isEmpty())
        {
            hyper_ten_title.setVisibility(View.VISIBLE);
            hyper_ten_text.setVisibility(View.VISIBLE);
            hyper_ten_text.setText(singleDrug.get(0).getHYPER_TENSION_REFACTORY());
        }

        //Where you will get in trouble

        if(!singleDrug.get(0).getWHERE_YOU_WILL_GET_IN_TROUBLE().isEmpty())
        {
            trouble_title.setVisibility(View.VISIBLE);
            trouble_text.setVisibility(View.VISIBLE);
            trouble_text.setText(singleDrug.get(0).getWHERE_YOU_WILL_GET_IN_TROUBLE());
        }

        if(!singleDrug.get(0).getDOSE().isEmpty())
        {
            dose_title.setVisibility(View.VISIBLE);
            dose_text.setVisibility(View.VISIBLE);
            dose_text.setText(singleDrug.get(0).getDOSE());
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
