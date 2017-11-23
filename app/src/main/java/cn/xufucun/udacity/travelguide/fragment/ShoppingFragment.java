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
        informationArrayList.add(new Information("名称1","简介"));
        informationArrayList.add(new Information("名称2","简介"));
        informationArrayList.add(new Information("名称3","简介"));
        informationArrayList.add(new Information("名称4","简介"));
        informationArrayList.add(new Information("名称5","简介"));
        informationArrayList.add(new Information("名称6","简介"));
        informationArrayList.add(new Information("名称7","简介"));
        informationArrayList.add(new Information("名称8","简介"));
        informationArrayList.add(new Information("名称9","简介"));
        informationArrayList.add(new Information("名称10","简介"));
        InformationAdapter adapter = new InformationAdapter(getContext(),  R.color.category_3,informationArrayList);
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
