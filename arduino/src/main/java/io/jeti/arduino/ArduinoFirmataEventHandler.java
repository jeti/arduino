package io.jeti.arduino;

public interface ArduinoFirmataEventHandler{
    void onClose();
    void onError(String errorMessage);
}