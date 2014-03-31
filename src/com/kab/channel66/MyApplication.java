package com.kab.channel66;

import android.app.Application;

import org.acra.*;
import org.acra.annotation.*;

import com.kab.channel66.utils.CommonUtils;


@ReportsCrashes(formKey = "", // will not be used
mailTo = "igal.avraham@gmail.com",
mode = ReportingInteractionMode.TOAST,
resToastText = R.string.report)

public class MyApplication extends Application {

	@Override
    public void onCreate() {
        super.onCreate();
        if(CommonUtils.checkConnectivity(getApplicationContext()))
        	ACRA.init(this);
        
       
        // The following line triggers the initialization of ACRA
        
    }
}
