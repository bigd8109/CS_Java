package DesignPattern.Observer_Pattern2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class OctalObserver implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Change in OctalObserver: " + Integer.toOctalString(evt.getNewValue().hashCode()).toUpperCase());
    }
}
