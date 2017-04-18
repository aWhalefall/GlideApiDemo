package dragger2.nuoyuan.com.glideapidemo.activity;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import dragger2.nuoyuan.com.glideapidemo.R;
import dragger2.nuoyuan.com.glideapidemo.databinding.SimpleglideActivityBinding;

/**
 * Created by weichyang on 2017/4/18.
 */

public class SimpleActivity extends AppCompatActivity {
    /**
     * 使用databinding
     * 自定义属性，@ BindingAdapter 使用
     */
    private SimpleglideActivityBinding binding;

    public static Activity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.simpleglide_activity);
        activity = this;
    }

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String url) {
        Glide.with(activity).load(url).into(view);
    }


    public void loading(View view) {
        binding.setImageUrl("http://tse4.mm.bing.net/th?id=OIP.MKt6WVLkDWmz5ZKgzujUcwEsEs&w=204&h=201&c=7&qlt=90&o=4&dpr=1.1&pid=1.7");
    }

}
