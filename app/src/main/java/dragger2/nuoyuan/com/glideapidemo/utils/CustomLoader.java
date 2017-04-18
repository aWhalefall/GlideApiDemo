package dragger2.nuoyuan.com.glideapidemo.utils;

import android.content.Context;

import com.bumptech.glide.load.model.stream.BaseGlideUrlLoader;

/**
 * Created by weichyang on 2017/4/18.
 */

public class CustomLoader extends BaseGlideUrlLoader<CustomModel> {

    public CustomLoader(Context context) {
        super(context);
    }

    @Override
    protected String getUrl(CustomModel model, int width, int height) {
        return model.buidUrl(width, height);
    }
}
