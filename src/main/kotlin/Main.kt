fun main(args: Array<String>) {

    val st3 = State(isEndState = true)
    val st2 = State(isEndState = false)
    val st1 = State(isEndState = false)
    st1.setCharToSet(hashMapOf('a' to st2))
    st2.setCharToSet(hashMapOf('b' to st2, 'a' to st3))

    val string = "abbbbab"

    println(isCorrectString(string, st1))
}

fun isCorrectString (string: String, startState: State): Boolean {
    var currState = startState
    for (char in string) {
        if(currState.isCharValid(char)) {
            currState = currState.getStateFromChar(char)!!
        } else {
            return false
        }
    }
    return currState.isEndState()
}