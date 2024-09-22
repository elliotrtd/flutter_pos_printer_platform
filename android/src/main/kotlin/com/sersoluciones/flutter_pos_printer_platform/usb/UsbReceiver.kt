package com.sersoluciones.flutter_pos_printer_platform.usb

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbManager
import android.util.Log

class UsbReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("UsbReceiver", "Inside USB Broadcast action ${intent!!.action}")

        val action = intent.action
        if (UsbManager.ACTION_USB_DEVICE_ATTACHED == action) {

            var flags = 0

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
                flags = PendingIntent.FLAG_MUTABLE
            }

            val usbDevice: UsbDevice? = intent.getParcelableExtra(UsbManager.EXTRA_DEVICE)
            val intent: Intent = Intent("com.flutter_pos_printer.USB_PERMISSION")
            var activityThread: Class<*>? = null
            try {
                activityThread = Class.forName("android.app.ActivityThread")
                val appPackageName = context?.getPackageName()
                intent.setPackage(appPackageName)
            } catch (e: Exception) {
                // Not too important to throw anything
            }
            val permissionIntent: PendingIntent = PendingIntent.getBroadcast(context, 0, intent, flags)

            val mUSBManager = context?.getSystemService(Context.USB_SERVICE) as UsbManager?
            mUSBManager?.requestPermission(usbDevice, permissionIntent)

        }
    }
}

