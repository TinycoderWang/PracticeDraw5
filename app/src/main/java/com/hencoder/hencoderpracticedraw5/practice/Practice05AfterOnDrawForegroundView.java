package com.hencoder.hencoderpracticedraw5.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class Practice05AfterOnDrawForegroundView extends AppCompatImageView {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice05AfterOnDrawForegroundView(Context context) {
        super(context);
    }

    public Practice05AfterOnDrawForegroundView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice05AfterOnDrawForegroundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);

        // 在 super.onDrawForeground() 的下方插入绘制代码，让绘制内容盖住前景
        // 由于这期的重点是绘制代码的位置而不是绘制代码本身，所以直接给出绘制代码，你只要解除注释就好
        paint.setColor(Color.parseColor("#FFf44336"));
        Path path = new Path();
        path.lineTo(200, 0);
        path.lineTo(0, 200);
        path.close();
        canvas.drawPath(path, paint);

        path.reset();
        path.moveTo(0, 180);
        path.lineTo(180, 0);
        paint.setColor(Color.WHITE);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawTextOnPath("New", path, 0, -20, paint);

    }
}
