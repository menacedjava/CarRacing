package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


public class CarRacingGame extends JPanel {


    private static final int BOARD_WIDTH = 400;
    private static final int BOARD_HEIGHT = 600;
    private static final int CAR_WIDTH = 30;
    private static final int CAR_HEIGHT = 50;
    private int carX = BOARD_WIDTH / 2 - CAR_WIDTH / 2;
    private int carY = BOARD_HEIGHT - CAR_HEIGHT - 10;
    private int roadX = BOARD_WIDTH / 2 - 60;
    private int roadWidth = 120;
    private int speed = 2;

    private int[] obstaclesX;
    private int[] obstaclesY;
    private boolean gameOver = false;


    private final int OBSTACLE_WIDTH = 40;
    private final int OBSTACLE_HEIGHT = 40;
//
//    public CarRacingGame() {
//        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
//        obstaclesX = new int[3]; // 3 ta to'siq
//        obstaclesY = new int[3]; // 3 ta to'siq
//
//
//        addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                if (gameOver) return;
//
//                int keyCode = e.getKeyCode();
//                if (keyCode == KeyEvent.VK_LEFT && carX > roadX) {
//                    carX -= 10;
//                } else if (keyCode == KeyEvent.VK_RIGHT && carX < roadX + roadWidth - CAR_WIDTH) {
//                    carX += 10;
//                }
//                repaint();
//            }
//        });
//
//        setFocusable(true);
//
//        generateObstacles();
//    }
//
//
//    public void generateObstacles() {
//        Random rand = new Random();
//        for (int i = 0; i < obstaclesX.length; i++) {
//            obstaclesX[i] = rand.nextInt(roadWidth - OBSTACLE_WIDTH) + roadX;
//            obstaclesY[i] = rand.nextInt(BOARD_HEIGHT / 2);
//        }
//    }
//
//
//    public void moveObstacles() {
//        for (int i = 0; i < obstaclesY.length; i++) {
//            obstaclesY[i] += speed;
//            if (obstaclesY[i] > BOARD_HEIGHT) {
//                obstaclesY[i] = -OBSTACLE_HEIGHT;
//                obstaclesX[i] = new Random().nextInt(roadWidth - OBSTACLE_WIDTH) + roadX;
//            }
//        }
//    }
//
//
//    public boolean checkCollision() {
//        for (int i = 0; i < obstaclesX.length; i++) {
//
//            if (obstaclesY[i] + OBSTACLE_HEIGHT > carY && obstaclesY[i] < carY + CAR_HEIGHT &&
//                    obstaclesX[i] + OBSTACLE_WIDTH > carX && obstaclesX[i] < carX + CAR_WIDTH) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//    public void updateGame() {
//        if (gameOver) return;
//
//        moveObstacles();
//
//        if (checkCollision()) {
//            gameOver = true;
//        }
//    }
//
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//
//        updateGame();
//
//        if (gameOver) {
//            g.setColor(Color.RED);
//            g.setFont(new Font("Arial", Font.BOLD, 40));
//            g.drawString("Game Over!", BOARD_WIDTH / 4, BOARD_HEIGHT / 2);
//            return;
//        }
//
//
//        g.setColor(Color.GRAY);
//        g.fillRect(roadX, 0, roadWidth, BOARD_HEIGHT);
//
//
//        g.setColor(Color.WHITE);
//        for (int i = 0; i < BOARD_HEIGHT; i += 40) {
//            g.fillRect(roadX + roadWidth / 2 - 5, i, 10, 20); // O'rta bo'g'in
//        }
//
//
//        g.setColor(Color.BLUE);
//        g.fillRect(carX, carY, CAR_WIDTH, CAR_HEIGHT);
//
//
//        g.setColor(Color.RED);
//        for (int i = 0; i < obstaclesX.length; i++) {
//            g.fillRect(obstaclesX[i], obstaclesY[i], OBSTACLE_WIDTH, OBSTACLE_HEIGHT);
//        }
//    }
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Car Racing Game");
//        CarRacingGame gamePanel = new CarRacingGame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(gamePanel);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//
//
//        while (!gamePanel.gameOver) {
//            try {
//                Thread.sleep(10);
//                gamePanel.repaint();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}