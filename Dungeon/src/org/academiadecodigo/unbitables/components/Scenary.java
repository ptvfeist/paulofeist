package org.academiadecodigo.unbitables.components;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Scenary {

    public static final int PADDING = 10;
    public static final int PIXELS = 20;

    private Blocks[] blocks = new Blocks[20];

    private Picture background;
    private Picture[] grid;

    public Scenary() {

        background = new Picture(PADDING, PADDING, "blackBackground.jpeg");
        setLimits();

    }

    public void init() {
        background.draw();
    }

    public void setLimits() {

        blocks[0] = new Blocks(10, 10, 200, 150);
        blocks[1] = new Blocks( 300, 500, 100, 100);
        blocks[2] = new Blocks( 500, 300, 100, 100);
        blocks[3] = new Blocks( 800, 500, 100, 200);
        blocks[4] = new Blocks( 500, 300, 100, 100);


    }

    public Blocks[] getBlocks() {
        return blocks;
    }
}
