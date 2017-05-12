package com.pedro.encoder.input.video;

import android.view.Surface;

/**
 * Created by pedro on 20/01/17.
 */

public interface GetCameraData {

    void inputYv12Data(byte[] buffer);

    void inputNv21Data(byte[] buffer);

    void getSurface(Surface surface);
}
