package com.veeyaar.supergradienttextview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class GradientTextView extends TextView {

    private boolean isVertical;
    private int startColor = Color.BLUE;
    private int endColor = Color.GREEN;

    public GradientTextView(Context context) {
        super(context);
        init(context, null);

    }

    public GradientTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public GradientTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);

    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            final TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.GradientTextView);
            isVertical = attributes.getBoolean(R.styleable.GradientTextView_isVertical, false);
            startColor = attributes.getColor(R.styleable.GradientTextView_endColor, startColor);
            endColor = attributes.getColor(R.styleable.GradientTextView_startColor, endColor);
            attributes.recycle();
        }
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            Paint paint = getPaint();
            float width = paint.measureText(getText().toString());

            if (isVertical) {
                getPaint().setShader(new LinearGradient(0, 0, width, getLineHeight(),
                        endColor,
                        startColor,
                        Shader.TileMode.CLAMP));
            } else {
                getPaint().setShader(new LinearGradient(0, 0, 0, getLineHeight(),
                        endColor,
                        startColor,
                        Shader.TileMode.CLAMP));
            }
        }
    }
}
