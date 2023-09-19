package GUI_Utils;

import static GUI_Utils.GetResponse.State.*;
import static Utils.Utility.sleep;

public class GetResponse {
    enum State {
        YES, NO, LIMBO
    }

    private State answer = LIMBO;

    public boolean isYes() {
        while(answer.equals(LIMBO)) {
            sleep(200);
        }
        return answer.equals(YES);
    }

    public boolean isNo() {
        while(answer.equals(LIMBO)) {
            sleep(200);
        }
        return answer.equals(NO);
    }

    public boolean inLimbo() {
        return answer.equals(LIMBO);
    }

    public void setAnswer(boolean answer) {
        this.answer = answer ? YES : NO;
    }
}