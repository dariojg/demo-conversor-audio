package com.conversorwavmp3;

import org.junit.jupiter.api.Test;

import java.io.File;

public class ConverterTest {

    @Test
    public void testConvertToWavToMp3() {
        Converter converter = new Converter();
        converter.to(Format.MP3, new File("files/audio_test.wav"), new File("files/output.mp3"));
    }

}
