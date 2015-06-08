package com.song.util;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class CallbackImpl implements AsyncImageLoader.ImageCallback {
	private ImageView imageView;

	public CallbackImpl(ImageView imageView) {
		super();
		this.imageView = imageView;
	}

	@Override
	public void imageLoaded(Bitmap imageDrawable) {

		imageView.setImageBitmap(imageDrawable);

	}

}
