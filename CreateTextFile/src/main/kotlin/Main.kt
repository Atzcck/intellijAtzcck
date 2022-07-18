import java.io.File

fun main(args: Array<String>) {
    var startBit : Boolean = false
    var exitBit :Boolean = false

    var start = readln()
    if (start == "START" || start == "start") {
        startBit = true

        val fileName = "data.txt"

        var file = File(fileName)

        // create a new file
        val isNewFileCreated :Boolean = file.createNewFile()

        if(isNewFileCreated){
            println("$fileName is created successfully.")
        } else{
            println("$fileName already exists.")
        }

        val isFileCreated :Boolean = file.createNewFile()

        if(isFileCreated && startBit ){
            println("$fileName is created successfully.")
        } else{
            println("$fileName already exists.")
        }
    }

    var exit = readln()
    if (exit == "EXIT" || start == "exit") {
        exitBit = true
    }

}





