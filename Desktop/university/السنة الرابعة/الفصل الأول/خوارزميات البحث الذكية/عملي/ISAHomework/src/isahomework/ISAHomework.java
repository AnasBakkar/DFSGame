/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isahomework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author hp
 */
public class ISAHomework {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Grid> childs(Grid grid, int shapeNumber){
        ArrayList<Grid> ch = new ArrayList<>();
        if(grid.canMoveUp(shapeNumber)){
            Grid g = new Grid(1);
            g = grid;
            g.moveUp(shapeNumber);
            ch.add(g);
        }
        if(grid.canMoveDown(shapeNumber)){
            Grid g1 = new Grid(1);
            g1 = grid;
            g1.moveDown(shapeNumber);
            ch.add(g1);
        }
        if(grid.canMoveRight(shapeNumber)){
            Grid g2 = new Grid(1);
            g2 = grid;
            g2.moveRight(shapeNumber);
            ch.add(g2);
        }
        if(grid.canMoveLeftt(shapeNumber)){
            Grid g3 = new Grid(1);
            g3 = grid;
            g3.moveLeft(shapeNumber);
            ch.add(g3);
        }
        return ch;
    }
    static void DFS(Grid grid){
        Stack <Grid> states = new Stack<Grid>();
        HashSet <Grid> hashGrid = new HashSet<Grid>();
        states.push(grid);
        hashGrid.add(grid);
        while(!states.empty()){ 
            Grid grid1 = states.pop();
            grid1.printGrid();
            if(grid1.checkWin(1)){
                grid1.printGrid();
                System.out.println("got");
                break;
            }
            ArrayList<Grid> chil = null;
            for(int i = 1 ; i < 4 ; i++){
                chil = childs(grid1,i);
                System.out.println("got");
                System.out.println(chil.size());
            }
            
            for(int i = 0 ; i < 4 ; i++){
                for (Grid chil1 : chil) {
                    //if(!hashGrid.contains(chil1)){
                        System.out.println("got2");
                        chil1.printGrid();
                        states.push(chil1);
                        hashGrid.add(chil1);
                    //}
                }
            }
            //Grid [] childs = new Grid[];
        }
    }
    static void startGame(Grid grid){
        grid.printGrid();
        System.out.println();
        //printClone();
        while(!grid.checkWin(1)){
            int choice;
            boolean r = false,l = false,d = false,u = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number of peice you want to move");
            choice = scanner.nextInt();
                    
                    if(grid.canMoveRight(choice)){
                        r = true;
                    }
                    if(grid.canMoveLeftt(choice)){
                        l = true;
                    }
                    if(grid.canMoveUp(choice)){
                        u = true;
                    }
                    if(grid.canMoveDown(choice)){
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
                    if(s == 1 && r) {grid.moveRight(choice); grid.printGrid();}
                    else{
                        System.out.println("Wrong Move!!");
                        grid.printGrid();
                    }
                    if(s == 2 && l) {grid.moveLeft(choice); grid.printGrid();}
                    else{
                        System.out.println("Wrong Move!!");
                        grid.printGrid();
                    }
                    if(s == 3 && u) {grid.moveUp(choice);grid.printGrid();}
                    else{
                        System.out.println("Wrong Move!!");
                        grid.printGrid();
                    }
                    if(s == 4 && d) {grid.moveDown(choice);grid.printGrid();}
                    else{
                        System.out.println("Wrong Move!!");
                        grid.printGrid();
                    }
        }
        if(grid.checkWin(1)){
            System.out.println("Congrats!! You win");
        }
    }
    
    public static void main(String[] args) {
        int n,m;
        Scanner input = new Scanner(System.in);
        System.out.println("enter Game Number");
        n = input.nextInt();
        //m = input.nextInt();
        Grid grid = new Grid(n);
        //startGame(grid);
        DFS(grid);
    }
    
}
