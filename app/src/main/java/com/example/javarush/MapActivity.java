package com.example.javarush;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    private VipeigerAdapter adapter;
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    private ArrayList<Fragment> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        initNitViewPager();
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
                        new SettingActivity()).commit();
                Toast.makeText(this, "Настройка", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_share:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_send:
                Toast.makeText(this, "Send", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_logout:
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
    private void initNitViewPager(){
        viewPager2 = findViewById(R.id.viewPager);
        adapter = new VipeigerAdapter(this);
        list = new ArrayList<>();
        list.add(new FirstFragment());
        list.add(new SeccondFragment());
        adapter.addFragments(list);
        viewPager2.setAdapter(adapter);
    }
}