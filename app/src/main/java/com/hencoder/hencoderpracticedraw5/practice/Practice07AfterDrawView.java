package com.hencoder.hencoderpracticedraw5.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class Practice07AfterDrawView extends AppCompatImageView {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice07AfterDrawView(Context context) {
        super(context);
    }

    public Practice07AfterDrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice07AfterDrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

        // 在 super.draw() 的下方插入绘制代码，让绘制内容盖住其他所有
        // 由于这期的重点是绘制代码的位置而不是绘制代码本身，所以直接给出绘制代码，你只要解除注释就好
        paint.setColor(Color.parseColor("#FF23ADE5"));
        Path path = new Path();
        path.moveTo(getWidth() - 200, 0);
        path.lineTo(getWidth(), 0);
        path.lineTo(getWidth(), 200);
        path.close();
        canvas.drawPath(path, paint);

        path.reset();
        path.moveTo(getWidth() - 180, 0);
        path.lineTo(getWidth(), 180);
        paint.setColor(Color.WHITE);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawTextOnPath("New", path, 0, -20, paint);
    }
}