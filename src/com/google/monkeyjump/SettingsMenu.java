package com.google.monkeyjump;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsMenu extends PreferenceActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.layout.settings);
		
	}	

}
