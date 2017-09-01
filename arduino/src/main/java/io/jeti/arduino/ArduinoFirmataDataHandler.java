package io.jeti.arduino;

public interface ArduinoFirmataDataHandler{
    void onSysex(byte command, byte[] data);
}