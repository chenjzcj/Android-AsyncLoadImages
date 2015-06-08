package com.song;

import android.app.Application;

public class ImageApp extends Application {

	public static ImageApp imageApp = null;

	@Override
	public void onCreate() {
		super.onCreate();
		imageApp = this;
	}
}
