package com.jim.sharesina;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {

	private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showShare();
			}
		});
    }
    private void showShare() {
    	 ShareSDK.initSDK(this);
    	 OnekeyShare oks = new OnekeyShare();
    	 //�ر�sso��Ȩ
    	 oks.disableSSOWhenAuthorize(); 

    	// ����ʱNotification��ͼ�������  2.5.9�Ժ�İ汾�����ô˷���
    	 //oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
    	 // title���⣬ӡ��ʼǡ����䡢��Ϣ��΢�š���������QQ�ռ�ʹ��
    	 oks.setTitle(getString(R.string.share));
    	 // titleUrl�Ǳ�����������ӣ�������������QQ�ռ�ʹ��
    	 oks.setTitleUrl("http://sharesdk.cn");
    	 // text�Ƿ����ı�������ƽ̨����Ҫ����ֶ�
    	 oks.setText("���Ƿ����ı�");
    	 // imagePath��ͼƬ�ı���·����Linked-In�����ƽ̨��֧�ִ˲���
    	 oks.setImagePath("/sdcard/test.jpg");//ȷ��SDcard������ڴ���ͼƬ
    	 // url����΢�ţ��������Ѻ�����Ȧ����ʹ��
    	 oks.setUrl("http://sharesdk.cn");
    	 // comment���Ҷ�������������ۣ�������������QQ�ռ�ʹ��
    	 oks.setComment("���ǲ��������ı�");
    	 // site�Ƿ�������ݵ���վ���ƣ�����QQ�ռ�ʹ��
    	 oks.setSite(getString(R.string.app_name));
    	 // siteUrl�Ƿ�������ݵ���վ��ַ������QQ�ռ�ʹ��
    	 oks.setSiteUrl("http://sharesdk.cn");

    	// ��������GUI
    	 oks.show(this);
    	 }

}
