package cn.xufucun.udacity.travelguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xufuc on 2017/11/22.
 */

public class InformationAdapter extends ArrayAdapter<Information>{

    private int mColorResourceId;

    public InformationAdapter(@NonNull Context context, int resource, @NonNull List<Information> objects) {
        super(context, resource, objects);
        mColorResourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Information information = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (information.hasImage()) {
            imageView.setImageResource(information.getImageResId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        TextView name = (TextView) listItemView.findViewById(R.id.tv_name);
        name.setText(information.getName());

        TextView introduction = (TextView) listItemView.findViewById(R.id.tv_introduction);
        introduction.setText(information.getIntroduction());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }


}
