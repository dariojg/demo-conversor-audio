package com.conversorwavmp3;

import ws.schild.jave.AudioAttributes;
import ws.schild.jave.Encoder;
import ws.schild.jave.EncodingAttributes;
import ws.schild.jave.MultimediaObject;

import java.io.File;

public class Converter {

    public void to(Format format, File source, File dest) {
        try {
            AudioAttributes audio = new AudioAttributes();
         //   audio.setCodec("libmp3lame");  por default usa ffmpeg
            audio.setBitRate(8000);
            audio.setChannels(1);
            audio.setSamplingRate(8000);

            //Encoding attributes
            EncodingAttributes attrs = new EncodingAttributes();
            attrs.setFormat(format.label);
            attrs.setAudioAttributes(audio);

            //Encode
            Encoder encoder = new Encoder();

            encoder.encode(new MultimediaObject(source), dest, attrs);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            // TODO
        }
    }
}
