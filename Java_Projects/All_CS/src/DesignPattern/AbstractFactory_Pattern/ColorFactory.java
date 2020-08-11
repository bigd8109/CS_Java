package DesignPattern.AbstractFactory_Pattern;

public class ColorFactory extends AbstractFactory<Color> {
    @Override
    public Color create(String type) {
        if (type.equalsIgnoreCase("Black")) {
            return new BlackColor();
        } else if (type.equalsIgnoreCase("White")) {
            return new WhiteColor();
        }
        return null;
    }
}
