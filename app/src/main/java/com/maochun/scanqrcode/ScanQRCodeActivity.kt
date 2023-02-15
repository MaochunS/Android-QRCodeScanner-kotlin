package com.maochun.scanqrcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.mlkit.vision.barcode.BarcodeScannerOptions
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.barcode.common.Barcode

class ScanQRCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan_qrcode)

        val options = BarcodeScannerOptions.Builder()
            .setBarcodeFormats(
                Barcode.FORMAT_QR_CODE,
                Barcode.FORMAT_AZTEC)
            .build()

//        val scanner = BarcodeScanning.getClient(options)
//        scanner.process(inputImage)
//            .addOnSuccessListener { barcodes ->
//                for (barcode in barcodes) {
//                    // Handle received barcodes...
//                }
//            }
//            .addOnFailureListener { }
    }
}