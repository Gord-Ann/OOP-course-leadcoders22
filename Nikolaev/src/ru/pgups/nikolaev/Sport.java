package ru.pgups.nikolaev;

public class Sport {
    public static void main(String[] args) {
        System.out.println();
        Stadium arena = new Stadium("Apex", 25430, "Air street, 20");
        System.out.println(arena.getAddress());
        System.out.println(arena.getName());
        System.out.println(arena.getCapacity());
        System.out.println();

        Ball ball = new Ball("basketball", "rubber", 300);
        System.out.println(ball.getTypeOfSport());
        System.out.println(ball.getMaterial());
        System.out.println(ball.getWeight());
        System.out.println();

        Coach coach = new Coach("John", 20,3);
        System.out.println(coach.getName());
        System.out.println(coach.getStanding());
        System.out.println(coach.getRating());
        System.out.println();

        Field field = new Field("laminate", 14, 25);
        System.out.println(field.getCoating());
        System.out.println(field.getWidth());
        System.out.println(field.getLength());
        System.out.println();

        Match match = new Match("Bears", 85, 65);
        System.out.println(match.getWinner());
        System.out.println(match.getScore());
        System.out.println(match.getDuration());
        System.out.println();

        Player player = new Player("Peter", 80, 185);
        System.out.println(player.getName());
        System.out.println(player.getGrowth());
        System.out.println(player.getWeight());
        System.out.println();

        Referee referee = new Referee("Alex", 20, 5);
        System.out.println(referee.getName());
        System.out.println(referee.getStanding());
        System.out.println(referee.getRating());
        System.out.println();

        Team team = new Team("SPB", 6, "Sokolov");
        System.out.println(team.getName());
        System.out.println(team.getAmount());
        System.out.println(team.getCapitan());
        System.out.println();

        Uniform uniform = new Uniform("white", 48, "summer");
        System.out.println(uniform.getColor());
        System.out.println(uniform.getSeason());
        System.out.println(uniform.getSize());
        System.out.println();
    }



}

