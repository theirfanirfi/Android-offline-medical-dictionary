package medicalapp.irfanullah.com.medicalapp;

public class DrugModel {
    private int DRUG_ID;
    private String DRUG_NAME;
    private String MOA;
    private String PO_DOSE;
    private String IV_DOSE;
    private String CCB_OVERDOSE;
    private String DKA_HHS;
    private String PROCEDURAL_SEDATION;
    private String RSI_INDICATION;
    private String USUAL_CONTINOUS_INFUSION;
    private String CONTINOUS_INFUSION;
    private String PULSELESS_TORSADES;
    private String ASTHMA_EXACERBATION;
    private String HYPER_SENSITIVITY_REACTION;
    private String PCP_PNA;
    private String SULFONYLUREA_TOXICITY;
    private String VENTILATOR_SEDATION;
    private String TCA_TOXICITY;
    private String SALICYLATE_TOXICITY;
    private String EMERGENT_INDICATIONS;
    private String WHERE_YOU_WILL_GET_IN_TROUBLE;
    private String ADULT_BRADYCARDIA;
    private String ANAPHYLAXIS;
    private String PEDS_ANAPHYLAXIS;
    private String HYPER_TENSION_REFACTORY;
    private String DOSE;


    public String getDOSE() {
        return DOSE;
    }

    public void setDOSE(String DOSE) {
        this.DOSE = DOSE;
    }

//    public DrugModel(int DRUG_ID, String DRUG_NAME, String MOA, String PO_DOSE, String IV_DOSE, String CCB_OVERDOSE, String DKA_HHS, String PROCEDURAL_SEDATION, String RSI_INDICATION, String USUAL_CONTINOUS_INFUSION, String CONTINOUS_INFUSION, String PULSELESS_TORSADES, String ASTHMA_EXACERBATION, String HYPER_SENSITIVITY_REACTION, String PCP_PNA, String SULFONYLUREA_TOXICITY, String VENTILATOR_SEDATION, String TCA_TOXICITY, String SALICYLATE_TOXICITY, String EMERGENT_INDICATIONS, String WHERE_YOU_WILL_GET_IN_TROUBLE) {
//        this.DRUG_ID = DRUG_ID;
//        this.DRUG_NAME = DRUG_NAME;
//        this.MOA = MOA;
//        this.PO_DOSE = PO_DOSE;
//        this.IV_DOSE = IV_DOSE;
//        this.CCB_OVERDOSE = CCB_OVERDOSE;
//        this.DKA_HHS = DKA_HHS;
//        this.PROCEDURAL_SEDATION = PROCEDURAL_SEDATION;
//        this.RSI_INDICATION = RSI_INDICATION;
//        this.USUAL_CONTINOUS_INFUSION = USUAL_CONTINOUS_INFUSION;
//        this.CONTINOUS_INFUSION = CONTINOUS_INFUSION;
//        this.PULSELESS_TORSADES = PULSELESS_TORSADES;
//        this.ASTHMA_EXACERBATION = ASTHMA_EXACERBATION;
//        this.HYPER_SENSITIVITY_REACTION = HYPER_SENSITIVITY_REACTION;
//        this.PCP_PNA = PCP_PNA;
//        this.SULFONYLUREA_TOXICITY = SULFONYLUREA_TOXICITY;
//        this.VENTILATOR_SEDATION = VENTILATOR_SEDATION;
//        this.TCA_TOXICITY = TCA_TOXICITY;
//        this.SALICYLATE_TOXICITY = SALICYLATE_TOXICITY;
//        this.EMERGENT_INDICATIONS = EMERGENT_INDICATIONS;
//        this.WHERE_YOU_WILL_GET_IN_TROUBLE = WHERE_YOU_WILL_GET_IN_TROUBLE;
//    }


    public String getADULT_BRADYCARDIA() {
        return ADULT_BRADYCARDIA;
    }

    public void setADULT_BRADYCARDIA(String ADULT_BRADYCARDIA) {
        this.ADULT_BRADYCARDIA = ADULT_BRADYCARDIA;
    }

    public String getANAPHYLAXIS() {
        return ANAPHYLAXIS;
    }

    public void setANAPHYLAXIS(String ANAPHYLAXIS) {
        this.ANAPHYLAXIS = ANAPHYLAXIS;
    }

    public String getPEDS_ANAPHYLAXIS() {
        return PEDS_ANAPHYLAXIS;
    }

    public void setPEDS_ANAPHYLAXIS(String PEDS_ANAPHYLAXIS) {
        this.PEDS_ANAPHYLAXIS = PEDS_ANAPHYLAXIS;
    }

    public String getHYPER_TENSION_REFACTORY() {
        return HYPER_TENSION_REFACTORY;
    }

    public void setHYPER_TENSION_REFACTORY(String HYPER_TENSION_REFACTORY) {
        this.HYPER_TENSION_REFACTORY = HYPER_TENSION_REFACTORY;
    }

    public int getDRUG_ID() {
        return DRUG_ID;
    }

    public String getDRUG_NAME() {
        return DRUG_NAME;
    }

    public String getMOA() {
        return MOA;
    }

    public String getPO_DOSE() {
        return PO_DOSE;
    }

    public String getIV_DOSE() {
        return IV_DOSE;
    }

    public String getCCB_OVERDOSE() {
        return CCB_OVERDOSE;
    }

    public String getDKA_HHS() {
        return DKA_HHS;
    }

    public String getPROCEDURAL_SEDATION() {
        return PROCEDURAL_SEDATION;
    }

    public String getRSI_INDICATION() {
        return RSI_INDICATION;
    }

    public String getUSUAL_CONTINOUS_INFUSION() {
        return USUAL_CONTINOUS_INFUSION;
    }

    public String getCONTINOUS_INFUSION() {
        return CONTINOUS_INFUSION;
    }

    public String getPULSELESS_TORSADES() {
        return PULSELESS_TORSADES;
    }

    public String getASTHMA_EXACERBATION() {
        return ASTHMA_EXACERBATION;
    }

    public String getHYPER_SENSITIVITY_REACTION() {
        return HYPER_SENSITIVITY_REACTION;
    }

    public String getPCP_PNA() {
        return PCP_PNA;
    }

    public String getSULFONYLUREA_TOXICITY() {
        return SULFONYLUREA_TOXICITY;
    }

    public String getVENTILATOR_SEDATION() {
        return VENTILATOR_SEDATION;
    }

    public String getTCA_TOXICITY() {
        return TCA_TOXICITY;
    }

    public String getSALICYLATE_TOXICITY() {
        return SALICYLATE_TOXICITY;
    }

    public String getEMERGENT_INDICATIONS() {
        return EMERGENT_INDICATIONS;
    }

    public String getWHERE_YOU_WILL_GET_IN_TROUBLE() {
        return WHERE_YOU_WILL_GET_IN_TROUBLE;
    }

    public void setDRUG_ID(int DRUG_ID) {
        this.DRUG_ID = DRUG_ID;
    }

    public void setDRUG_NAME(String DRUG_NAME) {
        this.DRUG_NAME = DRUG_NAME;
    }

    public void setMOA(String MOA) {
        this.MOA = MOA;
    }

    public void setPO_DOSE(String PO_DOSE) {
        this.PO_DOSE = PO_DOSE;
    }

    public void setIV_DOSE(String IV_DOSE) {
        this.IV_DOSE = IV_DOSE;
    }

    public void setCCB_OVERDOSE(String CCB_OVERDOSE) {
        this.CCB_OVERDOSE = CCB_OVERDOSE;
    }

    public void setDKA_HHS(String DKA_HHS) {
        this.DKA_HHS = DKA_HHS;
    }

    public void setPROCEDURAL_SEDATION(String PROCEDURAL_SEDATION) {
        this.PROCEDURAL_SEDATION = PROCEDURAL_SEDATION;
    }

    public void setRSI_INDICATION(String RSI_INDICATION) {
        this.RSI_INDICATION = RSI_INDICATION;
    }

    public void setUSUAL_CONTINOUS_INFUSION(String USUAL_CONTINOUS_INFUSION) {
        this.USUAL_CONTINOUS_INFUSION = USUAL_CONTINOUS_INFUSION;
    }

    public void setCONTINOUS_INFUSION(String CONTINOUS_INFUSION) {
        this.CONTINOUS_INFUSION = CONTINOUS_INFUSION;
    }

    public void setPULSELESS_TORSADES(String PULSELESS_TORSADES) {
        this.PULSELESS_TORSADES = PULSELESS_TORSADES;
    }

    public void setASTHMA_EXACERBATION(String ASTHMA_EXACERBATION) {
        this.ASTHMA_EXACERBATION = ASTHMA_EXACERBATION;
    }

    public void setHYPER_SENSITIVITY_REACTION(String HYPER_SENSITIVITY_REACTION) {
        this.HYPER_SENSITIVITY_REACTION = HYPER_SENSITIVITY_REACTION;
    }

    public void setPCP_PNA(String PCP_PNA) {
        this.PCP_PNA = PCP_PNA;
    }

    public void setSULFONYLUREA_TOXICITY(String SULFONYLUREA_TOXICITY) {
        this.SULFONYLUREA_TOXICITY = SULFONYLUREA_TOXICITY;
    }

    public void setVENTILATOR_SEDATION(String VENTILATOR_SEDATION) {
        this.VENTILATOR_SEDATION = VENTILATOR_SEDATION;
    }

    public void setTCA_TOXICITY(String TCA_TOXICITY) {
        this.TCA_TOXICITY = TCA_TOXICITY;
    }

    public void setSALICYLATE_TOXICITY(String SALICYLATE_TOXICITY) {
        this.SALICYLATE_TOXICITY = SALICYLATE_TOXICITY;
    }

    public void setEMERGENT_INDICATIONS(String EMERGENT_INDICATIONS) {
        this.EMERGENT_INDICATIONS = EMERGENT_INDICATIONS;
    }

    public void setWHERE_YOU_WILL_GET_IN_TROUBLE(String WHERE_YOU_WILL_GET_IN_TROUBLE) {
        this.WHERE_YOU_WILL_GET_IN_TROUBLE = WHERE_YOU_WILL_GET_IN_TROUBLE;
    }
}
