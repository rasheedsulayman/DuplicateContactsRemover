# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# ez-vcard
-dontwarn ezvcard.io.json.**
-dontwarn freemarker.**
-dontwarn org.jsoup.**
-keep class ezvcard.property.** { *; }
-keep class ezvcard.VCardVersion { *; }
-keep class com.github.mangstadt.vinnie.SyntaxStyle { *; }
#-keep class ezvcard.** { *; }

# crashlytics
-keep class com.crashlytics.** { *; }
-dontwarn com.crashlytics.**

# enums
-keep public class com.r4sh33d.duplicatecontactsremover.util.LoadingStatus { *; }
-keep public class com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria { *; }