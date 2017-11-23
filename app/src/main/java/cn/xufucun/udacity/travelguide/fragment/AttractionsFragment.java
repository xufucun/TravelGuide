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
        informationArrayList.add(new Information(R.drawable.dxg,getString(R.string.dxdxg),"大峡谷的地下景色很壮观，独特的地下景观。就是人太多，但是真的..."));
        informationArrayList.add(new Information(R.drawable.yms,getString(R.string.yms),"自然景观非常好，山川连绵，民风纯朴，青山绿水，风景如画。最美..."));
        informationArrayList.add(new Information(R.drawable.tswc,getString(R.string.tswc),"景区根据自身环境划分为多个体验区，其中，更有两个景区主推的精..."));
        informationArrayList.add(new Information(R.drawable.lykjg,getString(R.string.lykjg),"这个地方未成年儿童，是免费参观的。但是里面的4d影院10元票..."));
        informationArrayList.add(new Information(R.drawable.hsymysjd,getString(R.string.ysjd),"爱国教育的主题基地 在当地经常有党员来这里学习观摩..."));
        informationArrayList.add(new Information(R.drawable.mlg,getString(R.string.mlg),"孟良崮位于山东省蒙阴县东南的芦山，属蒙山山系，面积仅1.5平..."));
        informationArrayList.add(new Information(R.drawable.dgj,getString(R.string.dgj),"长条板石铺设的街道"));
        informationArrayList.add(new Information(R.drawable.ysc,getString(R.string.gjysc),"景区环境优美，不过门票有点贵。尤其适合小孩和老人。节目挺丰富..."));
        informationArrayList.add(new Information(R.drawable.ypdt,getString(R.string.ypdt),"沂蒙云瀑洞天景区依山傍水，山间巨石林立，其间最著名的便是那块..."));
        informationArrayList.add(new Information(R.drawable.ygh,getString(R.string.dxygh),"两岸景色优美，很美丽的景区，而且溶洞里非常凉快。总体不错，整..."));
        informationArrayList.add(new Information(R.drawable.chg,getString(R.string.chg),"沂水雪山彩虹谷景区经过2015年改造提升后景区的面貌焕然一新..."));

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
