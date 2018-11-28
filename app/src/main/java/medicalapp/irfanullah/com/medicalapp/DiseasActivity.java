package medicalapp.irfanullah.com.medicalapp;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.util.ArrayList;

import medicalapp.irfanullah.com.medicalapp.Data.DiseaseUtil;
import medicalapp.irfanullah.com.medicalapp.DiseaseFragments.DiseaseSpread;
import medicalapp.irfanullah.com.medicalapp.DiseaseFragments.Prevention;
import medicalapp.irfanullah.com.medicalapp.DiseaseFragments.StagesOfDisease;
import medicalapp.irfanullah.com.medicalapp.DiseaseFragments.Treatment;
import medicalapp.irfanullah.com.medicalapp.DiseaseFragments.Whatis;
import medicalapp.irfanullah.com.medicalapp.DiseaseFragments.WhereIsItFound;
import medicalapp.irfanullah.com.medicalapp.Models.DiseaseModel;

public class DiseasActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private String DISEASE_NAME;
    private final String DISEASE_INTENT_EXTRA = "disease_name";
    ArrayList<DiseaseModel> diseaseModels;
    DiseaseUtil diseaseUtil;
    ArrayList<DiseaseModel> singleDisease;

    //Fragment EXTRA KEYS

    private final String WHAT_IS_IT = "whatit";
    private final String WHERE_IS_IT_FOUND = "whereitf";
    private final String HOW_IS_THE_DIESEASE_SPREAD = "howitds";
    private final String STAGES_OF_DISEASE = "stagesod";
    private final String TREATMENT = "treatment";
    private final String PREVENTION = "prevention";

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseas);
        diseaseUtil =  new DiseaseUtil();
        diseaseModels = diseaseUtil.getDiseases();
        singleDisease = new ArrayList<>();
        if(getIntent().getExtras() != null)
        {
            DISEASE_NAME = getIntent().getExtras().getString(DISEASE_INTENT_EXTRA);
        }
        else
        {
            finish();
        }


        for(DiseaseModel item : diseaseModels)
        {
            if(item.getDISEASE_NAME().toLowerCase().contains(DISEASE_NAME))
            {
                singleDisease.add(item);
                break;
            }
        }


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(singleDisease.get(0).getDISEASE_NAME());

        toolbar.setNavigationIcon(R.drawable.ic_keyboard_backspace_black_24dp);
        setSupportActionBar(toolbar);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));



    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_diseas, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    /**
     * A placeholder fragment containing a simple view.
     */


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            Bundle bundle;
            switch (position){
                case 0:
                    Whatis whatis = new Whatis();
                    bundle = new Bundle();
                    bundle.putString(WHAT_IS_IT,singleDisease.get(0).getWHAT_IS_IT());
                    whatis.setArguments(bundle);
                    return whatis;

                case 1:
                    WhereIsItFound whereIsItFound = new WhereIsItFound();
                   bundle = new Bundle();
                    bundle.putString(WHERE_IS_IT_FOUND,singleDisease.get(0).getWHERE_IS_IT_FOUND());
                    whereIsItFound.setArguments(bundle);
                    return whereIsItFound;
                case 2:
                    DiseaseSpread diseaseSpread = new DiseaseSpread();
                    bundle = new Bundle();
                    bundle.putString(HOW_IS_THE_DIESEASE_SPREAD,singleDisease.get(0).getHOW_IS_THE_DISEASE_SPREAD());
                    diseaseSpread.setArguments(bundle);

                    return diseaseSpread;
                case 3:
                    StagesOfDisease stagesOfDisease = new StagesOfDisease();
                    bundle = new Bundle();
                    bundle.putString(STAGES_OF_DISEASE,singleDisease.get(0).getSTAGES_OF_DISEASES());
                    stagesOfDisease.setArguments(bundle);

                    return stagesOfDisease;
                case 4:
                    Treatment treatment = new Treatment();
                    bundle = new Bundle();
                    bundle.putString(TREATMENT,singleDisease.get(0).getTREATMENT());
                    treatment.setArguments(bundle);

                    return treatment;
                case 5:
                    Prevention prevention = new Prevention();
                    bundle = new Bundle();
                    bundle.putString(PREVENTION,singleDisease.get(0).getPREVENTION());
                    prevention.setArguments(bundle);

                    return prevention;



            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 6;
        }
    }
}
