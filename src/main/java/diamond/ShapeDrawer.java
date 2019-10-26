package diamond;

public class ShapeDrawer {
    public static void main(String[] args) {
        draw(10);
    }

    private static void draw(int size) {
        for (int j = 0; j < size ; j++) {
            drawSpaces(size - j -1);
            drawStars(size);
            System.out.println();
            
        }
    }

    private static void drawSpaces (int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    private static void drawStars (int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }
}
