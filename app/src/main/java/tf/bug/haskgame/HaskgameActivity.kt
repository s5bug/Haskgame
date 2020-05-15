package tf.bug.haskgame

import android.app.Activity
import android.opengl.GLSurfaceView
import android.os.Bundle

class HaskgameActivity : Activity() {

    private lateinit var glView: GLSurfaceView

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        glView = HaskgameGLSurfaceView(this)
        setContentView(glView)
    }

}