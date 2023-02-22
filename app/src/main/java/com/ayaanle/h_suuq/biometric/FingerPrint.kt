package com.ayaanle.h_suuq.biometric

import android.app.KeyguardManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.CancellationSignal
import android.widget.Toast
import androidx.biometric.BiometricPrompt
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.content.ContextCompat.startActivity

class FingerPrint {
   private lateinit var cancellationSignal: CancellationSignal
   private val authenticationCallBack:BiometricPrompt.AuthenticationCallback
           get() =
               object:BiometricPrompt.AuthenticationCallback()
               {
                   override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                       super.onAuthenticationError(errorCode, errString)
                       notifyUser("Authentication has encountered an error")
                   }

                   override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                       super.onAuthenticationSucceeded(result)
                       notifyUser("Authentication successfull")
                       startActivity(Intent(MainActivity.class))
                   }
               }
    private fun notifyUser(message:String)
    {
        Toast.makeText(this , message,Toast.LENGTH_SHORT ).show()
    }
    private fun CheckBiometricSupportSupport():Boolean{
        val keyguardManager : KeyguardManager = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager
        if(!keyguardManager.isKeyguardSecure)
        {
            notifyUser("FingerPrint has not been enabled in settings")
            return false
        }
        if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.USE_BIOMETRIC) != PackageManager.PERMISSION_GRANTED)
        {
            notifyUser("FIngerPrint permission has not beeen granted")
            return false
        }

    }
}