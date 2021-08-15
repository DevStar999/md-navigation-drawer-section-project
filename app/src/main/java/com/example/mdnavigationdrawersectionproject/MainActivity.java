package com.example.mdnavigationdrawersectionproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    private void initialise() {
        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        initialise();
        setSupportActionBar(toolbar);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,
                toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
    }

    @SuppressLint("NonConstantResourceId") // For switch case warning
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.inbox_id: {
                Toast.makeText(MainActivity.this,
                        "Inbox was selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.starred_id: {
                Toast.makeText(MainActivity.this,
                        "Starred was selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.sent_mail_id: {
                Toast.makeText(MainActivity.this,
                        "Sent Mail was selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.drafts_id: {
                Toast.makeText(MainActivity.this,
                        "Drafts was selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.all_mails_id: {
                Toast.makeText(MainActivity.this,
                        "All Mails was selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.trash_id: {
                Toast.makeText(MainActivity.this,
                        "Trash was selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.spam_id: {
                Toast.makeText(MainActivity.this,
                        "Spam was selected", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        /*
        Closing the navigation drawer as follows -
        Note : GravityCompat.START will close to the start of the layout.
        */
        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }
}