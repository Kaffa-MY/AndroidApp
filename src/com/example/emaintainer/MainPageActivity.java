package com.example.emaintainer;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class MainPageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main_page);
	}
	
	public void taskDetail(View view) {
		startActivity(new Intent(getApplicationContext(),TaskDetailActivity.class));
	}
	
	public void tastRefresh(View view){
		Toast.makeText(getApplicationContext(), "任务更新中...", Toast.LENGTH_SHORT).show();
	}
}
