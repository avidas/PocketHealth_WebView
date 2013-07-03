package com.example.pockethealth;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ProfilePage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile_page);
		
		WebView pHealth = (WebView) findViewById(R.id.pHealth);
		WebSettings pSettings = pHealth.getSettings();
		pSettings.setJavaScriptEnabled(true);
		
		pHealth.setWebViewClient(new pHealthWebViewClient());
		pHealth.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
		pHealth.loadUrl("http://pockethealth.herokuapp.com");
		
	}
	
	private class pHealthWebViewClient extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.profile_page, menu);
		return true;
	}

}
