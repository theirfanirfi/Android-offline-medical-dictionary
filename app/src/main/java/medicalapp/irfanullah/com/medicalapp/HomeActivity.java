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
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import medicalapp.irfanullah.com.medicalapp.Adapters.DrugsRVAdapter;
import medicalapp.irfanullah.com.medicalapp.Adapters.SideMenuAdapter;
import medicalapp.irfanullah.com.medicalapp.Data.DrugUtil;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView sideLv;
    DrawerLayout drawer;
    RecyclerView DrugsRV;
    DrugsRVAdapter rVAdapter;

    ArrayList<DrugModel> drugModel;
    DrugUtil drugs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        drugs = new DrugUtil();

        drugModel = drugs.getDrugs();


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


        //Drugs RecyclerView

        DrugsRV = findViewById(R.id.drugsRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        DrugsRV.setHasFixedSize(true);

        rVAdapter = new DrugsRVAdapter(this,drugModel);

        DrugsRV.setLayoutManager(layoutManager);
        DrugsRV.setAdapter(rVAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("51 Drugs");
        setSupportActionBar(toolbar);

        //search box
        EditText sv = findViewById(R.id.searchDrugs);
        sv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });





        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
//        getMenuInflater().inflate(R.menu.home, menu);
//        return true;
//    }


    public void filter(String text)
    {
        ArrayList<DrugModel> mDrug = new ArrayList<>();
        for(DrugModel item : drugModel)
        {
            if(item.getDRUG_NAME().toLowerCase().contains(text.toLowerCase()))
            {
                mDrug.add(item);
            }
        }

        rVAdapter.filteredList(mDrug);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
