package game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GameLogicTest {
    private GameLogic gameLogic;
    @BeforeAll
    void init()
    {
        gameLogic =  new GameLogic();
        gameLogic.addAnswer();
    }
    @Test
    void answer_Null_String_Argument_Test()
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> gameLogic.answer(null));
    }
    @Test
    void answer_Return_No_Empty_List_Test()
    {
        init();
        List<String> gameState = new ArrayList<>();
        gameState.add(gameLogic.answerListGetAnswer("Ты потерял память. Принять вызов НЛО?"));
        gameState.add(gameLogic.answerListGetAnswer("Ты принял вызов. Поднимешься на мостик к их капитану?"));
        gameState.add(gameLogic.answerListGetAnswer("Ты поднялся на мостик. Ты кто?"));
        for(String string: gameState)
        {
            Assertions.assertFalse( gameLogic.answer(string).isEmpty());
        }
    }
    @Test
    void answer_Return_List_Size_Test()
    {

        Assertions.assertEquals(4, gameLogic.answer("Ты потерял память. Принять вызов НЛО?").size());
    }
    @Test
    void answer_Return_String_Type_Test()
    {
        Assertions.assertEquals("String", gameLogic.answer("Ты потерял память. Принять вызов НЛО?").get(0).getClass().getSimpleName());
    }
}