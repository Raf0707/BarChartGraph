package raf.tabiin.barchartgraph.diagrams;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import raf.tabiin.barchartgraph.databinding.FragmentBarChartBinding;


public class BarChartFragment extends Fragment {

    FragmentBarChartBinding binding;

    BarChart barChart;
    BarData barData;
    BarDataSet barDataSet;
    ArrayList barEntries;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBarChartBinding.inflate(getLayoutInflater());

        barChart = binding.barChart;

        getEntries();

        barDataSet = new BarDataSet(barEntries, "Data Set");
        barData = new BarData(barDataSet);

        barChart.setData(barData);

        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        return binding.getRoot();
    }

    private void getEntries() {
        barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1f, 2));
        barEntries.add(new BarEntry(2f, 4));
        barEntries.add(new BarEntry(3f, 1));
        barEntries.add(new BarEntry(5f, 5));
        barEntries.add(new BarEntry(6f, 3));
        barEntries.add(new BarEntry(7f, 2));
    }
}