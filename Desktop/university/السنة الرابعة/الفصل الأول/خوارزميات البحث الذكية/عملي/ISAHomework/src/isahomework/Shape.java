/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isahomework;

/**
 *
 * @author hp
 */
public class Shape {
    
    Shape(int GameNumber , int ShapeNumber){
        /*switch(GameNumber){
            case 1:
                switch(ShapeNumber){
                    case 1:
                        piece = new boolean[2][3];
                        piece[0][0] = true;
                        piece[1][0] = true;
                        piece[0][1] = true;
                        piece[0][2] = true;
                        piece[1][2] = true;
                        piece[0][0] = true;
                        break;
                }
        }*/
    }
    void initalizeShapes(boolean [][] tiles,int shapeNumber){
        switch(shapeNumber){
            case 1:
                tiles[0][0] = true;
                tiles[1][0] = true;
                tiles[0][1] = true;
                tiles[0][2] = true;
                tiles[1][2] = true;
                tiles[2][2] = true;
                break;
            case 2:
                tiles[0][0] = true;
                tiles[1][0] = true;
                tiles[0][1] = true;
                tiles[0][2] = true;
                tiles[1][2] = true;
                tiles[2][2] = true;
                break;
            case 3:
                tiles[0][0] = true;
                tiles[1][0] = true;
                tiles[0][1] = true;
                tiles[0][2] = true;
                tiles[1][2] = true;
                tiles[2][2] = true;
                break;
        }
    }
}
