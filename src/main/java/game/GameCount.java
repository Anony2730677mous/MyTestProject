package game;

import java.util.HashMap;
import java.util.Map;

public class GameCount
    {

        private final Map<String, Integer> map;
        GameCount()
        {
            map = new HashMap<>();
        }
        public void addUser(String name)
        {
            if(!map.containsKey(name))
            {
                map.put(name, 0);
            }
        }
        public Integer getGameCount(String name)
        {
            Integer gameCount = 0;
            if(map.containsKey(name))
            {
                gameCount = map.get(name);
            }
            return gameCount;
        }

        public void setGameCount(String name, Integer gameCount)
        {
            if(map.containsKey(name))
            {
                map.replace(name, map.get(name), gameCount);
            }
        }

        public boolean getThisUser(String name)
        {
            return map.containsKey(name);
        }

    }

