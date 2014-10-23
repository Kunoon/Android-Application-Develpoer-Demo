package com.yarin.android.Examples_13_05;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.KeyEvent;

public class Activity01 extends Activity
{
	GLRender render = new GLRender();
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		GLImage.load(this.getResources());
		GLSurfaceView glView = new GLSurfaceView(this);
		
		glView.setRenderer(render);
		setContentView(glView);
	}
	
	//�����¼�
	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		render.onKeyUp(keyCode, event);
		return true;
	}
	
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		render.onKeyDown(keyCode, event);
		return super.onKeyDown(keyCode, event);
	}
}



class GLImage
{
	public static Bitmap mBitmap;
	public static void load(Resources resources)
	{
		mBitmap = BitmapFactory.decodeResource(resources, R.drawable.img);
	}
}