package com.example.denglu;

import java.util.Map;

import android.app.Activity;
import android.content.SharedPreferences;
import android.opengl.ETC1;
import android.os.Bundle;
import android.text.LoginFilter.UsernameFilterGeneric;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import service.loginservice;

public class MainActivity extends Activity {
	
		
	private static final String tag = "MainActivity";
	private EditText etname;
	private EditText etpasswd;
	private CheckBox cb;
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		etname=(EditText) findViewById(R.id.editText1);
		etpasswd=(EditText) findViewById(R.id.editText2);
		cb=(CheckBox)findViewById(R.id.checkBox1);
		
		
		SharedPreferences sp = getSharedPreferences("config", MODE_PRIVATE);
		String username=sp.getString("username", "");
		etname.setText(username);
		String passwd=sp.getString("passward", "");
		etpasswd.setText(passwd);
		
		
//		Map<String, String> map=loginservice.getnameandpaswd(this);
//		if (map != null) {
//			etname.setText(map.get("username"));
//			etpasswd.setText(map.get("userpw"));
//		}
	}

	public void login(View view) {
		String name = etname.getText().toString().trim();
		String pawd = etpasswd.getText().toString().trim();
		
		if (TextUtils.isEmpty(name)||TextUtils.isEmpty(pawd)) {
			Toast.makeText(this, "inputerror", 0).show();
		}
		else {
			if (cb.isChecked()) {

				loginservice.saveuserinfo(this,name, pawd);
				System.out.println("用户需要保存密码");
//				Log.i(tag , "需要保存密码"+result);
//				if (result==true) {
					Toast.makeText(this, "保存数据成功", 0).show();
//				}
//				else{Toast.makeText(this, "保存数据失败", 1).show();}
			} 
			if ("zhang".equals(name)&&"123".equals(pawd)) {
				Toast.makeText(this, "登录成功", 0).show();
			} else {
				Toast.makeText(this, "登陆失败，请检查用户名密码", 0).show();
			}
		}
		
	}
}
