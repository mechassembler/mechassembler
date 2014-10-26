package view.builder;

import org.lwjgl.opengl.DisplayMode;
import util.Program;
import view.Camera;
import view.View;

/**
 * Created on 10/21/14.
 *
 * @author Mike Sorokin
 */
public class ViewBuilder {
    private int x = 800;
    private int y = 600;
    private boolean fullscreen = false;
    private boolean vSync = false;
    private boolean resizable = false;
    private boolean mouseGrabbed = false;
    private String title = "Window";
    private Camera camera = new CameraBuilder().build();
    private String program = null;
    private boolean drawAxes = false;

    public ViewBuilder setX(int x) {
        this.x = x;
        return this;
    }

    public ViewBuilder setY(int y) {
        this.y = y;
        return this;
    }

    public ViewBuilder setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
        return this;
    }

    public ViewBuilder setVSync(boolean vSync) {
        this.vSync = vSync;
        return this;
    }

    public ViewBuilder setResizable(boolean resizable) {
        this.resizable = resizable;
        return this;
    }

    public ViewBuilder setMouseGrabbed(boolean mouseGrabbed) {
        this.mouseGrabbed = mouseGrabbed;
        return this;
    }

    public ViewBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ViewBuilder setCamera(Camera camera) {
        this.camera = camera;
        return this;
    }

    public ViewBuilder setProgram(String program) {
        this.program = program;
        return this;
    }

    public ViewBuilder setDrawAxes(boolean drawAxes) {
        this.drawAxes = drawAxes;
        return this;
    }

    public View build() {
        return new View(new DisplayMode(x, y), fullscreen, vSync, resizable, mouseGrabbed, title, camera, program, drawAxes);
    }
}
