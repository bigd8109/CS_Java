package DesignPattern.Observer_Pattern2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Subject {
    private PropertyChangeSupport support;
    int state;

    public Subject() {
        support = new PropertyChangeSupport(this);
    }

    public void setState(int state) {
        notifyListener(state);
    }

    public void registerListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removeListener(PropertyChangeListener pcl) {
        if (support != null) {
            support.removePropertyChangeListener(pcl);
        }
    }

    public void notifyListener(int state) {
        support.firePropertyChange("event", null, state);
    }
}
