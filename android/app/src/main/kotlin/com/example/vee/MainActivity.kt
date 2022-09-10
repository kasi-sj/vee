// import androidx.annotation.NonNull
// import io.flutter.embedding.android.FlutterActivity
// import io.flutter.embedding.engine.FlutterEngine
// import io.flutter.plugin.common.MethodChannel

// class MainActivity: FlutterActivity() {
//   private val CHANNEL = "samples.flutter.dev/battery"

//   override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
//     super.configureFlutterEngine(flutterEngine)
//     MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler {
//       call, result ->
//       result.success("hello")
//       // This method is invoked on the main thread.
//       // TODO
//     }
//   }
// }
// package com.example.chatting

package com.example.flutter_application_2

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
}
