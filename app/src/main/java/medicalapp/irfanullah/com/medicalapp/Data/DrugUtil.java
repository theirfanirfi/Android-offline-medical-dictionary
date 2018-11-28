package medicalapp.irfanullah.com.medicalapp.Data;

import java.util.ArrayList;

import medicalapp.irfanullah.com.medicalapp.DrugModel;

public class DrugUtil {

    public ArrayList<DrugModel> getDrugs()
    {
        ArrayList<DrugModel> drugModel = new ArrayList<>();

        DrugModel d1 = new DrugModel();
        d1.setDRUG_ID(1);
        d1.setDRUG_NAME("Acetylcysteine – Mucomyst");
        d1.setMOA("replenishes glutathione stores, serves as glutathione substitute, and enhances sulfate \n" +
                "conjugation of acetaminophen (Tylenol) \n");
        d1.setDOSE("");
        d1.setPO_DOSE("140 mg/kg x 1, then 70 mg/kg q 4 hours x 17 doses (72 hours total)");
        d1.setIV_DOSE("150 mg/kg in 200ml D5W over 1 hour, 50 mg/kg in 500ml D5W over 4 hours, \n" +
                "100 mg/kg in 1 liter D5W over 16 hours (21 total hours, may need to continue until LFTs and \n" +
                "APAP level normalize)\n");
        d1.setCCB_OVERDOSE("");
        d1.setDKA_HHS("");
        d1.setPROCEDURAL_SEDATION("");
        d1.setRSI_INDICATION("");
        d1.setUSUAL_CONTINOUS_INFUSION("");
        d1.setCONTINOUS_INFUSION("");
        d1.setPULSELESS_TORSADES("");
        d1.setASTHMA_EXACERBATION("");
        d1.setHYPER_SENSITIVITY_REACTION("");
        d1.setPCP_PNA("");
        d1.setSULFONYLUREA_TOXICITY("");
        d1.setVENTILATOR_SEDATION("");
        d1.setTCA_TOXICITY("");
        d1.setSALICYLATE_TOXICITY("");
        d1.setEMERGENT_INDICATIONS("acetaminophen (Tylenol) overdose");
        d1.setWHERE_YOU_WILL_GET_IN_TROUBLE("hypersensitivity reaction (stop infusion, switch to PO or slow \n" +
                "infusion rate), while rare, you can also see hypersensitivity with PO as well, Preg B\n");
        d1.setADULT_BRADYCARDIA("");
        d1.setANAPHYLAXIS("");
        d1.setPEDS_ANAPHYLAXIS("");
        d1.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d1);



        //2

        DrugModel d2 = new DrugModel();
        d2.setDRUG_ID(2);
        d2.setDRUG_NAME("Adenosine - Adenocard/Adenoscan");
        d2.setMOA("acts on A1 receptors in AV node causing temporary heart block");
        d2.setPO_DOSE("");
        d2.setIV_DOSE("");
        d2.setDOSE("");
        d2.setCCB_OVERDOSE("");
        d2.setDKA_HHS("");
        d2.setPROCEDURAL_SEDATION("");
        d2.setRSI_INDICATION("");
        d2.setUSUAL_CONTINOUS_INFUSION("");
        d2.setCONTINOUS_INFUSION("");
        d2.setPULSELESS_TORSADES("");
        d2.setASTHMA_EXACERBATION("");
        d2.setHYPER_SENSITIVITY_REACTION("");
        d2.setPCP_PNA("");
        d2.setSULFONYLUREA_TOXICITY("");
        d2.setVENTILATOR_SEDATION("");
        d2.setTCA_TOXICITY("");
        d2.setSALICYLATE_TOXICITY("");
        d2.setEMERGENT_INDICATIONS("stable SVT, stable narrow complex tachycardias");
        d2.setWHERE_YOU_WILL_GET_IN_TROUBLE("Where you’ll get in Trouble: prodysrhythmic, do not give in preexisting 2nd or 3rd degree block, Preg C");
        d2.setADULT_BRADYCARDIA("");
        d2.setANAPHYLAXIS("");
        d2.setPEDS_ANAPHYLAXIS("");
        d2.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d2);



        //3

        DrugModel d3 = new DrugModel();
        d3.setDRUG_ID(3);
        d3.setDRUG_NAME("Albuterol - Proventil, ProAir, Ventolin ");
        d3.setMOA("selective beta2 agonist");
        d3.setPO_DOSE("");
        d3.setDOSE("2.5 - 5 mg q 20 minutes for 1st hour, then 2.5-10 mg q 1-4 hours prn (alt, 10-15 mg \n" +
                "over 1 hour)\n");
        d3.setIV_DOSE("");
        d3.setCCB_OVERDOSE("");
        d3.setDKA_HHS("");
        d3.setPROCEDURAL_SEDATION("");
        d3.setRSI_INDICATION("");
        d3.setUSUAL_CONTINOUS_INFUSION("");
        d3.setCONTINOUS_INFUSION("");
        d3.setPULSELESS_TORSADES("");
        d3.setASTHMA_EXACERBATION("");
        d3.setHYPER_SENSITIVITY_REACTION("");
        d3.setPCP_PNA("");
        d3.setSULFONYLUREA_TOXICITY("");
        d3.setVENTILATOR_SEDATION("");
        d3.setTCA_TOXICITY("");
        d3.setSALICYLATE_TOXICITY("");
        d3.setEMERGENT_INDICATIONS("acute bronchospasm, hyperkalemia");
        d3.setWHERE_YOU_WILL_GET_IN_TROUBLE("tachycardia, hyperglycemia, hypokalemia, Preg C\n" +
                "Albuterol - Proventil, ProAir, Ventolin\n");
        d3.setADULT_BRADYCARDIA("");
        d3.setANAPHYLAXIS("");
        d3.setPEDS_ANAPHYLAXIS("");
        d3.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d3);



        //4

        DrugModel d4 = new DrugModel();

        d4.setDRUG_ID(4);
        d4.setDRUG_NAME("Amiodarone – Pacerone");
        d4.setMOA("blocks K efflux (Class III antidysrhythmic); also has Na channel blocking (class I), \n" +
                "beta blocking (class II), and Ca channel blocking (class IV) properties\n");
        d4.setPO_DOSE("");
        d4.setDOSE("Pulseless VF/VT: 300mg IV rapid push followed by 150mg IV rapid push if necessary at \n" +
                "next pulse check\n");
        d4.setIV_DOSE("");
        d4.setCCB_OVERDOSE("");
        d4.setDKA_HHS("");
        d4.setPROCEDURAL_SEDATION("");
        d4.setRSI_INDICATION("");
        d4.setUSUAL_CONTINOUS_INFUSION("");
        d4.setCONTINOUS_INFUSION("");
        d4.setPULSELESS_TORSADES("");
        d4.setASTHMA_EXACERBATION("");
        d4.setHYPER_SENSITIVITY_REACTION("");
        d4.setPCP_PNA("");
        d4.setSULFONYLUREA_TOXICITY("");
        d4.setVENTILATOR_SEDATION("");
        d4.setTCA_TOXICITY("");
        d4.setSALICYLATE_TOXICITY("");
        d4.setEMERGENT_INDICATIONS("pulseless VF/VT, Wide complex tachydysrhythmias");
        d4.setWHERE_YOU_WILL_GET_IN_TROUBLE("Causes hypotension, prodysrhythmic, Preg D");
        d4.setADULT_BRADYCARDIA("");
        d4.setANAPHYLAXIS("");
        d4.setPEDS_ANAPHYLAXIS("");
        d4.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d4);


        //5

        DrugModel d5 = new DrugModel();
        d5.setDRUG_ID(5);
        d5.setDRUG_NAME("Atropine – AtroPen");
        d5.setMOA("direct anticholinergic");
        d5.setPO_DOSE("");
        d5.setDOSE("Organophosphate/carbamate toxicity: 1-6 mg IV q 3-5 minutes PRN, until dry \n" +
                "secretions (can double dose each time until adequate response achieved) \n");
        d5.setIV_DOSE("");
        d5.setCCB_OVERDOSE("");
        d5.setDKA_HHS("");
        d5.setPROCEDURAL_SEDATION("");
        d5.setRSI_INDICATION("");
        d5.setUSUAL_CONTINOUS_INFUSION("");
        d5.setCONTINOUS_INFUSION("");
        d5.setPULSELESS_TORSADES("");
        d5.setASTHMA_EXACERBATION("");
        d5.setHYPER_SENSITIVITY_REACTION("");
        d5.setPCP_PNA("");
        d5.setSULFONYLUREA_TOXICITY("");
        d5.setVENTILATOR_SEDATION("");
        d5.setTCA_TOXICITY("");
        d5.setSALICYLATE_TOXICITY("");
        d5.setEMERGENT_INDICATIONS("Organophosphate/carbamate toxicity, bradycardia");
        d5.setWHERE_YOU_WILL_GET_IN_TROUBLE("hyperthermic patients, tachydysrhythmias, Preg C");
        d5.setADULT_BRADYCARDIA("0.5 mg IV, 3 mg max cumulative dose ");
        d5.setANAPHYLAXIS("");
        d5.setPEDS_ANAPHYLAXIS("");
        d5.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d5);


        //6

        DrugModel d6 = new DrugModel();
        d6.setDRUG_ID(6);
        d6.setDRUG_NAME("Calcium Gluconate/Chloride");
        d6.setMOA("increases serum calcium, stabilizes cardiac myocytes ");
        d6.setPO_DOSE("");
        d6.setDOSE("10% IV solution (gluconate or chloride) contains 1 gram per 10 mL");
        d6.setIV_DOSE("");
        d6.setCCB_OVERDOSE("");
        d6.setDKA_HHS("");
        d6.setPROCEDURAL_SEDATION("");
        d6.setRSI_INDICATION("");
        d6.setUSUAL_CONTINOUS_INFUSION("");
        d6.setCONTINOUS_INFUSION("");
        d6.setPULSELESS_TORSADES("");
        d6.setASTHMA_EXACERBATION("");
        d6.setHYPER_SENSITIVITY_REACTION("");
        d6.setPCP_PNA("");
        d6.setSULFONYLUREA_TOXICITY("");
        d6.setVENTILATOR_SEDATION("");
        d6.setTCA_TOXICITY("");
        d6.setSALICYLATE_TOXICITY("");
        d6.setEMERGENT_INDICATIONS("hyperkalemia, hypocalcemia with dysrhythmia");
        d6.setWHERE_YOU_WILL_GET_IN_TROUBLE("dysrhythmia, tetany, calcium chloride 3x more potent than \n" +
                "calcium gluconate (severe phlebitis with peripheral administration of calcium chloride), Preg C\n");
        d6.setADULT_BRADYCARDIA("");
        d6.setANAPHYLAXIS("");
        d6.setPEDS_ANAPHYLAXIS("");
        d6.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d6);


        //7

        DrugModel d7 = new DrugModel();
        d7.setDRUG_ID(7);
        d7.setDRUG_NAME("Diazepam – Valium");
        d7.setMOA("enhances inhibitory effects of GABA ");
        d7.setPO_DOSE("");
        d7.setDOSE("2-10 mg PO/IV/IM q 6 hours PRN");
        d7.setIV_DOSE("");
        d7.setCCB_OVERDOSE("");
        d7.setDKA_HHS("");
        d7.setPROCEDURAL_SEDATION("");
        d7.setRSI_INDICATION("");
        d7.setUSUAL_CONTINOUS_INFUSION("");
        d7.setCONTINOUS_INFUSION("");
        d7.setPULSELESS_TORSADES("");
        d7.setASTHMA_EXACERBATION("");
        d7.setHYPER_SENSITIVITY_REACTION("");
        d7.setPCP_PNA("");
        d7.setSULFONYLUREA_TOXICITY("");
        d7.setVENTILATOR_SEDATION("");
        d7.setTCA_TOXICITY("");
        d7.setSALICYLATE_TOXICITY("");
        d7.setEMERGENT_INDICATIONS("Seizure abortion, alcohol withdrawal, agitation, muscle spasm");
        d7.setWHERE_YOU_WILL_GET_IN_TROUBLE("respiratory depression, hypotension, Preg D");
        d7.setADULT_BRADYCARDIA("");
        d7.setANAPHYLAXIS("");
        d7.setPEDS_ANAPHYLAXIS("");
        d7.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d7);


        //8

        DrugModel d8 = new DrugModel();
        d8.setDRUG_ID(8);
        d8.setDRUG_NAME("Diltiazem – Cardizem");
        d8.setMOA("inhibits calcium influx in myocardium > vascular smooth muscle; \n" +
                "prolongs AV nodal conduction\n");
        d8.setPO_DOSE("");
        d8.setDOSE("0.25 mg/kg IV x1; may give 0.35 mg/kg IV x1 after 15 minutes");
        d8.setIV_DOSE("");
        d8.setCCB_OVERDOSE("");
        d8.setDKA_HHS("");
        d8.setPROCEDURAL_SEDATION("");
        d8.setRSI_INDICATION("");
        d8.setUSUAL_CONTINOUS_INFUSION("");
        d8.setCONTINOUS_INFUSION("continuous infusion 5-15 mg/hr");
        d8.setPULSELESS_TORSADES("");
        d8.setASTHMA_EXACERBATION("");
        d8.setHYPER_SENSITIVITY_REACTION("");
        d8.setPCP_PNA("");
        d8.setSULFONYLUREA_TOXICITY("");
        d8.setVENTILATOR_SEDATION("");
        d8.setTCA_TOXICITY("");
        d8.setSALICYLATE_TOXICITY("");
        d8.setEMERGENT_INDICATIONS("stable Afib with RVR, stable SVT");
        d8.setWHERE_YOU_WILL_GET_IN_TROUBLE("iatrogenic hypotension, bradycardia, Preg C");
        d8.setADULT_BRADYCARDIA("");
        d8.setANAPHYLAXIS("");
        d8.setPEDS_ANAPHYLAXIS("");
        d8.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d8);


        //9

        DrugModel d9 = new DrugModel();
        d9.setDRUG_ID(9);
        d9.setDRUG_NAME("Dobutamine");
        d9.setMOA("beta1 agonist > beta2 agonist");
        d9.setPO_DOSE("");
        d9.setDOSE("2-20mcg/kg/min IV ");
        d9.setIV_DOSE("");
        d9.setCCB_OVERDOSE("");
        d9.setDKA_HHS("");
        d9.setPROCEDURAL_SEDATION("");
        d9.setRSI_INDICATION("");
        d9.setUSUAL_CONTINOUS_INFUSION("");
        d9.setCONTINOUS_INFUSION("");
        d9.setPULSELESS_TORSADES("");
        d9.setASTHMA_EXACERBATION("");
        d9.setHYPER_SENSITIVITY_REACTION("");
        d9.setPCP_PNA("");
        d9.setSULFONYLUREA_TOXICITY("");
        d9.setVENTILATOR_SEDATION("");
        d9.setTCA_TOXICITY("");
        d9.setSALICYLATE_TOXICITY("");
        d9.setEMERGENT_INDICATIONS("decompensated heart failure, refractory hypotension");
        d9.setWHERE_YOU_WILL_GET_IN_TROUBLE("tachycardia, hypotension if not euvolemic, PVCs, Preg B");
        d9.setADULT_BRADYCARDIA("");
        d9.setANAPHYLAXIS("");
        d9.setPEDS_ANAPHYLAXIS("");
        d9.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d9);

        //10

        DrugModel d10 = new DrugModel();
        d10.setDRUG_ID(10);
        d10.setDRUG_NAME("Dopamine");
        d10.setMOA("alpha1, beta1, and dopaminergic agonist");
        d10.setPO_DOSE("");
        d10.setDOSE("< 5 mcg/kg/min IV dopaminergic effects (not recommended)\n" +
                "5-10 mcg/kg/min IV primarily beta effects\n" +
                "10-20 mcg/kg/min IV primarily alpha effects\n");
        d10.setIV_DOSE("");
        d10.setCCB_OVERDOSE("");
        d10.setDKA_HHS("");
        d10.setPROCEDURAL_SEDATION("");
        d10.setRSI_INDICATION("");
        d10.setUSUAL_CONTINOUS_INFUSION("");
        d10.setCONTINOUS_INFUSION("");
        d10.setPULSELESS_TORSADES("");
        d10.setASTHMA_EXACERBATION("");
        d10.setHYPER_SENSITIVITY_REACTION("");
        d10.setPCP_PNA("");
        d10.setSULFONYLUREA_TOXICITY("");
        d10.setVENTILATOR_SEDATION("");
        d10.setTCA_TOXICITY("");
        d10.setSALICYLATE_TOXICITY("");
        d10.setEMERGENT_INDICATIONS("decompensated heart failure, hypotension ");
        d10.setWHERE_YOU_WILL_GET_IN_TROUBLE("tachydysrhythmias, tissue necrosis if extravasation or \n" +
                "arterial administration therefore needs to be given through central venous line, Preg C\n");
        d10.setADULT_BRADYCARDIA("");
        d10.setANAPHYLAXIS("");
        d10.setPEDS_ANAPHYLAXIS("");
        d10.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d10);


        //11

        DrugModel d11 = new DrugModel();
        d11.setDRUG_ID(11);
        d11.setDRUG_NAME("Droperidol – Inapsine");
        d11.setMOA("antagonizes dopamine and alpha adrenergic receptors");
        d11.setPO_DOSE("");
        d11.setDOSE("1.25 - 2.5mg IV q 4 hours PRN");
        d11.setIV_DOSE("");
        d11.setCCB_OVERDOSE("");
        d11.setDKA_HHS("");
        d11.setPROCEDURAL_SEDATION("");
        d11.setRSI_INDICATION("");
        d11.setUSUAL_CONTINOUS_INFUSION("");
        d11.setCONTINOUS_INFUSION("");
        d11.setPULSELESS_TORSADES("");
        d11.setASTHMA_EXACERBATION("");
        d11.setHYPER_SENSITIVITY_REACTION("");
        d11.setPCP_PNA("");
        d11.setSULFONYLUREA_TOXICITY("");
        d11.setVENTILATOR_SEDATION("");
        d11.setTCA_TOXICITY("");
        d11.setSALICYLATE_TOXICITY("");
        d11.setEMERGENT_INDICATIONS("vomiting prevention, migraine abortion");
        d11.setWHERE_YOU_WILL_GET_IN_TROUBLE("QT prolongation (Torsades), NMS, extrapyramidal side effects, Preg C");
        d11.setADULT_BRADYCARDIA("");
        d11.setANAPHYLAXIS("");
        d11.setPEDS_ANAPHYLAXIS("");
        d11.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d11);


        //12

        DrugModel d12 = new DrugModel();
        d12.setDRUG_ID(12);
        d12.setDRUG_NAME("Epinephrine - EpiPen, Adrenalin");
        d12.setMOA("alpha and beta receptor agonist");
        d12.setPO_DOSE("");
        d12.setDOSE("\n ACLS:  1 mg 1:10,000 IV PALS: 0.01 mg/kg 1:10,000 IV");
        d12.setIV_DOSE("");
        d12.setCCB_OVERDOSE("");
        d12.setDKA_HHS("");
        d12.setPROCEDURAL_SEDATION("");
        d12.setRSI_INDICATION("");
        d12.setUSUAL_CONTINOUS_INFUSION("");
        d12.setCONTINOUS_INFUSION("");
        d12.setPULSELESS_TORSADES("");
        d12.setASTHMA_EXACERBATION("");
        d12.setHYPER_SENSITIVITY_REACTION("");
        d12.setPCP_PNA("");
        d12.setSULFONYLUREA_TOXICITY("");
        d12.setVENTILATOR_SEDATION("");
        d12.setTCA_TOXICITY("");
        d12.setSALICYLATE_TOXICITY("");
        d12.setEMERGENT_INDICATIONS("anaphylaxis, ACLS arrest, PALS/NRP arrest, severe asthma");
        d12.setWHERE_YOU_WILL_GET_IN_TROUBLE("dosing errors (10 fold errors), tissue necrosis (needs to \n" +
                "administered via central venous line), dysrhythmias, Preg C\n");
        d12.setADULT_BRADYCARDIA("");
        d12.setANAPHYLAXIS("0.1-0.5 mg 1:1,000 IM/SQ (IM preferred)");
        d12.setPEDS_ANAPHYLAXIS("0.01 mg/kg 1:1,000 IM/SQ (max single dose 0.3 mg)");
        d12.setHYPER_TENSION_REFACTORY(" 1-10 mcg/min IV ");

        drugModel.add(d12);


        //13

        DrugModel d13 = new DrugModel();
        d13.setDRUG_ID(13);
        d13.setDRUG_NAME("Enoxaparin – Lovenox");
        d13.setMOA("binds to antithrombin III and inactivates factor Xa > thrombin");
        d13.setPO_DOSE("");
        d13.setDOSE("1 mg/kg SQ q 12hours OR 1.5 mg/kg SQ q 24hours");
        d13.setIV_DOSE("");
        d13.setCCB_OVERDOSE("");
        d13.setDKA_HHS("");
        d13.setPROCEDURAL_SEDATION("");
        d13.setRSI_INDICATION("");
        d13.setUSUAL_CONTINOUS_INFUSION("");
        d13.setCONTINOUS_INFUSION("");
        d13.setPULSELESS_TORSADES("");
        d13.setASTHMA_EXACERBATION("");
        d13.setHYPER_SENSITIVITY_REACTION("");
        d13.setPCP_PNA("");
        d13.setSULFONYLUREA_TOXICITY("");
        d13.setVENTILATOR_SEDATION("");
        d13.setTCA_TOXICITY("");
        d13.setSALICYLATE_TOXICITY("");
        d13.setEMERGENT_INDICATIONS(" PE, NSTEMI, unstable angina");
        d13.setWHERE_YOU_WILL_GET_IN_TROUBLE("monitor anti Xa levels in renal impairment or obesity \n" +
                "(> 150 kg actual body weight), concomitant use with spinal anesthesia/analgesia or spinal \n" +
                "puncture is an absolute contraindication (black box warning), Preg B \n");
        d13.setADULT_BRADYCARDIA("");
        d13.setANAPHYLAXIS("");
        d13.setPEDS_ANAPHYLAXIS("");
        d13.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d13);

        //14

        DrugModel d14 = new DrugModel();
        d14.setDRUG_ID(14);
        d14.setDRUG_NAME("Esmolol – Brevibloc");
        d14.setMOA("selective beta1 antagonist");
        d14.setPO_DOSE("");
        d14.setDOSE("500 mcg/kg loading dose, then continuous infusion of 50-300 mcg/kg/min");
        d14.setIV_DOSE("");
        d14.setCCB_OVERDOSE("");
        d14.setDKA_HHS("");
        d14.setPROCEDURAL_SEDATION("");
        d14.setRSI_INDICATION("");
        d14.setUSUAL_CONTINOUS_INFUSION("");
        d14.setCONTINOUS_INFUSION("");
        d14.setPULSELESS_TORSADES("");
        d14.setASTHMA_EXACERBATION("");
        d14.setHYPER_SENSITIVITY_REACTION("");
        d14.setPCP_PNA("");
        d14.setSULFONYLUREA_TOXICITY("");
        d14.setVENTILATOR_SEDATION("");
        d14.setTCA_TOXICITY("");
        d14.setSALICYLATE_TOXICITY("");
        d14.setEMERGENT_INDICATIONS("aortic dissection");
        d14.setWHERE_YOU_WILL_GET_IN_TROUBLE("precipitated CHF, hypotension, bronchospasm, Preg C");
        d14.setADULT_BRADYCARDIA("");
        d14.setANAPHYLAXIS("");
        d14.setPEDS_ANAPHYLAXIS("");
        d14.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d14);



        //15

        DrugModel d15 = new DrugModel();
        d15.setDRUG_ID(15);
        d15.setDRUG_NAME("Esomeprazole – Nexium");
        d15.setMOA("inhibits parietal cell hydrogen-potassium ATPase (PPI)");
        d15.setPO_DOSE("");
        d15.setDOSE("80 mg IV bolus followed by 8 mg/hour");
        d15.setIV_DOSE("");
        d15.setCCB_OVERDOSE("");
        d15.setDKA_HHS("");
        d15.setPROCEDURAL_SEDATION("");
        d15.setRSI_INDICATION("");
        d15.setUSUAL_CONTINOUS_INFUSION("");
        d15.setCONTINOUS_INFUSION("");
        d15.setPULSELESS_TORSADES("");
        d15.setASTHMA_EXACERBATION("");
        d15.setHYPER_SENSITIVITY_REACTION("");
        d15.setPCP_PNA("");
        d15.setSULFONYLUREA_TOXICITY("");
        d15.setVENTILATOR_SEDATION("");
        d15.setTCA_TOXICITY("");
        d15.setSALICYLATE_TOXICITY("");
        d15.setEMERGENT_INDICATIONS("Upper GI bleed (non-variceal)");
        d15.setWHERE_YOU_WILL_GET_IN_TROUBLE("fairly benign when used acutely, Preg B");
        d15.setADULT_BRADYCARDIA("");
        d15.setANAPHYLAXIS("");
        d15.setPEDS_ANAPHYLAXIS("");
        d15.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d15);


        //16
        DrugModel d16 = new DrugModel();
        d16.setDRUG_ID(16);
        d16.setDRUG_NAME("Etomidate – Amidate");
        d16.setMOA("GABA-like effects on brain stem reticular formation causing hypnosis");
        d16.setPO_DOSE("");
        d16.setDOSE("0.3 mg/kg IV");
        d16.setIV_DOSE("");
        d16.setCCB_OVERDOSE("");
        d16.setDKA_HHS("");
        d16.setPROCEDURAL_SEDATION("");
        d16.setRSI_INDICATION("");
        d16.setUSUAL_CONTINOUS_INFUSION("");
        d16.setCONTINOUS_INFUSION("");
        d16.setPULSELESS_TORSADES("");
        d16.setASTHMA_EXACERBATION("");
        d16.setHYPER_SENSITIVITY_REACTION("");
        d16.setPCP_PNA("");
        d16.setSULFONYLUREA_TOXICITY("");
        d16.setVENTILATOR_SEDATION("");
        d16.setTCA_TOXICITY("");
        d16.setSALICYLATE_TOXICITY("");
        d16.setEMERGENT_INDICATIONS("RSI induction");
        d16.setWHERE_YOU_WILL_GET_IN_TROUBLE("cortisol depression (questionable clinical significance for \n" +
                "single administration), lowers seizure threshold, Preg C\n");
        d16.setADULT_BRADYCARDIA("");
        d16.setANAPHYLAXIS("");
        d16.setPEDS_ANAPHYLAXIS("");
        d16.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d16);


        //17

        DrugModel d17 = new DrugModel();
        d17.setDRUG_ID(17);
        d17.setDRUG_NAME("Fentanyl – Sublimaze");
        d17.setMOA("opioid agonist producing analgesia with adjunctive sedative effects");
        d17.setPO_DOSE("");
        d17.setDOSE("25-100 mcg IV q 1-2 hours; recommended dose 1 mcg/kg");
        d17.setIV_DOSE("");
        d17.setCCB_OVERDOSE("");
        d17.setDKA_HHS("");
        d17.setPROCEDURAL_SEDATION("");
        d17.setRSI_INDICATION("");
        d17.setUSUAL_CONTINOUS_INFUSION("");
        d17.setCONTINOUS_INFUSION("");
        d17.setPULSELESS_TORSADES("");
        d17.setASTHMA_EXACERBATION("");
        d17.setHYPER_SENSITIVITY_REACTION("");
        d17.setPCP_PNA("");
        d17.setSULFONYLUREA_TOXICITY("");
        d17.setVENTILATOR_SEDATION("");
        d17.setTCA_TOXICITY("");
        d17.setSALICYLATE_TOXICITY("");
        d17.setEMERGENT_INDICATIONS("pain control, sedation adjunct");
        d17.setWHERE_YOU_WILL_GET_IN_TROUBLE("respiratory depression, vasodilation (hypotension), \n" +
                "laryngospasm, Preg C\n");
        d17.setADULT_BRADYCARDIA("");
        d17.setANAPHYLAXIS("");
        d17.setPEDS_ANAPHYLAXIS("");
        d17.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d17);


        //18

        DrugModel d18 = new DrugModel();
        d18.setDRUG_ID(18);
        d18.setDRUG_NAME("Fomepizole – Antizol");
        d18.setMOA(" inhibits alcohol dehydrogenase");
        d18.setPO_DOSE("");
        d18.setDOSE("15 mg/kg IV loading dose, then 10 mg/kg q 12 hours x 4 doses, \n" +
                "then 15 mg/kg q 12 hours until ethylene glycol levels < 20 mg/dL and patient asymptomatic \n" +
                "with normal pH\n");
        d18.setIV_DOSE("");
        d18.setCCB_OVERDOSE("");
        d18.setDKA_HHS("");
        d18.setPROCEDURAL_SEDATION("");
        d18.setRSI_INDICATION("");
        d18.setUSUAL_CONTINOUS_INFUSION("");
        d18.setCONTINOUS_INFUSION("");
        d18.setPULSELESS_TORSADES("");
        d18.setASTHMA_EXACERBATION("");
        d18.setHYPER_SENSITIVITY_REACTION("");
        d18.setPCP_PNA("");
        d18.setSULFONYLUREA_TOXICITY("");
        d18.setVENTILATOR_SEDATION("");
        d18.setTCA_TOXICITY("");
        d18.setSALICYLATE_TOXICITY("");
        d18.setEMERGENT_INDICATIONS("methanol or ethylene glycol toxicity");
        d18.setWHERE_YOU_WILL_GET_IN_TROUBLE("fairly safe, Preg C");
        d18.setADULT_BRADYCARDIA("");
        d18.setANAPHYLAXIS("");
        d18.setPEDS_ANAPHYLAXIS("");
        d18.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d18);

        //19

        DrugModel d19 = new DrugModel();
        d19.setDRUG_ID(19);
        d19.setDRUG_NAME("Fosphenytoin – Cerebyx");
        d19.setMOA("stabilizes voltage dependent neuronal Na channels to stop seizure activity");
        d19.setPO_DOSE("");
        d19.setDOSE("15-20 mg/kg IV loading dose administered at 150 mg/min");
        d19.setIV_DOSE("");
        d19.setCCB_OVERDOSE("");
        d19.setDKA_HHS("");
        d19.setPROCEDURAL_SEDATION("");
        d19.setRSI_INDICATION("");
        d19.setUSUAL_CONTINOUS_INFUSION("");
        d19.setCONTINOUS_INFUSION("");
        d19.setPULSELESS_TORSADES("");
        d19.setASTHMA_EXACERBATION("");
        d19.setHYPER_SENSITIVITY_REACTION("");
        d19.setPCP_PNA("");
        d19.setSULFONYLUREA_TOXICITY("");
        d19.setVENTILATOR_SEDATION("");
        d19.setTCA_TOXICITY("");
        d19.setSALICYLATE_TOXICITY("");
        d19.setEMERGENT_INDICATIONS("status epilepticus ");
        d19.setWHERE_YOU_WILL_GET_IN_TROUBLE("rapid administration can cause hypotension or \n" +
                "dysrhythmias, give with patient on monitor, Preg\n");
        d19.setADULT_BRADYCARDIA("");
        d19.setANAPHYLAXIS("");
        d19.setPEDS_ANAPHYLAXIS("");
        d19.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d19);


        //20

        DrugModel d20 = new DrugModel();
        d20.setDRUG_ID(20);
        d20.setDRUG_NAME("Furosemide – Lasix");
        d20.setMOA("inhibits Na and Cl reabsorption in distal renal tubule and ascending loop of Henle");
        d20.setPO_DOSE("");
        d20.setDOSE("usual dose in ED 20-40 mg IV, reassess, increase to desired effect \n" +
                "(maximum single dose 200mg) \n");
        d20.setIV_DOSE("");
        d20.setCCB_OVERDOSE("");
        d20.setDKA_HHS("");
        d20.setPROCEDURAL_SEDATION("");
        d20.setRSI_INDICATION("");
        d20.setUSUAL_CONTINOUS_INFUSION("");
        d20.setCONTINOUS_INFUSION("");
        d20.setPULSELESS_TORSADES("");
        d20.setASTHMA_EXACERBATION("");
        d20.setHYPER_SENSITIVITY_REACTION("");
        d20.setPCP_PNA("");
        d20.setSULFONYLUREA_TOXICITY("");
        d20.setVENTILATOR_SEDATION("");
        d20.setTCA_TOXICITY("");
        d20.setSALICYLATE_TOXICITY("");
        d20.setEMERGENT_INDICATIONS("pulmonary edema, CHF exacerbation, hyperkalemia \n" +
                "(if making urine)\n");
        d20.setWHERE_YOU_WILL_GET_IN_TROUBLE("volume depletion, hypokalemia, metabolic alkalosis, \n" +
                "ototoxicity, Preg C\n");
        d20.setADULT_BRADYCARDIA("");
        d20.setANAPHYLAXIS("");
        d20.setPEDS_ANAPHYLAXIS("");
        d20.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d20);


        //21

        DrugModel d21 = new DrugModel();
        d21.setDRUG_ID(21);
        d21.setDRUG_NAME("Glucagon – GlucaGen");
        d21.setMOA("stimulates cAMP production independent of beta receptor, increases gluconeogenesis \n" +
                "and glycogenolysis\n");
        d21.setPO_DOSE("");
        d21.setDOSE("2.5 - 5 mg q 20 minutes for 1st hour, then 2.5-10 mg q 1-4 hours prn (alt, 10-15 mg \n" +
                "over 1 hour)\n");
        d21.setIV_DOSE("");
        d21.setCCB_OVERDOSE("");
        d21.setDKA_HHS("");
        d21.setPROCEDURAL_SEDATION("");
        d21.setRSI_INDICATION("");
        d21.setUSUAL_CONTINOUS_INFUSION("");
        d21.setCONTINOUS_INFUSION("");
        d21.setPULSELESS_TORSADES("");
        d21.setASTHMA_EXACERBATION("");
        d21.setHYPER_SENSITIVITY_REACTION("");
        d21.setPCP_PNA("");
        d21.setSULFONYLUREA_TOXICITY("");
        d21.setVENTILATOR_SEDATION("");
        d21.setTCA_TOXICITY("");
        d21.setSALICYLATE_TOXICITY("");
        d21.setEMERGENT_INDICATIONS("beta-blocker toxicity, Ca channel blocker toxicity, hypoglycemia ");
        d21.setWHERE_YOU_WILL_GET_IN_TROUBLE("anaphylactoid reaction, can cause hypotension, emesis \n" +
                "(aspiration risk in altered patient), Preg B\n");
        d21.setADULT_BRADYCARDIA("");
        d21.setANAPHYLAXIS("");
        d21.setPEDS_ANAPHYLAXIS("");
        d21.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d21);


        //22

        DrugModel d22 = new DrugModel();
        d22.setDRUG_ID(22);
        d22.setDRUG_NAME("Haloperidol – Haldol");
        d22.setMOA("Antagonist at D1 and D2 receptors");
        d22.setPO_DOSE("");
        d22.setDOSE("5-10 mg PO/IM/IV q 2 hours (max 100 mg/day)");
        d22.setIV_DOSE("");
        d22.setCCB_OVERDOSE("");
        d22.setDKA_HHS("");
        d22.setPROCEDURAL_SEDATION("");
        d22.setRSI_INDICATION("");
        d22.setUSUAL_CONTINOUS_INFUSION("");
        d22.setCONTINOUS_INFUSION("");
        d22.setPULSELESS_TORSADES("");
        d22.setASTHMA_EXACERBATION("");
        d22.setHYPER_SENSITIVITY_REACTION("");
        d22.setPCP_PNA("");
        d22.setSULFONYLUREA_TOXICITY("");
        d22.setVENTILATOR_SEDATION("");
        d22.setTCA_TOXICITY("");
        d22.setSALICYLATE_TOXICITY("");
        d22.setEMERGENT_INDICATIONS("agitation, psychosis");
        d22.setWHERE_YOU_WILL_GET_IN_TROUBLE("do not give for dementia-related psychosis, NMS, EPS, \n" +
                "QT prolongation, Preg C\n");
        d22.setADULT_BRADYCARDIA("");
        d22.setANAPHYLAXIS("");
        d22.setPEDS_ANAPHYLAXIS("");
        d22.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d22);


        //24

        DrugModel d23 = new DrugModel();
        d23.setDRUG_ID(23);
        d23.setDRUG_NAME("Heparin");
        d23.setMOA("binds to antithrombin III thereby potentiating inactivation of thrombin and factors \n" +
                "IX, Xa, XI, XII; prevents fibrinogen → fibrin; preferential inactivation of thrombin over other \n" +
                "clotting factors\n");
        d23.setPO_DOSE("");
        d23.setDOSE("Venous thromboembolism: 80 units/kg IV x 1, then 18 units/kg/hour");
        d23.setIV_DOSE("");
        d23.setCCB_OVERDOSE("");
        d23.setDKA_HHS("");
        d23.setPROCEDURAL_SEDATION("");
        d23.setRSI_INDICATION("");
        d23.setUSUAL_CONTINOUS_INFUSION("");
        d23.setCONTINOUS_INFUSION("");
        d23.setPULSELESS_TORSADES("");
        d23.setASTHMA_EXACERBATION("");
        d23.setHYPER_SENSITIVITY_REACTION("");
        d23.setPCP_PNA("");
        d23.setSULFONYLUREA_TOXICITY("");
        d23.setVENTILATOR_SEDATION("");
        d23.setTCA_TOXICITY("");
        d23.setSALICYLATE_TOXICITY("");
        d23.setEMERGENT_INDICATIONS("thromboembolism; ACS (enoxaparin preferred for NSTEMI) ");
        d23.setWHERE_YOU_WILL_GET_IN_TROUBLE("bleeding (protamine may be given for reversal), dosing \n" +
                "errors, Preg.\n");
        d23.setADULT_BRADYCARDIA("");
        d23.setANAPHYLAXIS("");
        d23.setPEDS_ANAPHYLAXIS("");
        d23.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d23);


        //24

        DrugModel d24 = new DrugModel();
        d24.setDRUG_ID(24);
        d24.setDRUG_NAME("Hydrocortisone – SoluCortef");
        d24.setMOA("produces multiple gluco and mineralocorticoid effects");
        d24.setPO_DOSE("");
        d24.setDOSE("Adrenal insufficiency: 100mg IV bolus, then 50 mg IV q 6 hours x24 hours followed by \n" +
                "a taper \n");
        d24.setIV_DOSE("");
        d24.setCCB_OVERDOSE("");
        d24.setDKA_HHS("");
        d24.setPROCEDURAL_SEDATION("");
        d24.setRSI_INDICATION("");
        d24.setUSUAL_CONTINOUS_INFUSION("");
        d24.setCONTINOUS_INFUSION("");
        d24.setPULSELESS_TORSADES("");
        d24.setASTHMA_EXACERBATION("");
        d24.setHYPER_SENSITIVITY_REACTION("");
        d24.setPCP_PNA("");
        d24.setSULFONYLUREA_TOXICITY("");
        d24.setVENTILATOR_SEDATION("");
        d24.setTCA_TOXICITY("");
        d24.setSALICYLATE_TOXICITY("");
        d24.setEMERGENT_INDICATIONS("acute adrenal insufficiency, status asthmaticus, vasopressor \n" +
                "refractory septic shock\n");
        d24.setWHERE_YOU_WILL_GET_IN_TROUBLE("immunosuppression, hyperglycemia, Preg C");
        d24.setADULT_BRADYCARDIA("");
        d24.setANAPHYLAXIS("");
        d24.setPEDS_ANAPHYLAXIS("");
        d24.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d24);


        //25

        DrugModel d25 = new DrugModel();
        d25.setDRUG_ID(25);
        d25.setDRUG_NAME("Hydromorphone – Dilaudid");
        d25.setMOA("opioid agonist producing analgesia with adjunctive sedative effects");
        d25.setPO_DOSE("");
        d25.setDOSE("1-2 mg IV q 3-6 hours ");
        d25.setIV_DOSE("");
        d25.setCCB_OVERDOSE("");
        d25.setDKA_HHS("");
        d25.setPROCEDURAL_SEDATION("");
        d25.setRSI_INDICATION("");
        d25.setUSUAL_CONTINOUS_INFUSION("");
        d25.setCONTINOUS_INFUSION("");
        d25.setPULSELESS_TORSADES("");
        d25.setASTHMA_EXACERBATION("");
        d25.setHYPER_SENSITIVITY_REACTION("");
        d25.setPCP_PNA("");
        d25.setSULFONYLUREA_TOXICITY("");
        d25.setVENTILATOR_SEDATION("");
        d25.setTCA_TOXICITY("");
        d25.setSALICYLATE_TOXICITY("");
        d25.setEMERGENT_INDICATIONS(" Analgesia");
        d25.setWHERE_YOU_WILL_GET_IN_TROUBLE("Respiratory depression, vasodilation (hypotension), \n" +
                "1 mg of IV Dilaudid is approximately equal to 7 mg of IV morphine, Preg C\n");
        d25.setADULT_BRADYCARDIA("");
        d25.setANAPHYLAXIS("");
        d25.setPEDS_ANAPHYLAXIS("");
        d25.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d25);


        //26

        DrugModel d26 = new DrugModel();
        d26.setDRUG_ID(26);
        d26.setDRUG_NAME("Insulin Regular");
        d26.setMOA("↑ peripheral glucose uptake, increased inotropy, shifts potassium ");
        d26.setPO_DOSE("");
        d26.setDOSE("Hyperkalemia: 5-10 units IV x 1 ");
        d26.setIV_DOSE("");
        d26.setCCB_OVERDOSE("1 unit/kg bolus given with 25 grams of dextrose if initial BG \n" +
                "< 250 mg/dL; then initiate insulin drip at 0.1 – 1 unit/kg/hr titrated to SBP along with \n" +
                "0.5 g/kg/hr of dextrose titrated to maintain BG 100 – 200 mg/dL\n");
        d26.setDKA_HHS("0.1 unit/kg bolus followed by continuous infusion 0.1 unit/kg/hour");
        d26.setPROCEDURAL_SEDATION("");
        d26.setRSI_INDICATION("");
        d26.setUSUAL_CONTINOUS_INFUSION("");
        d26.setCONTINOUS_INFUSION("");
        d26.setPULSELESS_TORSADES("");
        d26.setASTHMA_EXACERBATION("");
        d26.setHYPER_SENSITIVITY_REACTION("");
        d26.setPCP_PNA("");
        d26.setSULFONYLUREA_TOXICITY("");
        d26.setVENTILATOR_SEDATION("");
        d26.setTCA_TOXICITY("");
        d26.setSALICYLATE_TOXICITY("");
        d26.setEMERGENT_INDICATIONS("hyperkalemia, DKA/HHS, CCB overdose");
        d26.setWHERE_YOU_WILL_GET_IN_TROUBLE("hypokalemia, hypoglycemia, only regular insulin can be \n" +
                "given IV, Preg B\n");
        d26.setADULT_BRADYCARDIA("");
        d26.setANAPHYLAXIS("");
        d26.setPEDS_ANAPHYLAXIS("");
        d26.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d26);




        //27

        DrugModel d27 = new DrugModel();
        d27.setDRUG_ID(27);
        d27.setDRUG_NAME("Ketamine – Ketalar");
        d27.setMOA("Acts on cortex and limbic system, NMDA receptor antagonist");
        d27.setPO_DOSE("");
        d27.setDOSE("\n Subdissociative: 0.1-0.5 mg/kg IV");
        d27.setIV_DOSE("");
        d27.setCCB_OVERDOSE("");
        d27.setDKA_HHS("");
        d27.setPROCEDURAL_SEDATION(" 0.5-1 mg/kg IV");
        d27.setRSI_INDICATION("2 mg/kg IV ");
        d27.setUSUAL_CONTINOUS_INFUSION("");
        d27.setCONTINOUS_INFUSION("");
        d27.setPULSELESS_TORSADES("");
        d27.setASTHMA_EXACERBATION("");
        d27.setHYPER_SENSITIVITY_REACTION("");
        d27.setPCP_PNA("");
        d27.setSULFONYLUREA_TOXICITY("");
        d27.setVENTILATOR_SEDATION("");
        d27.setTCA_TOXICITY("");
        d27.setSALICYLATE_TOXICITY("");
        d27.setEMERGENT_INDICATIONS("analgesia, sedation, RSI induction ");
        d27.setWHERE_YOU_WILL_GET_IN_TROUBLE("emergence reactions (treat with benzos or barbs), \n" +
                "laryngospasm, IOP increase, ICP increase, tachycardia, hypertension, Preg D\n");
        d27.setADULT_BRADYCARDIA("");
        d27.setANAPHYLAXIS("");
        d27.setPEDS_ANAPHYLAXIS("");
        d27.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d27);



        //28

        DrugModel d28 = new DrugModel();
        d28.setDRUG_ID(28);
        d28.setDRUG_NAME("Labetolol – Trandate");
        d28.setMOA("alpha1, beta1, and beta2 antagonist");
        d28.setPO_DOSE("");
        d28.setDOSE("Bolus dose: 20-80 mg IV q 10 minutes PRN");
        d28.setIV_DOSE("");
        d28.setCCB_OVERDOSE("");
        d28.setDKA_HHS("");
        d28.setPROCEDURAL_SEDATION("");
        d28.setRSI_INDICATION("");
        d28.setUSUAL_CONTINOUS_INFUSION("");
        d28.setCONTINOUS_INFUSION("1-8 mg/min titrated to effect");
        d28.setPULSELESS_TORSADES("");
        d28.setASTHMA_EXACERBATION("");
        d28.setHYPER_SENSITIVITY_REACTION("");
        d28.setPCP_PNA("");
        d28.setSULFONYLUREA_TOXICITY("");
        d28.setVENTILATOR_SEDATION("");
        d28.setTCA_TOXICITY("");
        d28.setSALICYLATE_TOXICITY("");
        d28.setEMERGENT_INDICATIONS("hypertensive emergency");
        d28.setWHERE_YOU_WILL_GET_IN_TROUBLE("precipitated CHF, bradycardia, bronchospasm, Preg C");
        d28.setADULT_BRADYCARDIA("");
        d28.setANAPHYLAXIS("");
        d28.setPEDS_ANAPHYLAXIS("");
        d28.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d28);



        //29

        DrugModel d29 = new DrugModel();
        d29.setDRUG_ID(29);
        d29.setDRUG_NAME("Lorazepam – Ativan");
        d29.setMOA("Enhances inhibitory effects of GABA");
        d29.setPO_DOSE("");
        d29.setDOSE("Usual bolus dose: 1-2mg IV");
        d29.setIV_DOSE("");
        d29.setCCB_OVERDOSE("");
        d29.setDKA_HHS("");
        d29.setPROCEDURAL_SEDATION("");
        d29.setRSI_INDICATION("");
        d29.setUSUAL_CONTINOUS_INFUSION("1-10 mg/hr");
        d29.setCONTINOUS_INFUSION("");
        d29.setPULSELESS_TORSADES("");
        d29.setASTHMA_EXACERBATION("");
        d29.setHYPER_SENSITIVITY_REACTION("");
        d29.setPCP_PNA("");
        d29.setSULFONYLUREA_TOXICITY("");
        d29.setVENTILATOR_SEDATION("");
        d29.setTCA_TOXICITY("");
        d29.setSALICYLATE_TOXICITY("");
        d29.setEMERGENT_INDICATIONS("delirium tremens, status epilepticus, serotonin syndrome, agitation ");
        d29.setWHERE_YOU_WILL_GET_IN_TROUBLE("respiratory depression, hypotension, Preg D");
        d29.setADULT_BRADYCARDIA("");
        d29.setANAPHYLAXIS("");
        d29.setPEDS_ANAPHYLAXIS("");
        d29.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d29);



        //30

        DrugModel d30 = new DrugModel();
        d30.setDRUG_ID(30);
        d30.setDRUG_NAME("Magnesium Sulfate");
        d30.setMOA("participates in physiologic processes");
        d30.setPO_DOSE("");
        d30.setDOSE("Eclampsia: 2-4 grams IV over 5 minutes");
        d30.setIV_DOSE("");
        d30.setCCB_OVERDOSE("");
        d30.setDKA_HHS("");
        d30.setPROCEDURAL_SEDATION("");
        d30.setRSI_INDICATION("");
        d30.setUSUAL_CONTINOUS_INFUSION("");
        d30.setCONTINOUS_INFUSION("");
        d30.setPULSELESS_TORSADES("2 grams IV push");
        d30.setASTHMA_EXACERBATION("2 grams over 15 minutes");
        d30.setHYPER_SENSITIVITY_REACTION("");
        d30.setPCP_PNA("");
        d30.setSULFONYLUREA_TOXICITY("");
        d30.setVENTILATOR_SEDATION("");
        d30.setTCA_TOXICITY("");
        d30.setSALICYLATE_TOXICITY("");
        d30.setEMERGENT_INDICATIONS("torsades, ventricular dysrhythmias, eclampsia, status asthmaticus");
        d30.setWHERE_YOU_WILL_GET_IN_TROUBLE("respiratory depression, hypotension, Preg A");
        d30.setADULT_BRADYCARDIA("");
        d30.setANAPHYLAXIS("");
        d30.setPEDS_ANAPHYLAXIS("");
        d30.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d30);



        //31

        DrugModel d31 = new DrugModel();
        d31.setDRUG_ID(31);
        d31.setDRUG_NAME("Mannitol – Osmitrol");
        d31.setMOA("MOA: osmotic diuretic");
        d31.setPO_DOSE("");
        d31.setDOSE("1 gram/kg IV x 1");
        d31.setIV_DOSE("");
        d31.setCCB_OVERDOSE("");
        d31.setDKA_HHS("");
        d31.setPROCEDURAL_SEDATION("");
        d31.setRSI_INDICATION("");
        d31.setUSUAL_CONTINOUS_INFUSION("");
        d31.setCONTINOUS_INFUSION("");
        d31.setPULSELESS_TORSADES("");
        d31.setASTHMA_EXACERBATION("");
        d31.setHYPER_SENSITIVITY_REACTION("");
        d31.setPCP_PNA("");
        d31.setSULFONYLUREA_TOXICITY("");
        d31.setVENTILATOR_SEDATION("");
        d31.setTCA_TOXICITY("");
        d31.setSALICYLATE_TOXICITY("");
        d31.setEMERGENT_INDICATIONS("elevated ICP, impending herniation");
        d31.setWHERE_YOU_WILL_GET_IN_TROUBLE("may cause dehydration, osmotic nephrosis");
        d31.setADULT_BRADYCARDIA("");
        d31.setANAPHYLAXIS("");
        d31.setPEDS_ANAPHYLAXIS("");
        d31.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d31);



        //32

        DrugModel d32 = new DrugModel();
        d32.setDRUG_ID(32);
        d32.setDRUG_NAME("Methohexital – Brevital");
        d32.setMOA(" produces cortical and cerebellar sedation, hypnosis (ultra short-acting barbiturate)");
        d32.setPO_DOSE("");
        d32.setDOSE("1mg/kg IV, then 0.5 mg/kg q 2-5 minutes PRN");
        d32.setIV_DOSE("");
        d32.setCCB_OVERDOSE("");
        d32.setDKA_HHS("");
        d32.setPROCEDURAL_SEDATION("");
        d32.setRSI_INDICATION("");
        d32.setUSUAL_CONTINOUS_INFUSION("");
        d32.setCONTINOUS_INFUSION("");
        d32.setPULSELESS_TORSADES("");
        d32.setASTHMA_EXACERBATION("");
        d32.setHYPER_SENSITIVITY_REACTION("");
        d32.setPCP_PNA("");
        d32.setSULFONYLUREA_TOXICITY("");
        d32.setVENTILATOR_SEDATION("");
        d32.setTCA_TOXICITY("");
        d32.setSALICYLATE_TOXICITY("");
        d32.setEMERGENT_INDICATIONS("procedural sedation");
        d32.setWHERE_YOU_WILL_GET_IN_TROUBLE("laryngospasm (give more brevital), respiratory depression, \n" +
                "hypotension, Preg B\n");
        d32.setADULT_BRADYCARDIA("");
        d32.setANAPHYLAXIS("");
        d32.setPEDS_ANAPHYLAXIS("");
        d32.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d32);




        //33

        DrugModel d33 = new DrugModel();
        d33.setDRUG_ID(33);
        d33.setDRUG_NAME("Methylprednisolone – SoluMedrol");
        d33.setMOA("multiple gluco and mineralocorticoid effects");
        d33.setPO_DOSE("");
        d33.setDOSE("Asthma: 1mg/kg IV ");
        d33.setIV_DOSE("");
        d33.setCCB_OVERDOSE("");
        d33.setDKA_HHS("");
        d33.setPROCEDURAL_SEDATION("");
        d33.setRSI_INDICATION("");
        d33.setUSUAL_CONTINOUS_INFUSION("");
        d33.setCONTINOUS_INFUSION("");
        d33.setPULSELESS_TORSADES("");
        d33.setASTHMA_EXACERBATION("");
        d33.setHYPER_SENSITIVITY_REACTION("1 mg/kg IV");
        d33.setPCP_PNA("30mg IV BID x 5 days followed by a gradual taper ");
        d33.setSULFONYLUREA_TOXICITY("");
        d33.setVENTILATOR_SEDATION("");
        d33.setTCA_TOXICITY("");
        d33.setSALICYLATE_TOXICITY("");
        d33.setEMERGENT_INDICATIONS("severe asthma, PCP PNA with elevated A-a gradient or \n" +
                "PaO2 < 70 mmHg, acute hypersensitivity reaction\n");
        d33.setWHERE_YOU_WILL_GET_IN_TROUBLE(" immunosuppresion, hyperglycemia, Preg C");
        d33.setADULT_BRADYCARDIA("");
        d33.setANAPHYLAXIS("");
        d33.setPEDS_ANAPHYLAXIS("");
        d33.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d33);



        //34

        DrugModel d34 = new DrugModel();
        d34.setDRUG_ID(34);
        d34.setDRUG_NAME("Metoclopramide – Reglan");
        d34.setMOA("antagonizes dopamine receptors in the chemoreceptor trigger zone");
        d34.setPO_DOSE("");
        d34.setDOSE("10 mg IV q 6 hours PRN");
        d34.setIV_DOSE("");
        d34.setCCB_OVERDOSE("");
        d34.setDKA_HHS("");
        d34.setPROCEDURAL_SEDATION("");
        d34.setRSI_INDICATION("");
        d34.setUSUAL_CONTINOUS_INFUSION("");
        d34.setCONTINOUS_INFUSION("");
        d34.setPULSELESS_TORSADES("");
        d34.setASTHMA_EXACERBATION("");
        d34.setHYPER_SENSITIVITY_REACTION("");
        d34.setPCP_PNA("");
        d34.setSULFONYLUREA_TOXICITY("");
        d34.setVENTILATOR_SEDATION("");
        d34.setTCA_TOXICITY("");
        d34.setSALICYLATE_TOXICITY("");
        d34.setEMERGENT_INDICATIONS("vomiting prevention and treatment");
        d34.setWHERE_YOU_WILL_GET_IN_TROUBLE("tardive dyskinesia, extrapyramidal symptoms, dystonia, \n" +
                "methemoglobinemia, Preg B\n");
        d34.setADULT_BRADYCARDIA("");
        d34.setANAPHYLAXIS("");
        d34.setPEDS_ANAPHYLAXIS("");
        d34.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d34);



        //35

        DrugModel d35 = new DrugModel();
        d35.setDRUG_ID(35);
        d35.setDRUG_NAME("Midazolam – Versed");
        d35.setMOA("enhances inhibitory effects of GABA");
        d35.setPO_DOSE("");
        d35.setDOSE("RSI induction: 0.1 mg/kg IV ");
        d35.setIV_DOSE("");
        d35.setCCB_OVERDOSE("");
        d35.setDKA_HHS("");
        d35.setPROCEDURAL_SEDATION("0.02 - 0.04 mg/kg IV");
        d35.setRSI_INDICATION("");
        d35.setUSUAL_CONTINOUS_INFUSION("1-10 mg/hour");
        d35.setCONTINOUS_INFUSION("");
        d35.setPULSELESS_TORSADES("");
        d35.setASTHMA_EXACERBATION("");
        d35.setHYPER_SENSITIVITY_REACTION("");
        d35.setPCP_PNA("");
        d35.setSULFONYLUREA_TOXICITY("");
        d35.setVENTILATOR_SEDATION("");
        d35.setTCA_TOXICITY("");
        d35.setSALICYLATE_TOXICITY("");
        d35.setEMERGENT_INDICATIONS("seizure abortion, procedural sedation, ventilator sedation, RSI");
        d35.setWHERE_YOU_WILL_GET_IN_TROUBLE("respiratory depression, hypotensive effects, Preg D");
        d35.setADULT_BRADYCARDIA("");
        d35.setANAPHYLAXIS("");
        d35.setPEDS_ANAPHYLAXIS("");
        d35.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d35);



        //36

        DrugModel d36 = new DrugModel();
        d36.setDRUG_ID(36);
        d36.setDRUG_NAME("Morphine sulfate");
        d36.setMOA("opioid agonist producing analgesia with adjunctive sedative effects ");
        d36.setPO_DOSE("");
        d36.setDOSE("2-10 mg IV q 2-6 hours PRN; recommended dose 0.1 mg/kg IV");
        d36.setIV_DOSE("");
        d36.setCCB_OVERDOSE("");
        d36.setDKA_HHS("");
        d36.setPROCEDURAL_SEDATION("");
        d36.setRSI_INDICATION("");
        d36.setUSUAL_CONTINOUS_INFUSION("");
        d36.setCONTINOUS_INFUSION("");
        d36.setPULSELESS_TORSADES("");
        d36.setASTHMA_EXACERBATION("");
        d36.setHYPER_SENSITIVITY_REACTION("");
        d36.setPCP_PNA("");
        d36.setSULFONYLUREA_TOXICITY("");
        d36.setVENTILATOR_SEDATION("");
        d36.setTCA_TOXICITY("");
        d36.setSALICYLATE_TOXICITY("");
        d36.setEMERGENT_INDICATIONS("pain control");
        d36.setWHERE_YOU_WILL_GET_IN_TROUBLE(" respiratory depression, vasodilation (hypotension), Preg C");
        d36.setADULT_BRADYCARDIA("");
        d36.setANAPHYLAXIS("");
        d36.setPEDS_ANAPHYLAXIS("");
        d36.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d36);



        //37

        DrugModel d37 = new DrugModel();
        d37.setDRUG_ID(37);
        d37.setDRUG_NAME("Nimodipine – Nimotop");
        d37.setMOA("Ca channel blocker that is selective for cerebral arteries");
        d37.setPO_DOSE("");
        d37.setDOSE("60 mg PO qh4 ");
        d37.setIV_DOSE("");
        d37.setCCB_OVERDOSE("");
        d37.setDKA_HHS("");
        d37.setPROCEDURAL_SEDATION("");
        d37.setRSI_INDICATION("");
        d37.setUSUAL_CONTINOUS_INFUSION("");
        d37.setCONTINOUS_INFUSION("");
        d37.setPULSELESS_TORSADES("");
        d37.setASTHMA_EXACERBATION("");
        d37.setHYPER_SENSITIVITY_REACTION("");
        d37.setPCP_PNA("");
        d37.setSULFONYLUREA_TOXICITY("");
        d37.setVENTILATOR_SEDATION("");
        d37.setTCA_TOXICITY("");
        d37.setSALICYLATE_TOXICITY("");
        d37.setEMERGENT_INDICATIONS("SAH ");
        d37.setWHERE_YOU_WILL_GET_IN_TROUBLE("hypotension although this is minimized due to its \n" +
                "selectivity, Preg C\n");
        d37.setADULT_BRADYCARDIA("");
        d37.setANAPHYLAXIS("");
        d37.setPEDS_ANAPHYLAXIS("");
        d37.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d37);



        //38

        DrugModel d38 = new DrugModel();
        d38.setDRUG_ID(38);
        d38.setDRUG_NAME("Nitroglycerin");
        d38.setMOA("venodilator, stimulates cGMP production");
        d38.setPO_DOSE("");
        d38.setDOSE("5-200mcg/min, increase 10 mcg q 3-5 min until desired effect; higher doses are usually \n" +
                "required for pulmonary edema therefore recommend starting at a dose > 5 mcg/min\n");
        d38.setIV_DOSE("");
        d38.setCCB_OVERDOSE("");
        d38.setDKA_HHS("");
        d38.setPROCEDURAL_SEDATION("");
        d38.setRSI_INDICATION("");
        d38.setUSUAL_CONTINOUS_INFUSION("");
        d38.setCONTINOUS_INFUSION("");
        d38.setPULSELESS_TORSADES("");
        d38.setASTHMA_EXACERBATION("");
        d38.setHYPER_SENSITIVITY_REACTION("");
        d38.setPCP_PNA("");
        d38.setSULFONYLUREA_TOXICITY("");
        d38.setVENTILATOR_SEDATION("");
        d38.setTCA_TOXICITY("");
        d38.setSALICYLATE_TOXICITY("");
        d38.setEMERGENT_INDICATIONS("CHF, angina");
        d38.setWHERE_YOU_WILL_GET_IN_TROUBLE("hypotension, methemoglobinemia, Preg C");
        d38.setADULT_BRADYCARDIA("");
        d38.setANAPHYLAXIS("");
        d38.setPEDS_ANAPHYLAXIS("");
        d38.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d38);



        //39

        DrugModel d39 = new DrugModel();
        d39.setDRUG_ID(39);
        d39.setDRUG_NAME("Nitroprusside – Nipride");
        d39.setMOA("direct vasodilator, breaks down to release NO");
        d39.setPO_DOSE("");
        d39.setDOSE("Initiate at 0.3 mcg/kg/min IV and titrate to effect; maximum dose 10 mcg/kg/\n" +
                "min; if blood pressure not controlled after 10 minutes at max dose, nitroprusside should be \n" +
                "discontinued\n");
        d39.setIV_DOSE("");
        d39.setCCB_OVERDOSE("");
        d39.setDKA_HHS("");
        d39.setPROCEDURAL_SEDATION("");
        d39.setRSI_INDICATION("");
        d39.setUSUAL_CONTINOUS_INFUSION("");
        d39.setCONTINOUS_INFUSION("");
        d39.setPULSELESS_TORSADES("");
        d39.setASTHMA_EXACERBATION("");
        d39.setHYPER_SENSITIVITY_REACTION("");
        d39.setPCP_PNA("");
        d39.setSULFONYLUREA_TOXICITY("");
        d39.setVENTILATOR_SEDATION("");
        d39.setTCA_TOXICITY("");
        d39.setSALICYLATE_TOXICITY("");
        d39.setEMERGENT_INDICATIONS("hypertensive emergency");
        d39.setWHERE_YOU_WILL_GET_IN_TROUBLE("CN toxicity, methemoglobinemia, hypotension, Preg C");
        d39.setADULT_BRADYCARDIA("");
        d39.setANAPHYLAXIS("");
        d39.setPEDS_ANAPHYLAXIS("");
        d39.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d39);



        //40

        DrugModel d40 = new DrugModel();
        d40.setDRUG_ID(40);
        d40.setDRUG_NAME("Norepinephrine – Levophed");
        d40.setMOA("alpha1 agonist > beta1 agonist");
        d40.setPO_DOSE("");
        d40.setDOSE(" 1-30 mcg/min IV");
        d40.setIV_DOSE("");
        d40.setCCB_OVERDOSE("");
        d40.setDKA_HHS("");
        d40.setPROCEDURAL_SEDATION("");
        d40.setRSI_INDICATION("");
        d40.setUSUAL_CONTINOUS_INFUSION("");
        d40.setCONTINOUS_INFUSION("");
        d40.setPULSELESS_TORSADES("");
        d40.setASTHMA_EXACERBATION("");
        d40.setHYPER_SENSITIVITY_REACTION("");
        d40.setPCP_PNA("");
        d40.setSULFONYLUREA_TOXICITY("");
        d40.setVENTILATOR_SEDATION("");
        d40.setTCA_TOXICITY("");
        d40.setSALICYLATE_TOXICITY("");
        d40.setEMERGENT_INDICATIONS("hypotension refractory to IVF");
        d40.setWHERE_YOU_WILL_GET_IN_TROUBLE("tachydysrhythmias, tissue necrosis if catheter infiltrates or \n" +
                "administered through an arterial line therefore needs to be given via a central venous line, \n" +
                "Preg C\n");
        d40.setADULT_BRADYCARDIA("");
        d40.setANAPHYLAXIS("");
        d40.setPEDS_ANAPHYLAXIS("");
        d40.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d40);



        //41

        DrugModel d41 = new DrugModel();
        d41.setDRUG_ID(41);
        d41.setDRUG_NAME("Octreotide – Sandostatin");
        d41.setMOA("vasoconstricts vessels (more selective for GI vessels), reduces portal vessel pressure");
        d41.setPO_DOSE("");
        d41.setDOSE("Bleeding esophageal varices: 50 mcg IV bolus, then 50 mcg/hour IV ");
        d41.setIV_DOSE("");
        d41.setCCB_OVERDOSE("");
        d41.setDKA_HHS("");
        d41.setPROCEDURAL_SEDATION("");
        d41.setRSI_INDICATION("");
        d41.setUSUAL_CONTINOUS_INFUSION("");
        d41.setCONTINOUS_INFUSION("");
        d41.setPULSELESS_TORSADES("");
        d41.setASTHMA_EXACERBATION("");
        d41.setHYPER_SENSITIVITY_REACTION("");
        d41.setPCP_PNA("");
        d41.setSULFONYLUREA_TOXICITY("50 mcg SQ q 6 hours PRN");
        d41.setVENTILATOR_SEDATION("");
        d41.setTCA_TOXICITY("");
        d41.setSALICYLATE_TOXICITY("");
        d41.setEMERGENT_INDICATIONS("bleeding esophageal varices, sulfonlyurea overdose");
        d41.setWHERE_YOU_WILL_GET_IN_TROUBLE("Precipitated biliary dz, Preg B");
        d41.setADULT_BRADYCARDIA("");
        d41.setANAPHYLAXIS("");
        d41.setPEDS_ANAPHYLAXIS("");
        d41.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d41);



        //42

        DrugModel d42 = new DrugModel();
        d42.setDRUG_ID(42);
        d42.setDRUG_NAME("Albuterol - Proventil, ProAir, Ventolin ");
        d42.setMOA("antagonizes dopamine, histamine, alpha1, and 5HT2 receptors ");
        d42.setPO_DOSE("");
        d42.setDOSE(" 5-10mg IM/ODT (max 30mg/day)");
        d42.setIV_DOSE("");
        d42.setCCB_OVERDOSE("");
        d42.setDKA_HHS("");
        d42.setPROCEDURAL_SEDATION("");
        d42.setRSI_INDICATION("");
        d42.setUSUAL_CONTINOUS_INFUSION("");
        d42.setCONTINOUS_INFUSION("");
        d42.setPULSELESS_TORSADES("");
        d42.setASTHMA_EXACERBATION("");
        d42.setHYPER_SENSITIVITY_REACTION("");
        d42.setPCP_PNA("");
        d42.setSULFONYLUREA_TOXICITY("");
        d42.setVENTILATOR_SEDATION("");
        d42.setTCA_TOXICITY("");
        d42.setSALICYLATE_TOXICITY("");
        d42.setEMERGENT_INDICATIONS("agitation, psychosis ");
        d42.setWHERE_YOU_WILL_GET_IN_TROUBLE("do not give for dementia-related psychosis, NMS, EPS, \n" +
                "orthostatic hypotension, QT prolongation, not to be given IV, Preg C.\n");
        d42.setADULT_BRADYCARDIA("");
        d42.setANAPHYLAXIS("");
        d42.setPEDS_ANAPHYLAXIS("");
        d42.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d42);


        //43

        DrugModel d43 = new DrugModel();
        d43.setDRUG_ID(43);
        d43.setDRUG_NAME("Olanzapine – Zyprexa");
        d43.setMOA("antagonizes dopamine, histamine, alpha1, and 5HT2 receptors ");
        d43.setPO_DOSE("");
        d43.setDOSE(" 5-10mg IM/ODT (max 30mg/day)");
        d43.setIV_DOSE("");
        d43.setCCB_OVERDOSE("");
        d43.setDKA_HHS("");
        d43.setPROCEDURAL_SEDATION("");
        d43.setRSI_INDICATION("");
        d43.setUSUAL_CONTINOUS_INFUSION("");
        d43.setCONTINOUS_INFUSION("");
        d43.setPULSELESS_TORSADES("");
        d43.setASTHMA_EXACERBATION("");
        d43.setHYPER_SENSITIVITY_REACTION("");
        d43.setPCP_PNA("");
        d43.setSULFONYLUREA_TOXICITY("");
        d43.setVENTILATOR_SEDATION("");
        d43.setTCA_TOXICITY("");
        d43.setSALICYLATE_TOXICITY("");
        d43.setEMERGENT_INDICATIONS("agitation, psychosis ");
        d43.setWHERE_YOU_WILL_GET_IN_TROUBLE("do not give for dementia-related psychosis, NMS, EPS, \n" +
                "orthostatic hypotension, QT prolongation, not to be given IV, Preg C\n");
        d43.setADULT_BRADYCARDIA("");
        d43.setANAPHYLAXIS("");
        d43.setPEDS_ANAPHYLAXIS("");
        d43.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d43);



        //44

        DrugModel d44 = new DrugModel();
        d44.setDRUG_ID(44);
        d44.setDRUG_NAME("Ondansetron – Zofran");
        d44.setMOA("antagonizes serotonin 5-HT3 receptors, centrally acting antiemetic");
        d44.setPO_DOSE("");
        d44.setDOSE("usual dose 4-8 mg IV q 4-6 hours PRN");
        d44.setIV_DOSE("");
        d44.setCCB_OVERDOSE("");
        d44.setDKA_HHS("");
        d44.setPROCEDURAL_SEDATION("");
        d44.setRSI_INDICATION("");
        d44.setUSUAL_CONTINOUS_INFUSION("");
        d44.setCONTINOUS_INFUSION("");
        d44.setPULSELESS_TORSADES("");
        d44.setASTHMA_EXACERBATION("");
        d44.setHYPER_SENSITIVITY_REACTION("");
        d44.setPCP_PNA("");
        d44.setSULFONYLUREA_TOXICITY("");
        d44.setVENTILATOR_SEDATION("");
        d44.setTCA_TOXICITY("");
        d44.setSALICYLATE_TOXICITY("");
        d44.setEMERGENT_INDICATIONS("vomiting prevention and treatment");
        d44.setWHERE_YOU_WILL_GET_IN_TROUBLE(" QT prolongation, torsades (rare), Preg B");
        d44.setADULT_BRADYCARDIA("");
        d44.setANAPHYLAXIS("");
        d44.setPEDS_ANAPHYLAXIS("");
        d44.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d44);


        //45

        DrugModel d45 = new DrugModel();
        d45.setDRUG_ID(45);
        d45.setDRUG_NAME("Phenobarbital ");
        d45.setMOA("barbiturate, causes sedation, hypnosis and anesthesia");
        d45.setPO_DOSE("");
        d45.setDOSE("20 mg/kg IV x 1, may repeat with an additional 5-10 mg/kg dose in 20 minutes \n" +
                "(max dose 30 mg/kg); max infusion rate 50 mg/min\n");
        d45.setIV_DOSE("");
        d45.setCCB_OVERDOSE("");
        d45.setDKA_HHS("");
        d45.setPROCEDURAL_SEDATION("");
        d45.setRSI_INDICATION("");
        d45.setUSUAL_CONTINOUS_INFUSION("");
        d45.setCONTINOUS_INFUSION("");
        d45.setPULSELESS_TORSADES("");
        d45.setASTHMA_EXACERBATION("");
        d45.setHYPER_SENSITIVITY_REACTION("");
        d45.setPCP_PNA("");
        d45.setSULFONYLUREA_TOXICITY("");
        d45.setVENTILATOR_SEDATION("");
        d45.setTCA_TOXICITY("");
        d45.setSALICYLATE_TOXICITY("");
        d45.setEMERGENT_INDICATIONS("status epilepticus");
        d45.setWHERE_YOU_WILL_GET_IN_TROUBLE("respiratory depression, hypotension, Preg D");
        d45.setADULT_BRADYCARDIA("");
        d45.setANAPHYLAXIS("");
        d45.setPEDS_ANAPHYLAXIS("");
        d45.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d45);


        //46

        DrugModel d46 = new DrugModel();
        d46.setDRUG_ID(46);
        d46.setDRUG_NAME("Prednisone");
        d46.setMOA("produces various gluco and mineralocorticoid effects");
        d46.setPO_DOSE("");
        d46.setDOSE("1 mg/kg/day PO (usual dose 5-60 mg based on patient response)");
        d46.setIV_DOSE("");
        d46.setCCB_OVERDOSE("");
        d46.setDKA_HHS("");
        d46.setPROCEDURAL_SEDATION("");
        d46.setRSI_INDICATION("");
        d46.setUSUAL_CONTINOUS_INFUSION("");
        d46.setCONTINOUS_INFUSION("");
        d46.setPULSELESS_TORSADES("");
        d46.setASTHMA_EXACERBATION("");
        d46.setHYPER_SENSITIVITY_REACTION("");
        d46.setPCP_PNA("");
        d46.setSULFONYLUREA_TOXICITY("");
        d46.setVENTILATOR_SEDATION("");
        d46.setTCA_TOXICITY("");
        d46.setSALICYLATE_TOXICITY("");
        d46.setEMERGENT_INDICATIONS("Asthma exacerbation, PCP PNA with A-a gradient >35 or \n" +
                "PaO2 < 70mmHg, allergic reaction\n");
        d46.setWHERE_YOU_WILL_GET_IN_TROUBLE(" immunosuppresion, GI ulceration/perforation, \n" +
                "hyperglycemia, Preg C\n");
        d46.setADULT_BRADYCARDIA("");
        d46.setANAPHYLAXIS("");
        d46.setPEDS_ANAPHYLAXIS("");
        d46.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d46);


        //47

        DrugModel d47 = new DrugModel();
        d47.setDRUG_ID(47);
        d47.setDRUG_NAME("Propofol – Diprivan");
        d47.setMOA("GABAa agonist, Na channel blocker");
        d47.setPO_DOSE("");
        d47.setDOSE("Procedural Sedation: 1 mg/kg IV bolus then 0.5 mg/kg q 3 minutes to effect ");
        d47.setIV_DOSE("");
        d47.setCCB_OVERDOSE("");
        d47.setDKA_HHS("");
        d47.setPROCEDURAL_SEDATION("");
        d47.setRSI_INDICATION("1.5-2.5 mg/kg IV x 1");
        d47.setUSUAL_CONTINOUS_INFUSION("");
        d47.setCONTINOUS_INFUSION("");
        d47.setPULSELESS_TORSADES("");
        d47.setASTHMA_EXACERBATION("");
        d47.setHYPER_SENSITIVITY_REACTION("");
        d47.setPCP_PNA("");
        d47.setSULFONYLUREA_TOXICITY("");
        d47.setVENTILATOR_SEDATION("5-50 mcg/kg/min)");
        d47.setTCA_TOXICITY("");
        d47.setSALICYLATE_TOXICITY("");
        d47.setEMERGENT_INDICATIONS("procedural sedation, RSI induction, ventilator sedation");
        d47.setWHERE_YOU_WILL_GET_IN_TROUBLE("hypotension, anaphylaxis, bradycardia, apnea, Preg B");
        d47.setADULT_BRADYCARDIA("");
        d47.setANAPHYLAXIS("");
        d47.setPEDS_ANAPHYLAXIS("");
        d47.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d47);


        //48

        DrugModel d48 = new DrugModel();
        d48.setDRUG_ID(48);
        d48.setDRUG_NAME("Protamine sulfate");
        d48.setMOA("ionically binds heparin");
        d48.setPO_DOSE("");
        d48.setDOSE("1 mg neutralizes 100 units of heparin (max dose 50 mg); administer at a rate of \n" +
                "5 mg/minute \n");
        d48.setIV_DOSE("");
        d48.setCCB_OVERDOSE("");
        d48.setDKA_HHS("");
        d48.setPROCEDURAL_SEDATION("");
        d48.setRSI_INDICATION("");
        d48.setUSUAL_CONTINOUS_INFUSION("");
        d48.setCONTINOUS_INFUSION("");
        d48.setPULSELESS_TORSADES("");
        d48.setASTHMA_EXACERBATION("");
        d48.setHYPER_SENSITIVITY_REACTION("");
        d48.setPCP_PNA("");
        d48.setSULFONYLUREA_TOXICITY("");
        d48.setVENTILATOR_SEDATION("");
        d48.setTCA_TOXICITY("");
        d48.setSALICYLATE_TOXICITY("");
        d48.setEMERGENT_INDICATIONS("heparin induced bleeding");
        d48.setWHERE_YOU_WILL_GET_IN_TROUBLE("anaphylaxis in previous use or fish allergy, rapid infusion \n" +
                "can cause hypotension, Preg C\n");
        d48.setADULT_BRADYCARDIA("");
        d48.setANAPHYLAXIS("");
        d48.setPEDS_ANAPHYLAXIS("");
        d48.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d48);


        //49

        DrugModel d49 = new DrugModel();
        d49.setDRUG_ID(49);
        d49.setDRUG_NAME("Rocuronium");
        d49.setMOA("non-depolarizing neuromuscular agent");
        d49.setPO_DOSE("");
        d49.setDOSE("1mg/kg IV");
        d49.setIV_DOSE("");
        d49.setCCB_OVERDOSE("");
        d49.setDKA_HHS("");
        d49.setPROCEDURAL_SEDATION("");
        d49.setRSI_INDICATION("");
        d49.setUSUAL_CONTINOUS_INFUSION("");
        d49.setCONTINOUS_INFUSION("");
        d49.setPULSELESS_TORSADES("");
        d49.setASTHMA_EXACERBATION("");
        d49.setHYPER_SENSITIVITY_REACTION("");
        d49.setPCP_PNA("");
        d49.setSULFONYLUREA_TOXICITY("");
        d49.setVENTILATOR_SEDATION("");
        d49.setTCA_TOXICITY("");
        d49.setSALICYLATE_TOXICITY("");
        d49.setEMERGENT_INDICATIONS("RSI paralysis ");
        d49.setWHERE_YOU_WILL_GET_IN_TROUBLE("prolonged paralysis, Preg B");
        d49.setADULT_BRADYCARDIA("");
        d49.setANAPHYLAXIS("");
        d49.setPEDS_ANAPHYLAXIS("");
        d49.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d49);


        //50

        DrugModel d50 = new DrugModel();
        d50.setDRUG_ID(50);
        d50.setDRUG_NAME("Sodium Bicarbonate");
        d50.setMOA("increases serum bicarbonate (increases buffer stores)");
        d50.setPO_DOSE("");
        d50.setDOSE("Hyperkalemia or metabolic acidosis: 50 mEq IV x 1 (1 amp = 50 mEq)");
        d50.setIV_DOSE("");
        d50.setCCB_OVERDOSE("");
        d50.setDKA_HHS("");
        d50.setPROCEDURAL_SEDATION("");
        d50.setRSI_INDICATION("");
        d50.setUSUAL_CONTINOUS_INFUSION("");
        d50.setCONTINOUS_INFUSION("");
        d50.setPULSELESS_TORSADES("");
        d50.setASTHMA_EXACERBATION("");
        d50.setHYPER_SENSITIVITY_REACTION("");
        d50.setPCP_PNA("");
        d50.setSULFONYLUREA_TOXICITY("");
        d50.setVENTILATOR_SEDATION("");
        d50.setTCA_TOXICITY("1-2 mEq/kg IV bolus to achieve a serum pH of 7.45-7.55 and \n" +
                "QRS narrowing; effective serum alkalinization unlikely with continuous infusion\n");
        d50.setSALICYLATE_TOXICITY(" 3 amps (150mEq) in 1 liter D5W given as 10-20 ml/kg bolus, \n" +
                "then 2-3ml/kg/hr; goal urine pH 7.5-8.0\n");
        d50.setEMERGENT_INDICATIONS("hyperkalemia, TCA toxicity, salicylate toxicity, metabolic acidosis");
        d50.setWHERE_YOU_WILL_GET_IN_TROUBLE("caution in CHF, overshooting into metabolic alkalosis, \n" +
                "hypernatremia, Preg\n");
        d50.setADULT_BRADYCARDIA("");
        d50.setANAPHYLAXIS("");
        d50.setPEDS_ANAPHYLAXIS("");
        d50.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d50);


        //51

        DrugModel d51 = new DrugModel();
        d51.setDRUG_ID(51);
        d51.setDRUG_NAME("Succinylcholine");
        d51.setMOA("depolarizing neuromuscular agent");
        d51.setPO_DOSE("");
        d51.setDOSE("1.5 mg/kg (or 3-4 mg/kg IM)");
        d51.setIV_DOSE("");
        d51.setCCB_OVERDOSE("");
        d51.setDKA_HHS("");
        d51.setPROCEDURAL_SEDATION("");
        d51.setRSI_INDICATION("");
        d51.setUSUAL_CONTINOUS_INFUSION("");
        d51.setCONTINOUS_INFUSION("");
        d51.setPULSELESS_TORSADES("");
        d51.setASTHMA_EXACERBATION("");
        d51.setHYPER_SENSITIVITY_REACTION("");
        d51.setPCP_PNA("");
        d51.setSULFONYLUREA_TOXICITY("");
        d51.setVENTILATOR_SEDATION("");
        d51.setTCA_TOXICITY("");
        d51.setSALICYLATE_TOXICITY("");
        d51.setEMERGENT_INDICATIONS("RSI paralysis");
        d51.setWHERE_YOU_WILL_GET_IN_TROUBLE("hyperkalemia, subacute burn/crush with hyperkalemia, \n" +
                "glaucoma (increases IOP), increases ICP, Preg C\n");
        d51.setADULT_BRADYCARDIA("");
        d51.setANAPHYLAXIS("");
        d51.setPEDS_ANAPHYLAXIS("");
        d51.setHYPER_TENSION_REFACTORY("");

        drugModel.add(d51);

        return drugModel;
    }
}
