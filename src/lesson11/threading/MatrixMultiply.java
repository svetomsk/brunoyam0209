package lesson11.threading;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MatrixMultiply {

    static class Task implements Runnable {
        private int [][] a;
        private int [][] b;
        private int [][] c;
        private int row;
        private int column;

        public Task(int[][] a, int[][] b, int[][] c, int row, int column) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.row = row;
            this.column = column;
        }

        @Override
        public void run() {
            for (int i = 0; i < a.length; i++) {
                c[row][column] += a[row][i] * b[i][column];
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int n = 10000;
        int [][] a = new int[n][n];
        int [][] b = new int[n][n];
        int [][] c = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt();
                b[i][j] = random.nextInt();
            }
        }

        long start = System.currentTimeMillis();

        int poolSize = 4;
        ThreadPoolExecutor pool = new ThreadPoolExecutor(poolSize, poolSize, 1, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pool.execute(new Task(a, b, c, i, j));
            }
        }

        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Parallel time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        multiplyMatrix(a, b, c);
        System.out.println("Consequent time: " + (System.currentTimeMillis() - start));
    }

    public static void multiplyMatrix(int [][] a, int [][] b, int [][] c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    c[i][j] = a[i][k] * b[k][j];
                }
            }
        }
    }
}
