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

public class CateFragment  extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_list,container,false);
        final ArrayList<Information> informationArrayList = new ArrayList<Information>();
        informationArrayList.add(new Information(getString(R.string.food1),getString(R.string.food1_i)));
        informationArrayList.add(new Information(getString(R.string.food2),getString(R.string.food2_i)));
        informationArrayList.add(new Information(getString(R.string.food3),getString(R.string.food3_i)));
        informationArrayList.add(new Information(getString(R.string.food4),getString(R.string.food4_i)));
        informationArrayList.add(new Information(getString(R.string.food5),getString(R.string.food5_i)));
        informationArrayList.add(new Information(getString(R.string.food6),getString(R.string.food6_i)));
        informationArrayList.add(new Information(getString(R.string.food7),getString(R.string.food7_i)));
        informationArrayList.add(new Information(getString(R.string.food8),getString(R.string.food8_i)));
        informationArrayList.add(new Information(getString(R.string.food9),getString(R.string.food9_i)));
        informationArrayList.add(new Information(getString(R.string.food10),getString(R.string.food10_i)));


        InformationAdapter adapter = new InformationAdapter(getContext(),  R.color.category_2,informationArrayList);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return view;
    }
}
