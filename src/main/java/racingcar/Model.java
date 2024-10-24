package racingcar;

import camp.nextstep.edu.missionutils.Randoms;


import java.util.HashMap;

public class Model {

    public static String getStep(String step, int randomNumber){
        if (randomNumber > 5) step += "-";
        return step;
    }

    public static HashMap<String, String> makeRacingHashmap(String[] listUser, int round){
        HashMap<String, String> racingHashmap = new HashMap<>();
        for (String name:listUser) {
            if(name.length() > 5){
                throw new IllegalArgumentException("참가자명은 5글자 이하여야 합니다. 다시 입력하세요");
            }
            racingHashmap.put(name, "");
        }
        for (int i = 0; i < round; i++) {
            for (String name : racingHashmap.keySet()) {
                String step = getStep(racingHashmap.get(name), Randoms.pickNumberInRange(0, 9));
                racingHashmap.replace(name, step);
            }
            System.out.println(racingHashmap);
        }

        return racingHashmap;
    }

}