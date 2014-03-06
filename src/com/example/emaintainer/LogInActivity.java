package com.example.emaintainer;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;

public class LogInActivity extends Activity {
	private EditText user;
	private EditText passwd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_log_in);
		
		user = (EditText)findViewById(R.id.login_user_edit);
		passwd = (EditText)findViewById(R.id.login_passwd_edit);
	}
	
	public void login(View view) {
		if ("test".equals(user.getText().toString())
				&& "test".equals(passwd.getText().toString())) {
			Intent intent = new Intent(LogInActivity.this, MainPageActivity.class);
			startActivity(intent);
			this.finish();
		} else if ("".equals(user.getText().toString())
				&& "".equals(passwd.getText().toString())) {
			new AlertDialog.Builder(LogInActivity.this).setIcon(null).setTitle("Wrong")
					.setMessage("账号或密码不能为空，\n请重新输入").create().show();
		} else {
			new AlertDialog.Builder(LogInActivity.this).setIcon(null).setTitle("Wrong")
			.setMessage("账号或密码不正确，\n请重新输入").create().show();
		}
	}
	
	public void exit(View view) {
		finish();
	}
}
