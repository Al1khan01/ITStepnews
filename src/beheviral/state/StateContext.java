package beheviral.state;

public class StateContext {
    private State state;
    public StateContext(){
        state = null;
    }
    public void setState(State state){
        this.state = state;
    }
    public State getState(){
        return state;
    }
    public StateContext(State state){
        this.state = state;
    }
}
