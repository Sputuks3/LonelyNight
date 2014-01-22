package org.spf.utils.gps;

abstract public interface SPFFoundLocation {
    abstract public void locationError(String arg);
    
    
    abstract public void locationFound(android.location.Location arg);
}