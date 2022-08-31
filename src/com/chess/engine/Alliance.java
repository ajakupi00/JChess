package com.chess.engine;

public enum Alliance {
    BLACK {
        @Override
        public int getDirection() {
            return 1;
        }
    },
    WHITE {
        @Override
        public int getDirection() {
            return -1;
        }
    };

    public abstract int getDirection();
}
