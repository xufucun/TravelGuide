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
        informationArrayList.add(new Information("糁","糁(鲁南地区方言念sá)是临沂市民最经典的粥食和最贴心的早餐食品。"));
        informationArrayList.add(new Information("煎饼","煎饼是山东特产吃食。煎饼是传统临沂人的主食。"));
        informationArrayList.add(new Information("蒙阴光棍鸡","蒙阴光棍鸡是临沂蒙阴地方名吃，风靡沂蒙山区。"));
        informationArrayList.add(new Information("八宝豆鼓","八宝豆鼓是山东省临沂的一种地方小吃。"));
        informationArrayList.add(new Information("莒南锅饼","莒南锅饼为圆形,大如盘,厚大约5cm。"));
        informationArrayList.add(new Information("沂水丰糕","沂水丰糕，沂水县著名传统名吃，发明于公元1797年，为沂水独有。"));
        informationArrayList.add(new Information("咸豆粥","临沂大众化粥食，多为早餐供应。"));
        informationArrayList.add(new Information("孝河藕","临沂城北白沙埠镇西孝友村前有一小河，名叫孝河，为“王祥卧鱼，孝感天地”之处。"));
        informationArrayList.add(new Information("莒南驴肉","“天上的龙肉，地上的驴肉”，莒南毛驴纯饲青草等无公害绿色植物，"));
        informationArrayList.add(new Information("莒南板栗","莒南板栗个大、色艳、光滑油亮、果肉嫩黄细腻、香甜可口，素有“糯香栗”之称。"));
        informationArrayList.add(new Information("名称","简介"));

        InformationAdapter adapter = new InformationAdapter(getContext(),  R.color.category_2,informationArrayList);
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
