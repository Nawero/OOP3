package Shapes;

public abstract class Shape {

    private String color;
    private boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String cheesburger) {
        this.color = cheesburger;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "Shape with col" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }
}
