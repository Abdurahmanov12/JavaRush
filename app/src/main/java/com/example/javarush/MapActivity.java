package com.example.javarush;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MapActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = null;
    private DrawerLayout drawer;
    private FirebaseAuth firebaseAuth;
    Button btnRegister, btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.menu_drawer_open,R.string.menu_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new Home()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
        NavigationView navigationView1 = findViewById(R.id.nav_view);
        navigationView1.setItemIconTintList(null);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new Home());
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_message:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new MessageFragment()).commit();
                Toast.makeText(this, "Сообщения", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_chat:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ChatFragment()).commit();
                Toast.makeText(this, "Чат", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ProfileFragment()).commit();
                Toast.makeText(this, "Профил", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Home()).commit();
                Toast.makeText(this, "Hom", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_info:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new InfoActivity()).commit();
                Toast.makeText(this, "Информация", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_notification:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new NotificationActivity()).commit();
                Toast.makeText(this, "Уведомления", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_collections:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CollectionsActivity()).commit();
                Toast.makeText(this, "Закладки", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_setting:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SettingsActivity.SettingsFragment()).commit();
                Toast.makeText(this, "Настройка", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_share:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String sharebody = "look all Programmings";
                String subject = "http://www.youtube.com/avadhtutor/playlists/";
                intent.putExtra(Intent.EXTRA_SUBJECT, sharebody);
                intent.putExtra(Intent.EXTRA_TEXT, subject);
                startActivity(Intent.createChooser(intent,"AVADH TUTOR"));
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_logout:
                btnSignIn = findViewById(R.id.emailField);
                firebaseAuth = FirebaseAuth.getInstance();
                firebaseAuth.signOut();

                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                if (firebaseUser != null){
                    btnSignIn.setText(firebaseUser.getEmail());
                }else {
                    startActivity(new Intent(this,MainActivity.class));
                    finish();
                }
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}