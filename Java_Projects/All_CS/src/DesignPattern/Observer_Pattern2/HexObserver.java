package DesignPattern.Observer_Pattern2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class HexObserver implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Change in HexObserver: " + Integer.toHexString(evt.getNewValue().hashCode()).toUpperCase());
    }
}
