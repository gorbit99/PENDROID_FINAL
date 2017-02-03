package io.github.scaliermaelstrom.pendroid.minigames;

import io.github.scaliermaelstrom.pendroid.input.Touch;
import me.isostudios.spartanengine.rendering.spritebatch.SpriteBatch;

public abstract class MiniGame {

    protected Touch touch;
    protected int currentScore;
    protected int difficulty;

    public MiniGame(Touch touch, int currentScore, int difficulty) {
        this.touch = touch;
        this.currentScore = currentScore;
        this.difficulty = difficulty;
    }

    public abstract void update();
    public abstract void render(SpriteBatch spriteBatch);

}
