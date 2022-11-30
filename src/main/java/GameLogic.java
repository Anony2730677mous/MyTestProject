import java.util.ArrayList;
import java.util.List;

public class GameLogic {
    public List<String> answer(String gameState)
    {
        List<String> answer = new ArrayList<>();
        if(gameState.equals("Ты потерял память. Принять вызов НЛО?")) //gameState 0
        {
            answer.add(0, "Ты принял вызов. Поднимешься на мостик к их капитану?"); //gameState 1
            answer.add(1, "Подняться на мостик корабля");
            answer.add(2, "Отказаться подниматься на мостик");
            answer.add(3, "Ты не пошел на переговоры. Поражение!");

        }
        else if(gameState.equals("Ты принял вызов. Поднимешься на мостик к их капитану?")) //gameState 1
        {
            answer.add(0, "Ты поднялся на мостик. Ты кто?"); //gameState 2
            answer.add(1, "Рассказать правду о себе");
            answer.add(2, "Солгать о себе");
            answer.add(3, "Ты отказался подниматься на мостик. Поражение!");
        }
        else if(gameState.equals("Ты поднялся на мостик. Ты кто?")) //gameState 2
        {

            answer.add(0, "Тебя вернули домой. Победа!"); //gameState 2
            answer.add(1, "");
            answer.add(2, "");
            answer.add(3, "Ты рассказал неправду о себе. Поражение!");
        }
        return answer;
    }
}
