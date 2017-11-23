package cn.xufucun.udacity.travelguide.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import cn.xufucun.udacity.travelguide.Information;
import cn.xufucun.udacity.travelguide.InformationAdapter;
import cn.xufucun.udacity.travelguide.R;

/**
 * Created by xufuc on 2017/11/21.
 */

public class StayFragment  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_list,container,false);

        final ArrayList<Information> informationArrayList = new ArrayList<Information>();
        informationArrayList.add(new Information(getString(R.string.hotel),getString(R.string.hotel1_i)));
        informationArrayList.add(new Information(getString(R.string.hote2),getString(R.string.hotel2_i)));
        informationArrayList.add(new Information(getString(R.string.hote3),getString(R.string.hotel3_i)));
        informationArrayList.add(new Information(getString(R.string.hote4),getString(R.string.hotel4_i)));
        informationArrayList.add(new Information(getString(R.string.hote5),getString(R.string.hotel5_i)));
        informationArrayList.add(new Information(getString(R.string.hote6),getString(R.string.hotel6_i)));
        informationArrayList.add(new Information(getString(R.string.hote7),getString(R.string.hotel7_i)));
        informationArrayList.add(new Information(getString(R.string.hote8),getString(R.string.hotel8_i)));
        informationArrayList.add(new Information(getString(R.string.hote9),getString(R.string.hotel9_i)));
        informationArrayList.add(new Information(getString(R.string.hotel0),getString(R.string.hotel10_i)));


        InformationAdapter adapter = new InformationAdapter(getContext(),  R.color.category_4,informationArrayList);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Information information = informationArrayList.get(i);
            }
        });


        return view;
    }
}
