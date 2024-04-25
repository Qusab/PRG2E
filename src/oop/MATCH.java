package oop;

public class MATCH {
    String hostTeam, homeTeam;
    private int hostScore, homeScore;

    public String getHostTeam() {
        return hostTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public int getHostScore() {
        return hostScore;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHostScore(int hostScore) {
        this.hostScore = hostScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }
//     String getResult(){
//        if (homeScore>hostScore){
//            return "Vyhral";
//        } else if (homeScore<hostScore) {
//            System.out.println("Prohral");
//        }else (homeScore==hostScore){
//             System.out.println("remize");
//        }
//
//    }
}
