package com.example.emaintainer;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import android.app.Activity;

public class TaskDetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_task_detail);
	}
	
	public void taskDone(View view) {
		Toast.makeText(getApplicationContext(), "������������ύ", Toast.LENGTH_SHORT).show();;
	}
}
