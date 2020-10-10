


import java.util.Scanner;

class Player{
    String id;
    String name;
    int scores[];
    int no_matches_played;

    Player(){}

    Player(String id1, String name1, int scores1[], int n){
        id = id1;
        name = name1;
        scores = scores1;
        no_matches_played = n;
    }
    
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player details:");
        System.out.println("Enter ID:");
        id = sc.next();
        System.out.println("Enter Name:");
        name = sc.next();
        System.out.println("Enter number of matches played:");
        no_matches_played = sc.nextInt();
        scores = new int[no_matches_played];
        for(int i = 0; i < no_matches_played; i++){
            System.out.println("Enter the score of match " + (i+1) + ":");
            scores[i] = sc.nextInt();
        }
    }
    void printDetails(){
        System.out.println("\nThe player details are:");
        System.out.println("ID: " + id + "\nName: " + name + "\nNo of matches played: " + no_matches_played);
        for(int i = 0; i < no_matches_played; i++){
            System.out.println("The score of the match " + (i+1) +": " + scores[i]);
        }
    }
    double avg(){
        int scoreSum = 0;
        for(int i = 0; i < no_matches_played; i++){
            scoreSum += scores[i];
        }
        return (scoreSum / (no_matches_played + 0.0));
    }
}


public class Playermain {
    public static void main(String[] args){
        int[] score = {3, 4, 7};
        double p1avg, p2avg;
        Player p1 = new Player();
        Player p2 = new Player("123", "Rahul", score, 3);
        p1.getDetails();
        p1avg = p1.avg();
        p2avg = p2.avg();
        p1.printDetails();
        p2.printDetails();
 System.out.println("The Average score of Player1 is "+p1avg);
 System.out.println("The Average score of Player2 is "+p2avg);

        if (p1avg > p2avg){
            System.out.println("\nPlayer 1 has the greatest average score.");
     p1.printDetails();
        }
        else if(p2avg > p1avg){
            System.out.println("\nPlayer 2 has the greatest average score.");
     p2.printDetails();
        }
        else{
            System.out.println("\nBoth player 1 and player 2 have equal average score. ");
      p1.printDetails();
      p2.printDetails();
        }
    }
}
