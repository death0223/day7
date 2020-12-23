package com.example.day7;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();


        UMConfigure.init(this,"5fe155b7345b8b53f575c897"
                ,"umeng", UMConfigure.DEVICE_TYPE_PHONE,"");//58edcfeb310c93091c000be2 5965ee00734be40b580001a0
        // QQ设置
        PlatformConfig.setQQZone("101921073", "38a314d9c8acadf3d3fe056cf908a2ad");
        PlatformConfig.setQQFileProvider("com.wf.ds.fileprovider");

        // 其他平台设置
        PlatformConfig.setSinaWeibo("272488818", "d4cf37a56f65abc05b328a6b4d92ed5a","http://www.sina.com");

    }




}
