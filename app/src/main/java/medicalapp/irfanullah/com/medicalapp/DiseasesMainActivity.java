package medicalapp.irfanullah.com.medicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import medicalapp.irfanullah.com.medicalapp.Adapters.DiseaseRVAdapter;
import medicalapp.irfanullah.com.medicalapp.Adapters.SideMenuAdapter;
import medicalapp.irfanullah.com.medicalapp.Data.DiseaseUtil;
import medicalapp.irfanullah.com.medicalapp.Models.DiseaseModel;

public class DiseasesMainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView sideLv;
    DrawerLayout drawer;
    ArrayList<DiseaseModel> diseaseModels;
    DiseaseUtil diseaseUtil;
    RecyclerView dRv;
    EditText searchDisease;
    DiseaseRVAdapter rVAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases_main);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        diseaseUtil = new DiseaseUtil();
        diseaseModels = diseaseUtil.getDiseases();
        dRv = findViewById(R.id.diseaseRecyclerView);
        searchDisease = findViewById(R.id.searchDisease);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        dRv.setLayoutManager(layoutManager);
        dRv.setHasFixedSize(true);
        rVAdapter = new DiseaseRVAdapter(this,diseaseModels);
        dRv.setAdapter(rVAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Diseases");

        setSupportActionBar(toolbar);


        // Drawer ListView
        sideLv = findViewById(R.id.sideListView);
        String[] titles = {"51 Drugs","Diseases"};
        ArrayAdapter adapter = new SideMenuAdapter(this,titles);
        sideLv.setAdapter(adapter);

        //Drawer ListView Click Listener

        sideLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0) {
                    Intent drugAct = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(drugAct);
                }

                else {
                    Intent diseaseAct = new Intent(getApplicationContext(), DiseasesMainActivity.class);
                    startActivity(diseaseAct);
                }
               // Toast.makeText(getApplicationContext(),Integer.toString(position),Toast.LENGTH_LONG).show();
                drawer.closeDrawers();
            }
        });

        searchDisease.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s);
            }
        });

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void filter(Editable s) {

        ArrayList<DiseaseModel> filteredModel = new ArrayList<>();

        for(DiseaseModel item : diseaseModels)
        {
            if(item.getDISEASE_NAME().toLowerCase().contains(s.toString().toLowerCase()))
            {
                filteredModel.add(item);
            }
        }

        rVAdapter.filteredList(filteredModel);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.diseases_main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
