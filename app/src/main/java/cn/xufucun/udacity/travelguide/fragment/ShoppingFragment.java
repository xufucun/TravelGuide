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

public class ShoppingFragment  extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.content_list,container,false);
        final ArrayList<Information> informationArrayList = new ArrayList<Information>();
        informationArrayList.add(new Information(getString(R.string.shop1),getString(R.string.shop1_i)));
        informationArrayList.add(new Information(getString(R.string.shop2),getString(R.string.shop2_i)));
        informationArrayList.add(new Information(getString(R.string.shop3),getString(R.string.shop3_i)));
        informationArrayList.add(new Information(getString(R.string.shop4),getString(R.string.shop4_i)));
        informationArrayList.add(new Information(getString(R.string.shop5),getString(R.string.shop5_i)));
        informationArrayList.add(new Information(getString(R.string.shop6),getString(R.string.shop6_i)));
        informationArrayList.add(new Information(getString(R.string.shop7),getString(R.string.shop7_i)));
        informationArrayList.add(new Information(getString(R.string.shop8),getString(R.string.shop8_i)));
        informationArrayList.add(new Information(getString(R.string.shop9),getString(R.string.shop9_i)));
        informationArrayList.add(new Information(getString(R.string.shop10),getString(R.string.shop10_i)));

        InformationAdapter adapter = new InformationAdapter(getContext(),  R.color.category_3,informationArrayList);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return view;
    }
}
