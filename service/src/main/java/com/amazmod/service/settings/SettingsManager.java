package com.amazmod.service.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.amazmod.service.Constants;

import amazmod.com.transport.data.SettingsData;

public class SettingsManager {

    private Context context;

    public SettingsManager(Context context) {
        this.context = context;
    }

    public void sync(SettingsData settingsData) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt(Constants.PREF_NOTIFICATION_SCREEN_TIMEOUT, settingsData.getScreenTimeout());
        editor.putInt(Constants.PREF_NOTIFICATION_VIBRATION, settingsData.getVibration());
        editor.putString(Constants.PREF_NOTIFICATION_CUSTOM_REPLIES, settingsData.getReplies());
        editor.putBoolean(Constants.PREF_NOTIFICATIONS_ENABLE_CUSTOM_UI, settingsData.isNotificationsCustomUi());
        editor.putBoolean(Constants.PREF_NOTIFICATION_ENABLE_SOUND, settingsData.isNotificationSound());
        editor.putBoolean(Constants.PREF_DISABLE_NOTIFICATIONS, settingsData.isDisableNotifications());
        editor.putBoolean(Constants.PREF_DISABLE_NOTIFICATIONS_REPLIES, settingsData.isDisableNotificationsReplies());
        editor.putBoolean(Constants.PREF_ENABLE_HARDWARE_KEYS_MUSIC_CONTROL, settingsData.isEnableHardwareKeysMusicControl());
        editor.putBoolean(Constants.PREF_NOTIFICATIONS_INVERTED_THEME, settingsData.isInvertedTheme());
        editor.putString(Constants.PREF_NOTIFICATIONS_FONT_TITLE_SIZE, settingsData.getFontTitleSize());
        editor.putString(Constants.PREF_NOTIFICATIONS_FONT_SIZE, settingsData.getFontSize());
        editor.putBoolean(Constants.PREF_DISABLE_NOTIFICATIONS_SCREENON, settingsData.isDisableNotificationsScreenOn());
        editor.putInt(Constants.PREF_SHAKE_TO_DISMISS_GRAVITY, settingsData.getShakeToDismissGravity());
        editor.putInt(Constants.PREF_SHAKE_TO_DISMISS_NUM_OF_SHAKES, settingsData.getShakeToDismissNumOfShakes());
        editor.putBoolean(Constants.PREF_PHONE_CONNECTION_ALERT, settingsData.isPhoneConnectionAlert());
        editor.putBoolean(Constants.PREF_PHONE_CONNECTION_ALERT_STANDARD_NOTIFICATION, settingsData.isPhoneConnectionAlertStandardNotification());
        editor.putString(Constants.PREF_DEFAULT_LOCALE, settingsData.getDefaultLocale());
        editor.putBoolean(Constants.PREF_DISABLE_DELAY, settingsData.isDisableDelay());
        editor.putBoolean(Constants.PREF_AMAZMOD_KEEP_WIDGET, settingsData.isAmazModKeepWidget());
        editor.putBoolean(Constants.PREF_AMAZMOD_OVERLAY_LAUNCHER, settingsData.isOverlayLauncher());
        editor.putBoolean(Constants.PREF_AMAZMOD_HOURLY_CHIME, settingsData.isHourlyChime());
        editor.putBoolean(Constants.PREF_HEARTRATE_DATA, settingsData.isHeartrateData());
        editor.putInt(Constants.PREF_BATTERY_WATCH_ALERT, settingsData.getBatteryWatchAlert());
        editor.putInt(Constants.PREF_BATTERY_PHONE_ALERT, settingsData.getBatteryPhoneAlert());
        editor.putInt(Constants.PREF_LOG_LINES, settingsData.getLogLines());

        editor.apply();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(key, defaultValue);
    }

    public int getInt(String key, int defaultValue) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(key, defaultValue);
    }

    public long getLong(String key, long defaultValue) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong(key, defaultValue);
    }

    public String getString(String key, String defaultValue) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(key, defaultValue);
    }

    public void putBoolean(String key, boolean value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(key, value).apply();
    }

    public void putString(String key, String value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(key, value).apply();
    }

}
