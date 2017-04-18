package dragger2.nuoyuan.com.glideapidemo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import dragger2.nuoyuan.com.glideapidemo.activity.HardActivity;
import dragger2.nuoyuan.com.glideapidemo.activity.NormalActivity;
import dragger2.nuoyuan.com.glideapidemo.activity.SimpleActivity;
import dragger2.nuoyuan.com.glideapidemo.adapter.PostAdapter;
import dragger2.nuoyuan.com.glideapidemo.bean.Post;
import dragger2.nuoyuan.com.glideapidemo.glideApiTest.GlideApi;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        copyToCache();
        copyToCachemm();
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("SimpleActivity 1", "Hello,Glide"));
        posts.add(new Post("Normal 2", "Load images from different data sources"));
        posts.add(new Post(" Hard 3", "Placeholders in Glide"));
        setListAdapter(new PostAdapter(this, posts));

    }

    private void copyToCache() {

        InputStream is;
        try {
            is = getAssets().open(GlideApi.IMG_NAME);
            FileOutputStream fos = new FileOutputStream(new File(getFilesDir(), GlideApi.IMG_NAME));
            byte[] buffer = new byte[1024];
            int byteCount;
            while ((byteCount = is.read(buffer)) != -1) {
                fos.write(buffer, 0, byteCount);
            }
            fos.flush();
            is.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取mp4，吓到sdcar
     */
    private void copyToCachemm() {
        InputStream is;
        try {
            is = getAssets().open(GlideApi.IMG_NAME_MP4);
            FileOutputStream fos = new FileOutputStream(new File(getExternalCacheDir(), GlideApi.IMG_NAME_MP4));
            byte[] buffer = new byte[1024];
            int byteCount;
            while ((byteCount = is.read(buffer)) != -1) {
                fos.write(buffer, 0, byteCount);
            }
            fos.flush();
            is.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position) {
            case 0:
                startActivity(SimpleActivity.class);
                break;
            case 1:
                startActivity(NormalActivity.class);
                break;
            case 2:
                startActivity(HardActivity.class);
                break;
            default:
                break;
        }
    }

    private void startActivity(Class<?> cls) {
        startActivity(new Intent(this, cls));
    }


}
