package comsandysiu.github.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sandy on 2017/11/5.
 */

public class InfoListAdapter extends BaseAdapter {

    private List<Infomation> mInfo;
    private LayoutInflater mInflater;

    public InfoListAdapter (List<Infomation> info,LayoutInflater inflater){
        mInfo = info;
        mInflater = inflater;
    }

    @Override
    public int getCount() {
        return mInfo.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup viewGroup) {
        //get the item layout
        View view = mInflater.inflate(R.layout.style_infolist,null);
        //get data
        Infomation info = mInfo.get(position);
        //get object from the item layout
        ImageView statueIcon = (ImageView) view.findViewById(R.id.icon);
        TextView statueText = (TextView)view.findViewById(R.id.statue);
        TextView lineText = (TextView)view.findViewById(R.id.line);
        TextView dateText = (TextView)view.findViewById(R.id.date);
        //add data
        statueIcon.setImageResource(info.getmIcon());
        statueText.setText(info.getmStatue());
        lineText.setText(info.getmLine());
        dateText.setText(info.getmDate());
        return view;
    }
}
