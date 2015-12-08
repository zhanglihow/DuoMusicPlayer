/*
 * Copyright (C) 2014 Saravan Pantham
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.Duo.music.player.BroadcastReceivers;

import com.Duo.music.player.Utils.Common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NextBroadcastReceiver extends BroadcastReceiver {
	
	private Common mApp;
	
	@Override
	public void onReceive(Context context, Intent intent) {
		mApp = (Common) context.getApplicationContext();
		
		if (mApp.isServiceRunning())
			mApp.getService().skipToNextTrack();

	}
	  
}
