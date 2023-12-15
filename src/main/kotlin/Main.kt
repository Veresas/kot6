fun main(args: Array<String>) {

    var starEnd = "";
    var flug = true;
    val train = Train()

    do {
        print("Составить поезд (s) или закончить работу (e): ")
        starEnd = readln();

        if(starEnd == "s"){

            val direction = creatDirection()
            val tiket = (5..201).random()
            train.setTiket(tiket)
            train.setDirection(direction)
            train.creat()
            train.send()
            println()
        }else if(starEnd == "e"){

            flug = false;
        }else{
            println("Введена неверная буква");

        }
    } while (flug)
}

fun creatDirection(): Pair<String,String> {
    var startPoint = "";
    var endPoint = "";
    var direction = Pair<String,String>("","")
    var way = listOf("Москва","Питер","Барнваул","Магадан","Челябинск","Махачкала","Екатиринбург",
            "Тамбов","Сочи","Сухум","Кронштадт","Великий Новгород","Нижний Новгород","Ростов-на-Дону","Мурманск");

        startPoint = way.random()
        endPoint = way.random()
        while(startPoint == endPoint){
            endPoint = way.random()
        }
        direction = Pair(startPoint,endPoint)

    return direction

}


