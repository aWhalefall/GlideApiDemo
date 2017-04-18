package dragger2.nuoyuan.com.glideapidemo.activity;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import dragger2.nuoyuan.com.glideapidemo.R;
import dragger2.nuoyuan.com.glideapidemo.databinding.NormalActivityBinding;
import dragger2.nuoyuan.com.glideapidemo.glideApiTest.GlideApi;

/**
 * Created by weichyang on 2017/4/18.
 */

public class NormalActivity extends AppCompatActivity {

    public NormalActivityBinding binding;

    public static Activity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.normal_activity);
        activity = this;
        binding.setActivity(this);
        binding.setClick(new GlideApi());
    }

    @BindingAdapter({"imageUrl", "error"})
    public static void fillImageView(ImageView view, String url, Drawable error) {
        Glide.with(activity).load(url).into(view);
    }


    public void loading(View view) {
        binding.setImageUrl2("http://tse4.mm.bing.net/th?id=OIP.MKt6WVLkDWmz5ZKgzujUcwEsEs&w=204&h=201&c=7&qlt=90&o=4&dpr=1.1&pid=1.7");
    }

}
