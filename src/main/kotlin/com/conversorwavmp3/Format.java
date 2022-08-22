package com.conversorwavmp3;

public enum Format {
    WAV("wav"),
    MP3("mp3");

    public final String label;
    Format(String name) {
        label = name;
    }
}
