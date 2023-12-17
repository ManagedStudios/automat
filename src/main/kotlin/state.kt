
class State(private val isEndState: Boolean) {

    private var charToState = hashMapOf<Char, State>()

    fun isCharValid (char: Char): Boolean {
       return charToState.containsKey(char)
    }

    fun getStateFromChar (char: Char): State? {
        return charToState[char]
    }

    fun isEndState (): Boolean {
        return isEndState
    }

    fun setCharToSet (charToState: HashMap<Char, State>) {
        this.charToState = charToState
    }
}