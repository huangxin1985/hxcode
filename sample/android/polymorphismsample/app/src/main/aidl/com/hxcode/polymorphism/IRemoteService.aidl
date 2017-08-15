// IRemoteService.aidl
package com.hxcode.polymorphism;

// Declare any non-default types here with import statements
import com.hxcode.polymorphism.DataWrapper;

interface IRemoteService {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void sendData(in DataWrapper data);
}
