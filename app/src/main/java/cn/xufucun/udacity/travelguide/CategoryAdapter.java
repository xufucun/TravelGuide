package cn.xufucun.udacity.travelguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cn.xufucun.udacity.travelguide.fragment.AttractionsFragment;
import cn.xufucun.udacity.travelguide.fragment.CateFragment;
import cn.xufucun.udacity.travelguide.fragment.ShoppingFragment;
import cn.xufucun.udacity.travelguide.fragment.StayFragment;

/**
 * Created by xufuc on 2017/11/22.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private static int PAGE_COUNT = 4;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new CateFragment();
        } else if (position == 2) {
            return new ShoppingFragment();
        } else {
            return new StayFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_attractions);
        } else if (position == 1) {
            return mContext.getString(R.string.category_cate);
        } else if (position == 2) {
            return mContext.getString(R.string.category_shopping);
        } else {
            return mContext.getString(R.string.category_stay);
        }
    }
}
