package dragger2.nuoyuan.com.glideapidemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import dragger2.nuoyuan.com.glideapidemo.R;
import dragger2.nuoyuan.com.glideapidemo.bean.Post;

public class PostAdapter extends BaseAdapter {

    private Context context;
    private List<Post> postList;

    public PostAdapter(Context context, List<Post> posts) {
        this.context = context;
        this.postList = posts;
    }

    @Override
    public int getCount() {
        return postList.size();
    }

    @Override
    public Object getItem(int position) {
        return postList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.post_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        TextView textView = (TextView) convertView.findViewById(R.id.title);
        TextView subtitle = (TextView) convertView.findViewById(R.id.subtitle);
        textView.setText(postList.get(position).getTitle());
        subtitle.setText(postList.get(position).getSubtitle());

        return convertView;
    }

    public static class ViewHolder {
//        @BindView(R.id.title)
//        TextView title;
//
//        @BindView(R.id.subtitle)
//        TextView subtitle;

        public ViewHolder(View view) {
//            ButterKnife.bind(this, view);
        }
    }
}
