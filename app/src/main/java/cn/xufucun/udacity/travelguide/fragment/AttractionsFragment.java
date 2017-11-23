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
 * 景点Fragment
 * Created by xufuc on 2017/11/21.
 */

public class AttractionsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.content_list,container,false);

        final ArrayList<Information> informationArrayList = new ArrayList<Information>();
        informationArrayList.add(new Information("地下大峡谷","大峡谷的地下景色很壮观，独特的地下景观。就是人太多，但是真的..."));
        informationArrayList.add(new Information("沂蒙山","自然景观非常好，山川连绵，民风纯朴，青山绿水，风景如画。最美..."));
        informationArrayList.add(new Information("天上王城","景区根据自身环境划分为多个体验区，其中，更有两个景区主推的精..."));
        informationArrayList.add(new Information("临沂科技馆","这个地方未成年儿童，是免费参观的。但是里面的4d影院10元票..."));
        informationArrayList.add(new Information("沂蒙红色影视基地","爱国教育的主题基地 在当地经常有党员来这里学习观摩..."));
        informationArrayList.add(new Information("孟良崮","孟良崮位于山东省蒙阴县东南的芦山，属蒙山山系，面积仅1.5平..."));
        informationArrayList.add(new Information("临沂东关街","长条板石铺设的街道"));
        informationArrayList.add(new Information("国际影视城","景区环境优美，不过门票有点贵。尤其适合小孩和老人。节目挺丰富..."));
        informationArrayList.add(new Information("云瀑洞天","沂蒙云瀑洞天景区依山傍水，山间巨石林立，其间最著名的便是那块..."));
        informationArrayList.add(new Information("地下萤光湖","两岸景色优美，很美丽的景区，而且溶洞里非常凉快。总体不错，整..."));
        informationArrayList.add(new Information("彩虹谷","沂水雪山彩虹谷景区经过2015年改造提升后景区的面貌焕然一新..."));

        InformationAdapter adapter = new InformationAdapter(getContext(),  R.color.category_1,informationArrayList);
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
