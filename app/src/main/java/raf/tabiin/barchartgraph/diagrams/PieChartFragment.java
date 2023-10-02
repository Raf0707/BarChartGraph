package raf.tabiin.barchartgraph.diagrams;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import raf.tabiin.barchartgraph.databinding.FragmentPieChartBinding;


public class PieChartFragment extends Fragment {
    FragmentPieChartBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPieChartBinding.inflate(getLayoutInflater());

        ArrayList<PieEntry> visitors = new ArrayList<>();
        visitors.add(new PieEntry(508, "2016"));
        visitors.add(new PieEntry(600, "2017"));
        visitors.add(new PieEntry(750, "2018"));
        visitors.add(new PieEntry(600, "2019"));
        visitors.add(new PieEntry(670, "2020"));

        PieDataSet pieDataSet = new PieDataSet(visitors, "Visitors");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        binding.pieChart.setData(pieData);
        binding.pieChart.getDescription().setEnabled(false);

        return binding.getRoot();
    }
}