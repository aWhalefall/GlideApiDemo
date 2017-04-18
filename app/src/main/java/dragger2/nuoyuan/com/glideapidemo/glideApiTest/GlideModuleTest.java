package dragger2.nuoyuan.com.glideapidemo.glideApiTest;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.module.GlideModule;

/**
 * Created by weichyang on 2017/4/18.
 * 自定义GlideModel
 * 使用其中Builder进行Glide构建
 */

public class GlideModuleTest implements GlideModule {

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {

//        builder.setDiskCache();//自定义磁盘缓存
//
//        builder.setMemoryCache();//自定义内存缓存
//
//        builder.setBitmapPool(); //自定义图片池
//
//        builder.setDiskCacheService();//自定义本地缓存的线程池
//
//        builder.setResizeService();//自定义核心处理的线程池
//
//        builder.setDecodeFormat();//自定义图片质量

        /**
         * 1.设置内存缓存
         */
        //根据上边提供的接口可以进行存盘或者内存缓存
        //设置磁盘缓存大小
        int size = 100 * 1024 * 1024;
        //设置磁盘缓存
        builder.setDiskCache(new InternalCacheDiskCacheFactory(context, size));
        /**
         * 2.设置磁盘缓存
         */
        //设置磁盘缓存大小
        //设置磁盘缓存
        builder.setDiskCache(new ExternalCacheDiskCacheFactory(context, size));
        /**
         * 重置缓存路径
         */
        String dir = "resetpath";
        //设置磁盘缓存
        builder.setDiskCache(new ExternalCacheDiskCacheFactory(context, dir, size));
        /**
         * 完全重置缓存路径
         */
        //设置磁盘缓存大小
        String dirFolder = "xia";
        String dirName = "yu";
        //设置磁盘缓存
        builder.setDiskCache(new DiskLruCacheFactory(dirFolder, size));
        //builder.setDiskCache(new DiskLruCacheFactory(dirFolder, dirName,size));

    }

    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
