package raf.tabiin.barchartgraph;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import raf.tabiin.barchartgraph.databinding.ActivityMainBinding;
import raf.tabiin.barchartgraph.diagrams.BarChartFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i) {
                    case R.id.main:
                        getSupportFragmentManager().beginTransaction().replace(
                                R.id.container, new BarChartFragment()
                        ).commit();
                }
            }
        });
    }

}