package engine.graphics;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

/**
 * @author Pavel A Rectangle based on my other Project JBreakout. This Rectangle
 *         is based on LWJGL. I tworked once, but now it doesn't seem to work
 *         anymore
 */
public class LibGDXUnfilledRectangle extends LibGDXRectangle {

	public LibGDXUnfilledRectangle(float width, float height, Color color) {
		super(width, height, color);
	}

	public LibGDXUnfilledRectangle(float width, float height) {
		super(width, height);
	}

	public LibGDXUnfilledRectangle(float width, float height, float r, float g,
			float b) {
		super(width, height, r, g, b);
	}

	@Override
	public void draw(float x, float y, float globalScale, SpriteBatch batch) {

		super.drawAux(x, y, globalScale, batch, ShapeType.Line);
	}

}
