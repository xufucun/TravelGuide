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
        informationArrayList.add(new Information("华盛江泉城大酒店","临沂市罗庄区罗六路与双月湖路交汇处"));
        informationArrayList.add(new Information("汇东商务酒店","临沂市兰山区新华路9号+,新华路与红旗路交接处"));
        informationArrayList.add(new Information("荣华大酒店","临沂市兰山区新华路121号"));
        informationArrayList.add(new Information("鲁班国际酒店","临沂市兰山区通达路307号"));
        informationArrayList.add(new Information("陶然居大酒店","临沂市兰山区陶然路163号"));
        informationArrayList.add(new Information("蓝海国际大饭店","临沂市兰山区解放路158号"));
        informationArrayList.add(new Information("银座佳驿酒店(临沂通达路和谐广场店)","临沂市兰山区通达路109号"));
        informationArrayList.add(new Information("如家快捷酒店(临沂蒙山大道国际会展中心店)","临沂市兰山区蒙山大道77号"));
        informationArrayList.add(new Information("寰宇大酒店(长安中路)","临沂市沂水县长安中路111号"));
        informationArrayList.add(new Information("锦江之星酒店(临沂火车站店)","临沂市兰山区沂蒙路356号"));
        informationArrayList.add(new Information("格林豪泰酒店(山东省临沂市银雀山路)","临沂市兰山区银雀山路185-8号"));

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
