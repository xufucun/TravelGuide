package cn.xufucun.udacity.travelguide.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        informationArrayList.add(new Information(R.drawable.dxg,getString(R.string.dxdxg),getString(R.string.dxdxg_i)));
        informationArrayList.add(new Information(R.drawable.yms,getString(R.string.yms),getString(R.string.yms_i)));
        informationArrayList.add(new Information(R.drawable.tswc,getString(R.string.tswc),getString(R.string.tswc_i)));
        informationArrayList.add(new Information(R.drawable.lykjg,getString(R.string.lykjg),getString(R.string.lykjg_i)));
        informationArrayList.add(new Information(R.drawable.hsymysjd,getString(R.string.ysjd),getString(R.string.ysjd_i)));
        informationArrayList.add(new Information(R.drawable.mlg,getString(R.string.mlg),getString(R.string.mlg_i)));
        informationArrayList.add(new Information(R.drawable.dgj,getString(R.string.dgj),getString(R.string.dgj_i)));
        informationArrayList.add(new Information(R.drawable.ysc,getString(R.string.gjysc),getString(R.string.gjysc_i)));
        informationArrayList.add(new Information(R.drawable.ypdt,getString(R.string.ypdt),getString(R.string.ypdt_i)));
        informationArrayList.add(new Information(R.drawable.ygh,getString(R.string.dxygh),getString(R.string.dxygh_i)));
        informationArrayList.add(new Information(R.drawable.chg,getString(R.string.chg),getString(R.string.chg_i)));

        InformationAdapter adapter = new InformationAdapter(getContext(),  R.color.category_1,informationArrayList);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }
}
