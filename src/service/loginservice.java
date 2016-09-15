package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.PrivateCredentialPermission;

import android.bluetooth.BluetoothClass.Device.Major;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.view.inputmethod.InputMethodInfo;
import android.widget.EditText;

public class loginservice {
	/**
	 * 保存数据
	 * @param username
	 * @param passwd
	 * @return
	 */
	public static void saveuserinfo(Context context, String username,String passwd){
		
		SharedPreferences sp = context.getSharedPreferences("config", context.MODE_PRIVATE);
		//得到编辑器
		Editor editor=sp.edit();
		editor.putString("username", username);
		editor.putString("passward", passwd);
		//提交
		editor.commit();
		
//		try {
////			File file = new File("/data/data/com.example.denglu/info.txt");
//			File file = new File(cintext.getFilesDir(),"info.txt");
//			
//			
//			
//			FileOutputStream fos = new FileOutputStream(file);
//			
//			fos.write((username+"##"+passwd).getBytes());
//			fos.close();
//			
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}		
		
	}
//	public static Map<String, String> getnameandpaswd(Context context) {
//		File file = new File(context.getFilesDir(),"info.txt");
//		try {
//			FileInputStream fis1 = new FileInputStream(file);
//			BufferedReader br = new BufferedReader(new InputStreamReader(fis1));
//			
//			String str = br.readLine();
//			String[] infos = str.split("##");
//			Map<String, String> map = new HashMap<String, String>();
//			map.put("username", infos[0]);
//			map.put("userpw", infos[1]);
//			return map;
//		} catch (Exception e) {
//			// TODO: handle exception
//			return null;
//		}
//	}
	
}
