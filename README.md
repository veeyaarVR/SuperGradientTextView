# SuperGradientTextView
A simple library to add gradient color to textView in android native

Why SuperGradientTextView?
---------------------

 - You can change color of textView into **gradient** combination of two colors
 - You can set the orientation of gradient to either **vertical** or **horizontal**
 - Supports both **kotlin** and **java**
 
 
 
Gradle
---------------------
    dependencies {
            implementation 'com.github.veeyaarVR:SuperGradientTextView:(latest version)'

    }
    
    
    repositories {
            jcenter()
            maven {
            url "https://jitpack.io"
            }
    }
    
How to use?
-----------

**Add Gradient text view in your xml**

```xml
    <com.veeyaar.supergradienttextview.GradientTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Gradient Text View"
        app:startColor="@color/Blue"
        app:endColor="@color/Green"
        app:isVertical="false"
        />   
```

**Attributes**
```xml
  app:startColor="@color/Blue"
  app:endColor="@color/Green"
```

If you haven't defined any color, default color will be used (**Color.BLUE, Color.GREEN**)

```xml
  app:isVertical="false"
```

If **true**, it sets the gradient from **left to right**. Else it sets from **right to left**
