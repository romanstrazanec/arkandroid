package com.example.nay.arkanoid.GameObjects;

import android.graphics.Canvas;
import android.graphics.Paint;

public class GameObject {
    public float x, y;
    public int color;

    public GameObject(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public GameObject(float x, float y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw(Canvas canvas, Paint paint){
        paint.setColor(color);
    }
}
