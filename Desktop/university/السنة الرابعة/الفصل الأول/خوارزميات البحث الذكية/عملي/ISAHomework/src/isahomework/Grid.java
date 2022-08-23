/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isahomework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author hp
 */
public class Grid {
    int n,m;
    //boolean win = false;
    public int [][] tiles;
    //Shape []shapes;
    Grid(int GameNumber){
    switch(GameNumber){
        case 1:
            this.n = 4;
            this.m = 4;
            tiles = new int[4][4];
            tiles[0][0] = 1;
            tiles[1][0] = 1;
            tiles[0][1] = 1;
            tiles[0][2] = 1;
            tiles[1][2] = 1;
            tiles[2][2] = 1;
            tiles[1][1] = 2;
            tiles[2][0] = 2;
            tiles[2][1] = 2;
            break;
    }
    }
    /*void startGame(){
        printGrid();
        System.out.println();
        printClone();
        while(!checkWin(1)){
            int choice;
            boolean r = false,l = false,d = false,u = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number of peice you want to move");
            choice = scanner.nextInt();
                    
                    if(canMoveRight(choice)){
                        r = true;
                    }
                    if(canMoveLeftt(choice)){
                        l = true;
                    }
                    if(canMoveUp(choice)){
                        u = true;
                    }
                    if(canMoveDown(choice)){
                        d = true;
                    }
                    if(r) System.out.println("press 1 to move right");
                    if(l) System.out.println("press 2 to move left");
                    if(u) System.out.println("press 3 to move Up");
                    if(d) System.out.println("press 4 to move down");
                    else if(!r && !l && !u && !d){
                        System.out.println("sorry ,You can't move this peice");
                        continue;
                    }
                    int s;
                    s = scanner.nextInt();
                    if(s == 1) {moveRight(choice); printGrid();}
                    if(s == 2) {moveLeft(choice); printGrid();}
                    if(s == 3) {moveUp(choice);printGrid();}
                    if(s == 4) {moveDown(choice);printGrid();}
        }
        if(checkWin(1)){
            System.out.println("Congrats!! You win");
        }
    }*/
    boolean canMoveRight(int shapeNum){
        for(int i = 0; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                if(tiles[i][j] == shapeNum && j == n-1){
                    return false;
                }
                else if(tiles[i][j] == shapeNum){
                    if(tiles[i][j+1] != 0 && tiles[i][j+1] != shapeNum){
                        return false;
                    }
                }
            }
        return true;
    }
    boolean canMoveLeftt(int shapeNum){
        for(int i = 0; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                if(tiles[i][j] == shapeNum && j == 0){
                    return false;
                }
                else if(tiles[i][j] == shapeNum){
                    if(tiles[i][j-1] != 0 && tiles[i][j-1] != shapeNum){
                        return false;
                    }
                }
            }
        return true;
    }
    boolean canMoveUp(int shapeNum){
        for(int i = 0; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                if(tiles[i][j] == shapeNum && i == 0){
                    return false;
                }
                else if(tiles[i][j] == shapeNum){
                    if(tiles[i-1][j] != 0 && tiles[i-1][j] != shapeNum){
                        return false;
                    }
                }
            }
        return true;
    }
    boolean canMoveDown(int shapeNum){
        for(int i = 0; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                if(tiles[i][j] == shapeNum && i == n-1){
                    return false;
                }
                if(tiles[i][j] == shapeNum){
                    if(tiles[i+1][j] != 0 && tiles[i+1][j] != shapeNum){
                        return false;
                    }
                }
            }
        return true;
    }
    void moveRight(int shapeNum){
        boolean check1 = false , check2 = false;
        for(int i = 0; i < n ; i++)
            for(int j = m-1 ; j >= 0 ; j--){
                if(tiles[i][j] == shapeNum && j != m-1){
                    tiles[i][j] = 0;
                    tiles[i][j+1] = shapeNum;
            }
    }
        /*for(int i = 0; i < n ; i++)
            for(int j = 0 ; j < m ; j++){ 
                if(j != m-1){}
                else if(tiles[i][j] == shapeNum && tiles[i][j+1] == shapeNum){ 
                    tiles[i][j] = 0;
                    check1 = true;
                } 
                else if(tiles[i][j] == shapeNum && tiles[i][j+1] != shapeNum && check1 && j != m-1){
                    //tiles[i][j] = 0;
                    tiles[i][j+1] = shapeNum;
                    //check2 = true;
                    check1 = false;
            }
                else if(tiles[i][j] == shapeNum && check2){
                    tiles[i][j] = 0;
                    tiles[i][j+1] = shapeNum;
                }
                else{
                    tiles[i][j] = 0;
                    tiles[i][j+1] = shapeNum;
                }
                
    }
    }*/
    }
    void moveLeft(int shapeNum){
        for(int i = 0; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                if(tiles[i][j] == shapeNum && j != 0){
                    tiles[i][j] = 0;
                    tiles[i][j-1] = shapeNum;
            }
    }
    }
    void moveUp(int shapeNum){
        for(int i = 0; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                if(tiles[i][j] == shapeNum && i != 0){
                    tiles[i][j] = 0;
                    tiles[i-1][j] = shapeNum;
            }
    }
    }
    void moveDown(int shapeNum){
        for(int i = n-1 ; i >= 0 ; i--)
            for(int j = 0 ; j < m ; j++){
                if(tiles[i][j] == shapeNum && i != n-1){
                    tiles[i][j] = 0;
                    tiles[i+1][j] = shapeNum;
            }
    }
    }
    boolean checkWin(int shapeNum){
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                if(tiles[i][j] == shapeNum && (i == n-1) && (j == m-1)){
                    return true;
                }
            }
        return false;
    }
    void printGrid(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++){
                if(tiles[i][j] == 1){
                    System.out.print(ANSI_RED + tiles[i][j] + " " + ANSI_RESET);
                }
                else
                    System.out.print(tiles[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Grid other = (Grid) obj;
        if (!Arrays.deepEquals(this.tiles, other.tiles)) {
            return false;
        }
        return true;
    }
    int [][] cloneGrid(){
        int [][] cloneTiles = new int[n][m];
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                cloneTiles[i][j] = tiles[i][j];
            }
        return cloneTiles;
    }
    
    void printClone(){
        int [][] c;
        c = cloneGrid();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Grid 
}
