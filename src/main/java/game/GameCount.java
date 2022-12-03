package game;

import java.util.HashMap;
import java.util.Map;

public class GameCount
    {

        private final Map<String, Integer> map;
        private final String nullMessage = "Входящий аргумент = null";
        GameCount()
        {
            map = new HashMap<>();
        }
        public void addUser(String name)
        {
            if(name == null)
            {
                throw new IllegalArgumentException(nullMessage);
            }
            if(!map.containsKey(name))
            {
                map.put(name, 0);
            }


        }
        public Integer getGameCount(String name)
        {
            if(name == null)
            {
                throw new IllegalArgumentException(nullMessage);
            }
            Integer gameCount = 0;
            if(map.containsKey(name))
            {
                gameCount = map.get(name);
            }
            return gameCount;
        }

        public void setGameCount(String name, Integer gameCount)
        {
            if(name == null || gameCount == null)
            {
                throw new IllegalArgumentException(nullMessage);
            }
            if(map.containsKey(name))
            {
                map.replace(name, map.get(name), gameCount);
            }
        }

        public boolean getThisUser(String name)
        {
            if(name == null)
            {
                throw new IllegalArgumentException(nullMessage);
            }
            return map.containsKey(name);
        }

    }

