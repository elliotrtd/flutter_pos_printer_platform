package com.sersoluciones.flutter_pos_printer_platform.usb

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbManager
import android.util.Log
import com.sersoluciones.flutter_pos_printer_platform.usb.USBPrinterService


class UsbReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
//        Log.d("UsbReceiver", "Inside USB Broadcast action ${intent!!.action}")
//
//        val action = intent.action
//        if (UsbManager.ACTION_USB_DEVICE_ATTACHED == action) {
//
//            val usbDevice: UsbDevice? = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
//                intent.getParcelableExtra(UsbManager.EXTRA_DEVICE, UsbDevice::class.java)
//            } else {
//                intent.getParcelableExtra(UsbManager.EXTRA_DEVICE)
//            }
//
//            if (usbDevice != null) Log.v(
//                "UsbReceiver",
//                "usbDevic receive for device: vendor_id: " + usbDevice.vendorId + ", product_id: " + usbDevice.productId
//            )
//            else {
//                Log.v("UsbReceiver", "printing receive usbDevice is null")
//            }
//
//            Log.v("UsbReceiver", "printing receive requesting permission")
//
//            val mPermissionIndent = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
//                PendingIntent.getBroadcast(context, 0, Intent(USBPrinterService.mUsbDeviceReceiver), PendingIntent.FLAG_IMMUTABLE )
//            } else {
//                PendingIntent.getBroadcast(context, 0, Intent("com.flutter_pos_printer.USB_PERMISSION"), 0)
//            }
//            val mUSBManager = context?.getSystemService(Context.USB_SERVICE) as UsbManager?
//            mUSBManager?.requestPermission(usbDevice, mPermissionIndent)
//            if(mUSBManager != null && mUSBManager!!.hasPermission(usbDevice)){
//                Log.v("UsbReceiver", "UsbReceiver permission allowed: " + usbDevice?.productId)
//            }
//            else {
//                Log.v("UsbReceiver", "UsbReceiver no permission allowed: " + usbDevice?.productId)
//            }
//
//        }
    }
}
