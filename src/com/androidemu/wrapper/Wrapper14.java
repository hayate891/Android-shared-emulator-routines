package com.androidemu.wrapper;

import android.annotation.TargetApi;

import android.os.Build;

import android.view.ViewConfiguration;

@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
class Wrapper14
{
	static boolean ViewConfiguration_hasPermanentMenuKey(ViewConfiguration cfg)
	{
		return cfg.hasPermanentMenuKey();
	}
}
