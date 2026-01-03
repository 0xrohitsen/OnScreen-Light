package com.onscreenlight

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.util.*

class AnalogClockView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var radius = 0f
    private var centerX = 0f
    private var centerY = 0f

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        // Use 90% of available space for the clock
        radius = (Math.min(w, h) / 2f) * 0.9f
        centerX = w / 2f
        centerY = h / 2f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val calendar = Calendar.getInstance()
        val hours = calendar.get(Calendar.HOUR)
        val minutes = calendar.get(Calendar.MINUTE)
        val seconds = calendar.get(Calendar.SECOND)

        // Set Paint properties for a minimal look
        paint.style = Paint.Style.STROKE
        paint.strokeCap = Paint.Cap.ROUND
        
        // 1. Draw Subtle Clock Outer Ring (Thin white line)
        paint.color = Color.WHITE
        paint.alpha = 40 // Very subtle outer ring
        paint.strokeWidth = 2f
        canvas.drawCircle(centerX, centerY, radius, paint)

        // 2. Draw Hour Tick Marks (Minimal, no numbers)
        paint.alpha = 255
        paint.strokeWidth = 3f
        for (i in 0 until 12) {
            val angle = Math.toRadians((i * 30).toDouble())
            // Short ticks at the edge
            val startX = centerX + (radius * 0.94f * Math.sin(angle)).toFloat()
            val startY = centerY - (radius * 0.94f * Math.cos(angle)).toFloat()
            val endX = centerX + (radius * Math.sin(angle)).toFloat()
            val endY = centerY - (radius * Math.cos(angle)).toFloat()
            canvas.drawLine(startX, startY, endX, endY, paint)
        }

        // 3. Draw Hands with "Thin White Lines" style
        
        // Hour Hand (Shortest)
        drawHand(canvas, ((hours + minutes / 60f) * 30).toDouble(), radius * 0.5f, 5f, Color.WHITE)

        // Minute Hand (Longer)
        drawHand(canvas, ((minutes + seconds / 60f) * 6).toDouble(), radius * 0.8f, 3f, Color.WHITE)

        // Second Hand (Longest, very thin)
        // Note: Using white instead of red to keep it minimal as requested
        drawHand(canvas, (seconds * 6).toDouble(), radius * 0.9f, 1.5f, Color.WHITE)

        // 4. Center Point (Small, minimal)
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        canvas.drawCircle(centerX, centerY, 4f, paint)

        // Refresh every second
        postInvalidateDelayed(1000)
    }

    private fun drawHand(canvas: Canvas, angleDeg: Double, length: Float, strokeWidth: Float, color: Int) {
        paint.color = color
        paint.strokeWidth = strokeWidth
        paint.style = Paint.Style.STROKE
        val angleRad = Math.toRadians(angleDeg)
        val stopX = centerX + (length * Math.sin(angleRad)).toFloat()
        val stopY = centerY - (length * Math.cos(angleRad)).toFloat()
        canvas.drawLine(centerX, centerY, stopX, stopY, paint)
    }
}
