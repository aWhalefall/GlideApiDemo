package dragger2.nuoyuan.com.glideapidemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import dragger2.nuoyuan.com.glideapidemo.R;

/**
 * Created by weichyang on 2017/4/18.
 */

public class HardActivity extends AppCompatActivity {

    public static Activity activity;
    private String url = "http://ww3.sinaimg.cn/bmiddle/005AUQMNjw1f1jxncznq8g30b4069kjl.gif";
    private String thumbnailUrl =
            "http://img0.ph.126.net/ZRtqC7-0gXMd4Pk6pXifdQ==/6598146188600193111.jpg";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_three);

        ImageView imageView = (ImageView) findViewById(R.id.imageView3);

        Glide.with(this)
                .load(url)
                .thumbnail(Glide.with(this).load(thumbnailUrl))
                .skipMemoryCache(true)
                .into(imageView);
    }

//    @BindingAdapter({"imageUrl", "error"})
//    public static void fillImageView(ImageView view, String url, Drawable error) {
//        Glide.with(activity).load(url).into(view);
//    }
//
//
//    public void loading(View view) {
//        binding.setImageUrl2("http://tse4.mm.bing.net/th?id=OIP.MKt6WVLkDWmz5ZKgzujUcwEsEs&w=204&h=201&c=7&qlt=90&o=4&dpr=1.1&pid=1.7");
//    }

}
