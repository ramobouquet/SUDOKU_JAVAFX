package com.example.sudoku_express.Models;

/**
 * Esta clase representa una celda individual del tablero de Sudoku.
 * Cada celda conoce su posición (x, y) dentro del tablero
 * y mantiene una referencia al objeto Board que contiene
 * No crea nuevos tableros: simplemente usa la referencia existente.
 */
public class Cell {

    // Coordenadas dentro del tablero (fila y columna)
    private int x;
    private int y;

    // Referencia al tablero existente (no se crea uno nuevo)
    private Board board;

    /**
     * Constructor: crea una celda referenciada al tablero existente.
     * @param board objeto Board compartido por todas las celdas
     * @param x coordenada de fila (0–5)
     * @param y coordenada de columna (0–5)
     */
    public Cell(Board board, int x, int y) {
        this.board = board; // Referencia al tablero existente
        this.x = x;
        this.y = y;
    }

    /**
     * Obtiene el valor numérico actual de esta celda (1–6, o 0 si está vacía).
     */
    public int getValue() {
        return board.cellVGet(x, y);
    }

    /**
     * Indica si esta celda es fija (pista inicial del Sudoku) o editable.
     */
    public boolean isFixed() {
        return board.cellSGet(x, y);
    }

    /**
     * Intenta modificar el valor de la celda, solo si no es fija.
     * @param value nuevo valor (1–6)
     */
    public void setValue(int value) {
        if (!isFixed()) {
            board.cellMod(x, y, value);
        }
    }

    /**
     * Devuelve la coordenada X (fila).
     */
    public int getX() {
        return x;
    }

    /**
     * Devuelve la coordenada Y (columna).
     */
    public int getY() {
        return y;
    }
}
