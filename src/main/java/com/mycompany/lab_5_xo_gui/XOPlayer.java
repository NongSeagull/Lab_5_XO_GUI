/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_5_xo_gui;

/**
 *
 * @author 65160230 Piyapong
 */
public class XOPlayer {

    private char player;

    public XOPlayer() {
        this.player = ' ';
    }

    public XOPlayer(char symbol) {
        this.player = symbol;
    }

    public char getSymbol() {
        return player;
    }

    @Override
    public String toString() {
        return "Player is : " + player;
    }
}
