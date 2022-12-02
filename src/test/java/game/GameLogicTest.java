package game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {
    @Test
    void answer_Null_String_Argument_Test()
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new GameLogic().answer(null));
    }
//    @Test
//    void answer_Return_Empty_List_Test()
//    {
//        GameLogic gameLogic =  new GameLogic();
//        List<String> gameState = new ArrayList<>();
//        gameState.add(gameLogic.answerListGetAnswer("Ты потерял память. Принять вызов НЛО?"));
//        gameState.add(gameLogic.answerListGetAnswer("Ты принял вызов. Поднимешься на мостик к их капитану?"));
//        gameState.add(gameLogic.answerListGetAnswer("Ты поднялся на мостик. Ты кто?"));
//        for(String string: gameState)
//        {
//            Assertions.assertFalse( gameLogic.answer(string).isEmpty());
//        }
//    }
//    @Test
//    void answer()
//    {}
}