import java.awt.*;

import javax.swing.*;

class ChessBoard extends JPanel {
    private int size;

    public ChessBoard(int size) {
        this.setPreferredSize(new Dimension(size, size));

        this.size = size;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int tileSize = size / 8;

        // Fill black.
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Color white tiles.
        g.setColor(Color.WHITE);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == j % 2) {
                    g.fillRect(i * tileSize, j * tileSize, tileSize, tileSize);
					
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("rashid");
        Container c = new ChessBoard(400);

        f.setContentPane(c);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.pack();
        f.setVisible(true);
    }
}

