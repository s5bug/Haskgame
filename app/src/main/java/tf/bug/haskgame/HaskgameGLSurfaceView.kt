package tf.bug.haskgame

import android.content.Context
import android.opengl.GLSurfaceView
import android.view.View

class HaskgameGLSurfaceView(context: Context) : GLSurfaceView(context) {

    private val renderer: HaskgameGLRenderer

    init {
        setEGLContextClientVersion(2)

        renderer = HaskgameGLRenderer()

        setRenderer(renderer)

        renderMode = RENDERMODE_WHEN_DIRTY

        systemUiVisibility =
            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                    View.SYSTEM_UI_FLAG_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
    }

}
