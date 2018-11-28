package medicalapp.irfanullah.com.medicalapp.Models;

public class DiseaseModel {


    private int DISEASE_ID;
    private String DISEASE_NAME;
    private String WHAT_IS_IT;
    private String WHERE_IS_IT_FOUND;
    private String HOW_IS_THE_DISEASE_SPREAD;
    private String STAGES_OF_DISEASES;
    private String TREATMENT;
    private String PREVENTION;

    public int getDISEASE_ID() {
        return DISEASE_ID;
    }

    public void setDISEASE_ID(int DISEASE_ID) {
        this.DISEASE_ID = DISEASE_ID;
    }

    public String getDISEASE_NAME() {
        return DISEASE_NAME;
    }

    public void setDISEASE_NAME(String DISEASE_NAME) {
        this.DISEASE_NAME = DISEASE_NAME;
    }

    public String getWHAT_IS_IT() {
        return WHAT_IS_IT;
    }

    public void setWHAT_IS_IT(String WHAT_IS_IT) {
        this.WHAT_IS_IT = WHAT_IS_IT;
    }

    public String getWHERE_IS_IT_FOUND() {
        return WHERE_IS_IT_FOUND;
    }

    public void setWHERE_IS_IT_FOUND(String WHERE_IS_IT_FOUND) {
        this.WHERE_IS_IT_FOUND = WHERE_IS_IT_FOUND;
    }

    public String getHOW_IS_THE_DISEASE_SPREAD() {
        return HOW_IS_THE_DISEASE_SPREAD;
    }

    public void setHOW_IS_THE_DISEASE_SPREAD(String HOW_IS_THE_DISEASE_SPREAD) {
        this.HOW_IS_THE_DISEASE_SPREAD = HOW_IS_THE_DISEASE_SPREAD;
    }

    public String getSTAGES_OF_DISEASES() {
        return STAGES_OF_DISEASES;
    }

    public void setSTAGES_OF_DISEASES(String STAGES_OF_DISEASES) {
        this.STAGES_OF_DISEASES = STAGES_OF_DISEASES;
    }

    public String getTREATMENT() {
        return TREATMENT;
    }

    public void setTREATMENT(String TREATMENT) {
        this.TREATMENT = TREATMENT;
    }

    public String getPREVENTION() {
        return PREVENTION;
    }

    public void setPREVENTION(String PREVENTION) {
        this.PREVENTION = PREVENTION;
    }
}
